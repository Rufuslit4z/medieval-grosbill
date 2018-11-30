<#import "/spring.ftl" as spring/>

<h1>${pageName}</h1>

<form method="POST">
	<div id="userPart">
		<label for="username">Username :
			<input id="username" name="username" type="text">
		</label>
	</div>
	<div id="emailPart">
		<label for="email">Email :
			<input id="email" name="email" onchange="validateEmail()" type="text">
		</label>
	</div>
	<div id="passwordPart">
		<label for="password">Password :
			<input id="password" name="password" onChange="validatePassword()" type="password">
		</label>
	</div>
	<div id="confirmPasswordPart">
		<label for="confirmPassword">Confirm password :
			<input id="confirmPassword" name="confirmPassword" onChange="validatePassword()" type="password">
		</label>
	</div>
	<input type="submit" value="Submit">
</form>

<script>
	function validateEmail(){
		if((/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/).test(document.getElementById("email").value) == false){
			var emailError = document.createElement("p");
			emailError.setAttribute('id','emailError');
			var text = document.createTextNode("*L'adresse email est incorrecte !");
			emailError.style.color = '#EE0000';
			emailError.appendChild(text)
			document.getElementById("emailPart").appendChild(emailError);
		} else {
			document.getElementById('emailError').remove();
		}
	}
	
	function validatePassword(){
		if(document.getElementById("password").value != document.getElementById("confirmPassword").value){
			password.style.border = '1px solid #EE0000';
			confirmPassword.style.border = '1px solid #EE0000';
			
			var passwordError = document.createElement("p");
			var text = document.createTextNode("*Les mot de passes sont différents");
			passwordError.style.color = '#EE0000';
			passwordError.appendChild(text)
			document.getElementById("confirmPasswordPart").appendChild(passwordError);
		} else {
			password.style.border = '1px solid #ccc';
			confirmPassword.style.border = '1px solid #ccc';
		}
		
		var regexp1 = new RegExp('[!@#$%^&*(),.?":{}|<>]+[A-Za-z0-9]+','g');
		var regexp2 = new RegExp('[A-Za-z0-9]+[!@#$%^&*(),.?":{}|<>]+','g');
		if(regexp1.test(document.getElementById("password").value) == false || regexp2.test(document.getElementById("password").value) == false){
			var passwordError = document.createElement("p");
			var text = document.createTextNode("*Votre mot de passe doit contenir au moins une lettre majuscule et minuscule ainsi qu'un caractère spécial tel que [!@#$%^&*(),.?\":{}|<>]");
			passwordError.style.color = '#EE0000';
			passwordError.appendChild(text)
			document.getElementById("passwordPart").appendChild(passwordError);
		}
	}
</script>