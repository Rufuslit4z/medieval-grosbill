<#import "/spring.ftl" as spring/>

<div id="register" class="popup">
    <a href="#" class="close" onclick="document.getElementById('register').style.display='none';">+</a>
    <h1>S'inscrire</h1>
    <br>
    <form action="/registration" method="POST">
        <label>Nom utilisateur :</label>
        <input class="form-control" type="text" name="username" value="">

        <label>Adresse mail :</label>
        <input class="form-control" id="email" type="text" name="email" onkeyup="validateEmail()" value="">
        <p id="emailError" class="error-input" hidden>*L'adresse email n'est pas valide</p>

        <label>Mot de passe :</label>
        <input class="form-control" id="password" type="password" name="password" onkeyup="validatePassword()">
        <p id="passwordError" class="error-input" hidden>*Le mot de passe doit contenir au minimum: une majuscule et minuscule, un chiffre et un caractère spécial</p>
        <p id="passwordLength" class="error-input" hidden>*Le mot de passe doit contenir au moins 8 caractères</p>

        <label>Confirmation mot de passe :</label>
        <input class="form-control" id="passwordConfirm" type="password" name="passwordconfirm" onkeyup="validatePassword()">
        <p id="passwordConfirmError" class="error-input" hidden>*Les saisies sont différentes</p>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <br>
        <input class="btn btn-success" type="submit" value="S'inscrire">
    </form>
</div>

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
		if(regexp.test(email) && email!==""){
            document.getElementById("emailError").hidden = true;
            document.getElementById("email").className = document.getElementById("email").className.replace( /(?:^|\s)is-invalid(?!\S)/g , "" );
		} else {
            document.getElementById("emailError").hidden = false;
            document.getElementById('email').className += " is-invalid";
		}
	}
		
	function validatePassword(){
		var regexp = /(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]/g;
		var valid_regex;
		var valid_size;

		if(regexp.test(document.getElementById("password").value)){
            document.getElementById("passwordError").hidden = true;
            console.log(document.getElementById("password").value);
            valid_regex = true;
		} else {
            document.getElementById("passwordError").hidden = false;
            console.log(document.getElementById("password").value);
            valid_regex = false;
		}
		
		if(document.getElementById("password").value !== document.getElementById("passwordConfirm").value){
			document.getElementById("passwordConfirmError").hidden = false;
            document.getElementById('passwordConfirm').className += " is-invalid";
		} else {
			document.getElementById("passwordConfirmError").hidden = true;
            document.getElementById("passwordConfirm").className = document.getElementById("passwordConfirm").className.replace( /(?:^|\s)is-invalid(?!\S)/g , "" );
		}
		
		if(document.getElementById("password").value.length < 7 || document.getElementById("password").value === ""){
			document.getElementById("passwordLength").hidden = false;
			valid_size = false;
		} else {
			document.getElementById("passwordLength").hidden = true;
			valid_size = true;
		}

		if (valid_regex && valid_size) {
            document.getElementById("password").className = document.getElementById("password").className.replace( /(?:^|\s)is-invalid(?!\S)/g , "" );
        } else {
            document.getElementById('password').className += " is-invalid";
        }
	}
</script>