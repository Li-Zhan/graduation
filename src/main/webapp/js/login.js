//刷新验证码
  $('#imgValidate').css('src',"/graduation/code.jsp?"+new Date());
  function refresh(){
	 document.getElementById("imgValidate").src="/graduation/code.jsp?"+new Date();
  }

  $(function() {
	  
	$('#imgValidate_a').click(function () {
		refresh();
		return false;
	});
	
	//失去焦点进行查询账户
	$('#user-account').blur(function() {
		var account=$('#user-account').val().trim();
		if(account==null||account==''){
			return;
		}
		$.ajax({
			url:'/graduation/userController/isuser',
			dataType:'json',
			type:'post',
			data:{
				account:account
			},
			success:function(result){
				var accountParent=$('#user-account').parent();
				if(result==true){
					accountParent.removeClass('am-form-error');
					accountParent.addClass('am-form-success');
					$('#user-account').css('border-color','#5eb95e');
				}else{
					accountParent.removeClass('am-form-success');
					accountParent.addClass('am-form-error');
					$('#user-account').css('border-color','#dd514c');
				}
			}
		});
	});
	
	//登录
	$(document).keyup(function(event){
		if(event.keyCode ==13){
			var account=$('#user-account').val().trim();
	 		var password=$('#user-password').val().trim();
	 		var randStr=$('#randStr').val().trim();
	 		if(account==''||password==''||randStr==''){
	 			return;
	 		}
	 		login(account,password,randStr);
		}
	});
 	$('#login_btn').click(function() {
 		var account=$('#user-account').val().trim();
 		var password=$('#user-password').val().trim();
 		var randStr=$('#randStr').val().trim();
 		if(account==''||password==''||randStr==''){
 			return;
 		}
 		login(account,password,randStr);
	}); 
 	function login(account,password,randStr) {
 		$.post("/graduation/userController/login", { 
			account: account,
			password: password,
			randStr: randStr
			},
			   function(data){
			     if(data=="randStrError"){
			    	 $('#randStr').css('border-color','#dd514c');
			    	 refresh();
			     }else if(data=='passwordError'){
			     	 $('#user-password').popover({
						theme: 'danger sm',
					    content: '密码错误'
					 });
					 $('#user-password').popover('open');
			    	 $('#user-password').parent().addClass('am-form-error');
			    	 $('#user-password').css('border-color','#dd514c');
			     }else{
			    	 if($('#remember-me').is(':checked')){
		    			var account=$('#user-account').val().trim();
		    			var password=$('#user-password').val().trim();
			 			setCookie('account',getAES(account),7);
			            setCookie('password',getAES(password),7);
			  		}
			    	 window.location.href=data;
			     }
			   }, "text");
	}
 	//账号密码回现
	showup();
 	function showup(){
 		if(getCookie('account')!=null&&getCookie('account')!=''){
 	        $('#user-account').val(getDAes(getCookie('account')));
 	    }

 	    if(getCookie('password')!=null && getCookie('password')!=''){
 	       $('#user-password').val(getDAes(getCookie('password')));
 	    }
 	    
 	    $('#remember-me').attr('checked', false);
 	}
 	
 	//得到通知
  	$.get('/graduation/informController/getSubInform',{
  		pageNum:'1',
  		pageSize:'6',
  		navigatePages:'1'
  	},function(data){
 		for(var i=0;i<6;i++){
 			var a=$('<a>').attr('href','#').addClass('am-text-truncate');
 			a.append($('<span>').text(data.list[i].informTitle));
 			a.append($('<span>').text(getMyDate(data.list[i].createDate)));
 			a.append($('<span>').text(data.list[i].informId).css('display','none'));
 			a.on('click',function(){
 				$.get('/graduation/informController/getSubInformById',{
 					'informId':$(this).find('span').eq(2).text()
	 				},function(data){
	 					$('#model_body').html(data.informBody);
	 				});
	 			$('#inform-modal').modal({width:'600px'});
 				$('#inform-modal').modal('open');
 				return false;
 			});
 			var li=$("#inform_ul").append($('<li>').append(a));
 		}
 	});
 	
 	//得到下载列表
  	$.get('/graduation/downController/getSubDown',{
  		pageNum:'1',
  		pageSize:'6',
  		navigatePages:'1'
  	},function(data){
 		for(var i=0;i<6;i++){
 			var a=$('<a>').attr('href','#').addClass('am-text-truncate');
 			a.append($('<span>').text(data.list[i].downTitle));
 			a.append($('<span>').text(getMyDate(data.list[i].createDate)));
 			a.append($('<span>').css('display','none').text(data.list[i].downPath));
 			var fileName=data.list[i].downPath;
 			if(fileName!=null&&fileName!=''){
 			  a.attr('href',encodeURI('/graduation/downController/downloadResource?fileName='+fileName));
 			}
 			var li=$("#down_ul").append($('<li>').append(a));
 		}
 	});
 	
  });