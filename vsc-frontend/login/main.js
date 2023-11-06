//  LOGIN
// pass login
const pinCorretto = 1211;
const login_container = document.getElementById("login_container");
const login = document.getElementById("login");
const home_container = document.getElementById("home_container");
// bottoni
const btn_home = document.getElementById("btn_home");
const btn_deposito = document.getElementById("btn_deposito");
const btn_prelievo = document.getElementById("btn_prelievo");
const btn_out = document.getElementById("btn_out");
// 
const card = document.getElementById("out_screen");
const card_saldo = document.getElementById("saldo");
const card_deposito = document.getElementById("deposito");
const card_prelievo = document.getElementById("prelievo");
// funzione che controlla quando premi enter
login.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        //fa partire la funzione
        controllaPin();
    }
});
// funzione che controlla il pin con input utente
function controllaPin(){
    const login = document.getElementById("login");
    let pin = login.value;
    if (pin === "1211") {
        console.log("pin corretto");
        //mostra home e nasconde il login
        login_container.classList.remove("login-container");
        login_container.classList.add("hidden");
        console.log("ho tolto il login");
        home_container.classList.remove("hidden");

    } else {
        console.log("pin errato");
        location.href = "/denied.html";
    }
}

btn_home.addEventListener("click", pressBtnHome)
function pressBtnHome(){
    // const card = document.getElementById("out_screen");
    console.log("click home");
    card_saldo.classList.remove("hidden")
    card_deposito.classList.add("hidden");
    card_prelievo.classList.add("hidden");
}
btn_deposito.addEventListener("click", pressBtnDeposito)
function pressBtnDeposito(){
    // const card = document.getElementById("out_screen");
    console.log("click deposito");
    card_deposito.classList.remove("hidden");
    card_saldo.classList.add("hidden")
    card_prelievo.classList.add("hidden");
}
btn_prelievo.addEventListener("click", pressBtnPrelievo)
function pressBtnPrelievo(){
    // const card = document.getElementById("out_screen");
    console.log("click prelievo");
    card_prelievo.classList.remove("hidden");
    card_deposito.classList.add("hidden");
    card_saldo.classList.add("hidden")
}
btn_out.addEventListener("click", pressBtnOut)
function pressBtnOut(){
    // const card = document.getElementById("out_screen");
    console.log("click out");
    home_container.classList.add("hidden");
    login_container.classList.remove("hidden");
}



