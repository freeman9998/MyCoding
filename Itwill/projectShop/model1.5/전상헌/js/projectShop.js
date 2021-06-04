function login() {
		if (f.userId.value == "") {
			alert("사용자 아이디를 입력하십시요.");
			f.userId.focus();
			return false;
		}
		if (f.password.value == "") {
			alert("비밀번호를 입력하십시요.");
			f.password.focus();
			return false;
		}
		
		f.action = "login_action_do";
		f.submit();
	}
	
	function userCreate() {
		if (document.f.userId.value == "") {
			alert("사용자 아이디를 입력하십시요.");
			f.userId.focus();
			return false;
		}
		if (f.password.value == "") {
			alert("비밀번호를 입력하십시요.");
			f.password.focus();
			return false;
		}
		if (f.password2.value == "") {
			alert("비밀번호확인을 입력하십시요.");
			f.password2.focus();
			return false;
		}
		if (f.name.value == "") {
			alert("이름을 입력하십시요.");
			f.name.focus();
			return false;
		}
		if (f.email.value == "") {
			alert("이메일 주소를 입력하십시요.");
			f.email.focus();
			return false;
		}
		if (f.password.value != f.password2.value) {
			alert("비밀번호와 비밀번호확인은 일치하여야합니다.");
			f.password.focus();
			f.password.select();
			return false;
		}
		f.action = "user_write_action.do";
		f.method='POST';
		f.submit();
	}

	function userList() {
		f.action = "user_list.do";
		f.submit();
	}
	
	
		function userModifyAction() {
		if(f.password2.value!=f.password.value){
			alert("비밀번호와 비밀번호 확인이 일치해야 합니다");
			return;
			
		}
		
		f.action = "user_modify_action.do";
		f.submit();
	}
	function userList() {
		f.action = "user_list.do";
		f.submit();
	}
	function userList() {
		f.action = "user_list.do";
		f.submit();
	}

	function userModify() {
		f.action = "user_modify_form.do";
		f.submit();
	}

	function userRemove() {
		if (confirm("정말 삭제하시겠습니까?")) {
			f.action = "user_remove_action.do";
			f.submit();
		}
	}
	
function cart_delete(){
		document.delete_cart_form.method='POST';
		document.delete_cart_form.action='cart_delete_action.do';
		document.delete_cart_form.submit();
	}
function view_cart_form_submit(){
		document.view_cart_form.method='POST';
		document.view_cart_form.action='jumun_create_form.do';
		document.view_cart_form.submit();
	}
      function jumun_create_form_submit(){
    	  document.jumun_create_form.method='POST';
    	  document.jumun_create_form.action='jumun_create_action.do';
    	  document.jumun_create_form.submit();
      }	