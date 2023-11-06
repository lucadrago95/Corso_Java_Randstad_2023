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
// output della card + cambia contenuto dinamico
const card = document.getElementById("out_screen");
// home e saldo
const card_saldo = document.getElementById("saldo");
const out_saldo = document.getElementById("out_saldo");
// deposito e prelievo
// contenuto deposito
const card_deposito = document.getElementById("deposito");
// input deposito
const in_deposito = document.getElementById("in_deposito");
// contenuto prelievo
const card_prelievo = document.getElementById("prelievo");
// input prelievo
const in_prelievo = document.getElementById("in_prelievo");


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
        mostraSaldo();

    } else {
        console.log("pin errato");
        location.href = "/denied.html";
    }
}

btn_home.addEventListener("click", homeSaldo);
// piccola funzione per richiamare 2 funzioni al click del bottone home
function homeSaldo() {
    pressBtnHome();
    mostraSaldo();
}
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
// inizializzo un saldo e lo valorizzo con 2000 
// cosi ad ogni sessione ho un minimo dentro il mio saldo
var saldo = 2000;

function mostraSaldo() {
    out_saldo.textContent = saldo;
    console.log(saldo);
    // alert(saldo)
}

// funzione che controlla quando premi enter dentro la card deposito
in_deposito.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        //fa partire la funzione
        console.log("premo enter in deposito");
        incrementaSaldo();
    }
});
function incrementaSaldo() {
    let valoreDepositato = parseFloat(in_deposito.value);
    saldo += valoreDepositato;
    in_deposito.value = "";
    mostraSaldo();
    console.log("ho depositato i soldi " + valoreDepositato);
}


// funzione che controlla quando premi enter dentro la card prelievo
in_prelievo.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        //fa partire la funzione
        console.log("premo enter in deposito");
        decrementaSaldo();
    }
});

function decrementaSaldo() {
    let valorePrelevato = parseFloat(in_prelievo.value);
    saldo -= valorePrelevato;
    in_prelievo.value = "";
    mostraSaldo();
    console.log("ho prelevato i soldi " + valorePrelevato);
}


// da rimuovere alla fine 
// window.addEventListener("load", mostraSaldo);