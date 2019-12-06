$(function(){
	//
	//设置密码只含字母数字而且不少于6位数		
	function testPwd () {
		var reg = /^[a-zA-Z0-9]{6,18}$/;
		var value = $("#password").val();
				if(!(reg.test(value))){
					$("#password").siblings("i").text("*请重新输入6位以上的密码！");
					$("#password").val("");
					return false ;
				}else{
					$("#password").siblings("i").text("");
					return true ;
				}
				if (value == "") {
					$("#password").siblings("i").text("*密码不能为空！");
				}
	}
	//验证邮箱是否合法邮箱
	function testEmail(){
		var reg = /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.)+(com)$|(net)$|(cn)$/;
		var value = $("#email").val();
		if(!(reg.test(value))){
				$("#email").siblings("i").text("*请重新输入正确邮箱！");
				$("#email").val("");
				return false ;
			}else{
					$("#email").siblings("i").text("");
					return true ;
				}
			if (value == "") {
					$("#email").siblings("i").text("*邮箱不能为空！");
				}
	}
	//验证手机号是否合法
	function testPhone(){ 
		var reg = /^1[34578]\d{9}$/
	    var value = $("#phone").val()
	    if(!(reg.test(value))){ 
	        $("#phone").siblings("i").text("*请重输入正确的手机号码！");
	        $("#phone").val("");
	        return false ;
	    } else{
					$("#phone").siblings("i").text("");
					return true ;
				}
	    if (value == "") {
					$("#phone").siblings("i").text("*手机号不能为空！");
				}
	}
	//验证密码是否一致
	function testConpwd(){
		var pwd = $("#password").val();
		var con_pwd = $("#con_password").val();
		if (pwd != con_pwd) {
			$("#con_password").siblings("i").text("*您输入的密码不一致！请重新输入。");
			$("#con_password").val("");
			return false ;
		}else{
			$("#con_password").siblings("i").text("");
			return true ;
		}
	}
	//检查是否同意协议
	function testTick(){
		var src = $("form .tick").attr("src");console.log(src);
		if (src == "img/no_tick.png") {
			$("form .tick").siblings("i").text("*阅读并同意该协议！");
			return false ;
		}else{
			$("form .tick").siblings("i").text("");
			return true ;
		}
	}
	//当打钩则取消提示
	$("form .tick").click(function(){
		testTick();
	})
		//检查该用户是否已经被注册
	function checkUser(username){
		var username = $("#username").val();
		if (username == "") {
			$("#username").siblings("i").text("*请输入用户名。");
			return false;
		} else{
			$("#username").siblings("i").text("");
			return true ;
		}
	}

	$("#username").blur(function () {
		var username = $("#username").val();
		$.ajax({
			data:"username="+username,
			type:"post",
			url:"/checkUsername",
			success:function (data) {
				if(data.length>0){
					$("#username").siblings("i").text("该用户已被注册！");
					$("#username").val("");
				}else{
					$("#username").siblings("i").text("");
				}
			}
		});
	});

	$("form .tick").siblings("small").click(function(){
		var src = $("form .tick").attr("src");
		var src1 = "img/no_tick.png";
		var src2 = "img/tick.png";
		if (src == src1) {
			$("form .tick").attr("src",src2);
		} else{
			$("form .tick").attr("src",src1);
		}
		testTick();
	})
	
	//当input失去焦点执行
	$("#username").blur(function(){
		checkUser(username);
	});
	$("#password").blur(function(){
		testPwd();
	});
	$("#email").blur(function(){
		testEmail();
	})
	$("#phone").blur(function(){
		testPhone();
	})
	$("#con_password").blur(function(){
		testConpwd();
	})
	$("#submit").click(function(){
		if (checkUser() && testTick() && testPwd() && testConpwd() && testEmail() && testPhone()) {
			$.ajax({
				url:"/register",
				data:$("#registerForm").serialize(),
				type:"post",
				success:function (data) {
					if(data.length>0){
						alert(data);
					}else{
						alert("注册成功！");
						location.href="/toLogin";
					}
				}
			})
		}
	})
	// //提交表单同时把用户信息保存到本地存储
	// function submitForm(){
	// var username = $("#username").val();
	// var password = $("#password").val();
	// var userInfo = {
	// 	username:username,
	// 	password:password
	// }
	// //setUserInfoStorage(userInfo)
	// }

})



//设置本地存储
// function setUserInfoStorage(userInfoObj){
// 	var userData = getUserData("userInfos");
// 	if(!userData){
// 		var userInfo = [
// 			userInfoObj
// 		];
// 		localStorage.setItem("userInfos",JSON.stringify(userInfo))
// 	}else{
// 		var data = JSON.parse(userData);
// 		data.push(userInfoObj);
// 		localStorage.setItem("userInfos",JSON.stringify(data));
// 	}
// }
// function getUserData(userKey){
// 	return localStorage.getItem(userKey)
// }