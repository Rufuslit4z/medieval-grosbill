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