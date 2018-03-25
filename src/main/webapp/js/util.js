	//封装cookie
 	function setCookie(name,value,iDay){
 	    var oDate=new Date();
 	    oDate.setDate(oDate.getDate()+iDay);
 	    document.cookie=name+'='+value+';expires='+oDate;
 	}
 	//移除cookie
 	function removeCookie(name){
 	    setCookie(name, '', '-1');
 	}
 	//读取cookie
 	function getCookie(name) {
 	    var arr=document.cookie.split('; ');
 	   // var i=0;
 	    for(i=0;i<arr.length;i++){
 	        var arr2=arr[i].split('=');
 	        if(arr2[0]==name){
 	            return arr2[1];
 	        }
 	    }
 	    return '';
 	}

 	function getAesString(data,key,iv){//加密
 	    var key  = CryptoJS.enc.Utf8.parse(key);
 	    //alert(key）;
 	    var iv   = CryptoJS.enc.Utf8.parse(iv);
 	    var encrypted =CryptoJS.AES.encrypt(data,key,
 	        {
 	            iv:iv,
 	            mode:CryptoJS.mode.CBC,
 	            padding:CryptoJS.pad.Pkcs7
 	        });
 	    return encrypted.toString();    //返回的是base64格式的密文
 	}
 	function getDAesString(encrypted,key,iv){//解密
 	    var key  = CryptoJS.enc.Utf8.parse(key);
 	    var iv   = CryptoJS.enc.Utf8.parse(iv);
 	    var decrypted =CryptoJS.AES.decrypt(encrypted,key,
 	        {
 	            iv:iv,
 	            mode:CryptoJS.mode.CBC,
 	            padding:CryptoJS.pad.Pkcs7
 	        });
 	    return decrypted.toString(CryptoJS.enc.Utf8); 
 	}

 	function getAES(data){ //加密
 	    var key  = 'AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';  //密钥
 	    var iv   = '1234567812345678';
 	    var encrypted =getAesString(data,key,iv); //密文
 	    var encrypted1 =CryptoJS.enc.Utf8.parse(encrypted);
 	    return encrypted;
 	}

 	function getDAes(data){//解密
 	    var key  = 'AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA';  //密钥
 	    var iv   = '1234567812345678';
 	    var decryptedStr =getDAesString(data,key,iv);
 	    return decryptedStr;
 	}
 	
 	//格式化日期
 	function getMyDate(msec) {
		var year=new Date(msec).getFullYear();
		var month=new Date(msec).getMonth()+1;
		var day=new Date(msec).getDate();
		return year+'-'+month+'-'+day;
	}
 	

 	