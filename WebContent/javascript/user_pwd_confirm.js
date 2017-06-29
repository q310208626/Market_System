/**
 * 
 */
 var textField_pwd_old=document.getElementById("old_pwd");
 var textField_pwd_new=document.getElementById("new_pwd");
 var textField_pwd_conf=document.getElementById("comfnew_pwd");
 
 
 /*判断密码是否相同*/
  function cmpPwd(){
	  var newPwd=textField_pwd_new.value;
	  var newComfPwd=textField_pwd_conf.value;
	  if(newPwd==newComfPwd){
		  return true;
	  }
	  return false;
  }
  
  /*验证密码并提交*/
  function valiAndPost(){
	  var oldPwd=textField_pwd_old.value;
	  var newPwd=textField_pwd_new.value;
	  var newComfPwd=textField_pwd_conf.value;
	  if(oldPwd==""){
		  alert("旧密码为空");
		  textField_pwd_old.focus(); 
		  return false;
	  }
	  if(newPwd==""){
		  alert("新密码为空");
		  textField_pwd_new.focus();
		  return false;
	  }
	  if(newComfPwd==""){
		  alert("确认密码为空");
		  textField_pwd_conf.focus(); 
		  return false;
	  }
	  
	  if(!cmpPwd()){
		  alert("密码不一致");
		  textField_pwd_conf.focus(); 
		  return false;
	  }
	  
	  return true;
  }