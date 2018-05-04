$(function() {

        var $fullText = $('.admin-fullText');
        $('#admin-fullscreen').on('click', function() {
            $.AMUI.fullscreen.toggle();
        });

        $(document).on($.AMUI.fullscreen.raw.fullscreenchange, function() {
            $fullText.text($.AMUI.fullscreen.isFullscreen ? '退出全屏' : '开启全屏');
        });

        $('.tpl-switch').find('.tpl-switch-btn-view').on('click', function() {
            $(this).prev('.tpl-switch-btn').prop("checked", function() {
                    if ($(this).is(':checked')) {
                        return false
                    } else {
                        return true
                    }
                })

        })
    })
    // ==========================
    // 侧边导航下拉列表
    // ==========================

$('.tpl-left-nav-link-list').on('click', function() {
        $(this).siblings('.tpl-left-nav-sub-menu').slideToggle(80)
            .end()
            .find('.tpl-left-nav-more-ico').toggleClass('tpl-left-nav-more-ico-rotate');
    })
    // ==========================
    // 头部导航隐藏菜单
    // ==========================

$('.tpl-header-nav-hover-ico').on('click', function() {
    $('.tpl-left-nav').toggle();
    $('.tpl-content-wrapper').toggleClass('tpl-content-wrapper-hover');
})

//禁用提交按钮(按钮id 成功信息)
function disableBtn(id,text){
	$('#'+id).text(text);
    $('#'+id).removeClass('am-btn-primary').addClass('am-disabled am-btn-danger');
}

$(function(){
	
	//点击文件上传按钮出现模态框
	$('#open_file_btn').click(function() {
	 	$.ajax({
		   url: "/graduation/lunwenController/getLunwenBySid",
		   type: 'get',
		   dataType:'json',
		   success: function(data){
			   if(!isNull(data.lunwenId)){
			   		if(!isNull(data.lunwenStatus)&&data.lunwenStatus==1){
				   		console.log(data.lunwenStatus);
						disableBtn('lunwen_uploadBtn','已审核');
						return;
			   		}
			   	   $('#lunwen_uploadBtn').removeAttr('disabled').removeClass('am-disabled am-btn-danger').addClass('am-btn-primary');
				   $('#lunwen_uploadBtn').text('更新(上次提交的论文是: '+data.lunwenName.substring(0,30)+')');
				}
		   }
		 });
		$('#file-modal').modal('open');
	});

	//显示上传文件名
	$('#doc-ipt-file-2').on(
			'change',
			function() {
				var fileNames = '';
				$.each(this.files, function() {
					fileNames += '<span class="am-badge">' + this.name
							+ '</span> ';
				});
				$('#file-list').html(fileNames);
	});
	
});

function isNull(data) {
	if(data==null||data==''||data==' '||data=='undefined'){
		return true;
	}
	return false;
}