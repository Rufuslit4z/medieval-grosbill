<form action="/registration" method="POST">
    <div>Username</div>
    <input type="text" name="username" value="">
    
    <div>Email</div>
    <input id="email" type="text" name="email" onkeypress="validateEmail()" value="">
    <p id="emailError" hidden>*L'adresse email n'est pas valide</p>
        
    <div>Password</div>
    <input id="password" type="password" name="password" onkeypress="validatePassword()" value="password">
    <p id="passwordError" hidden>*Le mot de passe doit contenir au minimum: une majuscule et minuscule, un chiffre et un caractère spécial</p>
    <p id="passwordLength" hidden>*Le mot de passe doit contenir au moins 8 caractères</p>
    
    <div>Password confirm</div>
    <input id="passwordConfirm" type="password" name="passwordconfirm" onkeypress="validatePassword()" value="password">
    <p id="passwordConfirmError" hidden>*Les saisies sont différentes</p>
    
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Register"></div>
</form>

<script>

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
			document.getElementById("passwordError").style.color = 'red';
			document.getElementById("passwordError").hidden = false;
			console.log(document.getElementById("password").value);
		} else {
			document.getElementById("passwordError").hidden = true;
			console.log(document.getElementById("password").value);
		}
		
		if(document.getElementById("password").value != document.getElementById("passwordConfirm").value){
			document.getElementById("passwordConfirmError").style.color = 'red';
			document.getElementById("passwordConfirmError").hidden = false;
		} else {
			document.getElementById("passwordConfirmError").hidden = true;
		}
		
		if(document.getElementById("password").value.length < 7 || document.getElementById("password").value == ""){
			document.getElementById("passwordLength").style.color = 'red';
			document.getElementById("passwordLength").hidden = false;
		} else {
			document.getElementById("passwordLength").hidden = true;
		}
	}

</script>