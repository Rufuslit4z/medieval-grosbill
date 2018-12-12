<#import "/spring.ftl" as spring/>
<#include "../general/header.ftl">

<div class="conteneur">
    <div class="center-contenu">
        <h1>S'inscrire</h1>
        <br>
        <form action="/registration" method="POST">

        <#if postresult??>
			<#list postresult.getAllErrors() as e>
        	<div>
                <!-- <label> getObjectName=${e.getObjectName()}</label>
        		<label> rejectedValue=${e.rejectedValue}</label>
        		<label> field=${e.field}</label>
        		-->
        		<#if e.getCode()?? && e.getCode() = "Empty.userForm.username">
        			<label>*Le champ doit être renseigné</label>
				<#elseif e.getCode()?? && e.getCode() = "Size.userForm.username">
  					<label>*Le nom d'utilisateur doit contenir 4 à 32 caractères</label>
				<#elseif e.getCode()?? && e.getCode() = "Empty.userForm.email">
        			<label>*Le champ doit être renseigné</label>
				<#elseif e.getCode()?? && e.getCode() = "Misspelling.userForm.email">
        			<label>*L'adresse email est incorrecte</label>
				<#elseif e.getCode()?? && e.getCode() = "Empty.userForm.password">
        			<label>*Le champ doit être renseigné</label>
				<#elseif e.getCode()?? && e.getCode() = "Size.userForm.password">
        			<label>*Le mot de passe doit contenir au moins 8 caractères</label>
				<#elseif e.getCode()?? && e.getCode() = "Misspelling.userForm.password">
        			<label>*Le mot de passe doit contenir au moins une lettre minuscule, une majuscule, un chiffre et un caractàre spécial</label>
				</#if>
            </div>
			</#list>
		</#if>

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
</div>

<script src="<@spring.url '/javascript/valid_register.js'/>"></script>