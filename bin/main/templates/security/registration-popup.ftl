<#import "/spring.ftl" as spring/>

<div id="register" class="popup">
    <div class="closebis">
        <a href="#" class="close" onclick="document.getElementById('register').style.display='none';">+</a>
    </div>

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


<script src="<@spring.url '/javascript/valid_register.js'/>"></script>