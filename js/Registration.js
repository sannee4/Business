alert("Ready");
//

const mailInput = document.getElementById("email");
const mailErr = document.getElementById("mailErr");

mailInput.oninput = function(){

    let regExp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if (!regExp.test(mailInput.value)) {
        mailErr.style.display = "block";
    } else {
        mailErr.style.display = "none";
    }

    buttonEnable();
};

const passInput = document.getElementById("password");
const passConfirm = document.getElementById("passwordConfirm");
const passErr = document.getElementById("passErr");

passInput.oninput = function(){

    let regExp = /^(?=.*[0-9])(?=.*[a-zA-Z])[a-zA-Z0-9]{8,32}$/g;

    if (!regExp.test(passInput.value)) {
        passErr.style.display = "block";
    } else {
        passErr.style.display = "none";
    }
    buttonEnable();
};

const buttonSend = document.getElementById("register");
const passErrorSpan = document.getElementById("passwordError");

function buttonEnable() {

    buttonSend.disabled = passErr.style.display === "block" ||
        mailErr.style.display === "block" &&
        passInput.value() === passConfirm.value();
}