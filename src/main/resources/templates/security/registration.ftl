<form action="/registration" method="POST">
    <div>Username</div>
    <input id="username" type="text" name="username" onkeypress="validateUsername()" value="">
    <p id="usernameError" style="color:red;" hidden>*Le nom d'utilisateur doit contenir 4 caractère minimum</p>
    
    <div>Email</div>
    <input id="email" type="text" name="email" onkeypress="validateEmail()" value="" placeholder="user@example.com">
    <p id="emailError" style="color:red;" hidden>*L'adresse email n'est pas valide</p>
        
    <div>Password</div>
    <input id="password" type="password" name="password" onkeypress="validatePassword()" value="password">
    <p id="passwordError" style="color:red;" hidden>*Le mot de passe doit contenir au minimum: une majuscule et minuscule, un chiffre et un caractère spécial</p>
    <p id="passwordLength" style="color:red;" hidden>*Le mot de passe doit contenir au moins 8 caractères</p>
    
    <div>Password confirm</div>
    <input id="passwordConfirm" type="password" name="passwordconfirm" onkeypress="validatePassword()" value="password">
    <p id="passwordConfirmError" style="color:red;" hidden>*Les saisies sont différentes</p>
    
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Register"></div>
</form>

<script>

	function validateUsername(){
		if(document.getElementById("username").value.length < 3 || document.getElementById("username").value == undefined){
			document.getElementById("usernameError").hidden = false;
			console.log(document.getElementById("username").value.length)
		} else {
			document.getElementById("usernameError").hidden = true;
			console.log(document.getElementById("username").value.length)
		}
	}
	
	function validateEmail(){
		var email = document.getElementById("email").value;
		var regexp = /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
		
		if(regexp.test(email) == false){
			document.getElementById("emailError").style.color = 'red';
			document.getElementById("emailError").hidden = false;
		} else {
			document.getElementById("emailError").hidden = true;
		}
	}
		
	function validatePassword(){
		var regexp = /(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]/g;
		
		if(regexp.test(document.getElementById("password").value) == false){
			document.getElementById("passwordError").hidden = false;
			console.log(document.getElementById("password").value);
		} else {
			document.getElementById("passwordError").hidden = true;
			console.log(document.getElementById("password").value);
		}
		
		if(document.getElementById("password").value != document.getElementById("passwordConfirm").value){
			document.getElementById("passwordConfirmError").hidden = false;
		} else {
			document.getElementById("passwordConfirmError").hidden = true;
		}
		
		if(document.getElementById("password").value.length < 7 || document.getElementById("password").value == undefined){
			document.getElementById("passwordLength").hidden = false;
		} else {
			document.getElementById("passwordLength").hidden = true;
		}
	}

</script>