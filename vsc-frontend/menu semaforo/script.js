// es 1
// console.log("ciao beluuu");

//---------------------------------------------------------------------------------------------------------------
// es 2
// var nome = prompt("inserisci il tuo nome");
// alert("Ciao " + nome);
//---------------------------------------------------------------------------------------------------------------

// es 3
// alert("benvenuto nella calcolatrice");
// var n1 = parseFloat(prompt("inserisci il primo numero"));
// var n2 = parseFloat(prompt("inserisci il secondo numero"));

// if(n1 != isNaN() && n2 != isNaN()){  // <--soluzione mia //soluzione gpt  --> if (!isNaN(n1) && !isNaN(n2)) {
//     console.log("è un numero");
//     var somma;
//     var operazione = prompt("scegli tra + , - , * , /");
//     switch (operazione) {
//         case "+":
//             somma = n1 + n2;
//             break;
//         case "-":
//             somma = n1 - n2;
//             break;
//         case "*":
//             somma = n1 * n2;
//             break;
//         case "/":
//             somma = n1 / n2;
//             break;
//         default:
//             alert("Operazione non valida");
//     }

// }else{
//     console.log("non è numero");
// }
// alert(somma);
//---------------------------------------------------------------------------------------------------------------

// es 4
// const numeri = [1,2,3,4,5]
// function somma(numeri){
//     var somma=0;
//     for (let i = 0; i < numeri.length; i++) {
//         somma += numeri[i];
//     }
//     return somma;
// }

// let risultato = somma(numeri);
// alert(risultato);
//---------------------------------------------------------------------------------------------------------------

// es 5
// const automobile = {
//     marca,
//     modello,
//     alimentazione,

//     automobile(marca, modello, alimentazione){
//         this.marca = marca;
//         this.modello = modello;
//         this.alimentazione = alimentazione;
//     }
// }

// italiana = new automobile();
// tedesca = new automobile();
// giapponese = new automobile();

// italiana.marca("fiat")
// italiana.modello("panda")
// italiana.alimentazione("metano")

// tedesca.marca("bmw")
// tedesca.modello("120i")
// tedesca.alimentazione("benzina")

// giapponese.marca("toyota")
// giapponese.modello("supra")
// giapponese.alimentazione("benzina")

// const arrayAutomobili = [ italiana, tedesca, giapponese];

// print(arrayAutomobili);
// funzione .filter
//RIFATTO----RIFATTO----RIFATTO----RIFATTO----RIFATTO----RIFATTO----RIFATTO----RIFATTO----RIFATTO
// const automobili = [
//     { marca: "Audi", modello: "A4", alimentazione: "benzina" },
//     { marca: "BMW", modello: "X5", alimentazione: "diesel" },
//     { marca: "Toyota", modello: "Corolla", alimentazione: "ibrida" },
//     { marca: "Volkswagen", modello: "Golf", alimentazione: "benzina" },
//     { marca: "Ford", modello: "Focus", alimentazione: "diesel" },
//     { marca: "Tesla", modello: "Model 3", alimentazione: "elettrico" },
//     { marca: "Fiat", modello: "Panda", alimentazione: "gpl" },
//     { marca: "Renault", modello: "Clio", alimentazione: "metano" },
//     { marca: "Hyundai", modello: "Kona", alimentazione: "elettrico" },
//     { marca: "Nissan", modello: "Qashqai", alimentazione: "diesel" },
// ];

// var benzina = [];
// var diesel = [];
// var elettriche = [];

// for(const automobile of automobili){
//     if(automobile.alimentazione === "benzina"){
//         benzina.push(automobile);
//     }else if(automobile.alimentazione === "diesel"){
//         diesel.push(automobile);
//     }else{
//         elettriche.push(automobile);
//     }
// }
// console.log("automobili a benza");
// console.log(benzina);
// console.log("automobili a diesel" + diesel);
// console.log("automobili a elettr" + elettriche);

// ESEMPIO VALERIO
// let autoBenzina = automobili.filter(singolaAuto => singolaAuto.Alimentazione == "Benzina")
// console.log(autoBenzina);
// let autoDiesel = automobili.filter(singolaAuto => singolaAuto.Alimentazione == "Diesel")
// console.log(autoDiesel);
// let autoElettriche = automobili.filter(singolaAuto => singolaAuto.Alimentazione == "Elettrico")
// console.log(autoElettriche);
//---------------------------------------------------------------------------------------------------------------

// es 6
// const nomi = ["Pippo", "PLUTO", "GIgio", "PaPeRoNe"];
// console.log(nomi);
// const nomiOK = nomi.map(nome => {
//     // Converti la prima lettera in maiuscolo e il resto in minuscolo
//     return nome.charAt(0).toUpperCase() + nome.slice(1).toLowerCase();
// });

// console.log(nomiOK);

//---------------------------------------------------------------------------------------------------------------
// CAMBIA COLORE 
// es 7

console.log("ciao");
// costanti per mappare tasti 
// 3 tasti colore
const btnR = document.getElementById("red");
const btnY = document.getElementById("yellow");
const btnG = document.getElementById("green");
// tasti menu
const btnHamburger = document.getElementById("hamburger");
const btnHamburgerClose = document.getElementById("hamburgerClose");

btnR.addEventListener("click", colorRED);
btnY.addEventListener("click", colorYELLOW);
btnG.addEventListener("click", colorGREEN);
btnHamburger.addEventListener("click", openMenu)
btnHamburgerClose.addEventListener("click", closeMenu);


// funzioni che fanno cambiare colore al riquadro centrale
function colorRED(){
    const divColor = document.getElementById("colorOnDisplay");
    console.log("click rosso");
    divColor.classList.remove("colorOnDisplayYELLOW","colorOnDisplayGREEN")
    divColor.classList.add("colorOnDisplayRED"); 
}
function colorYELLOW(){
    const divColor = document.getElementById("colorOnDisplay");
    console.log("click giallo");
    divColor.classList.remove("colorOnDisplayRED","colorOnDisplayGREEN")
    divColor.classList.add("colorOnDisplayYELLOW");
}
function colorGREEN(){
    const divColor = document.getElementById("colorOnDisplay");
    console.log("click verde");
    divColor.classList.remove("colorOnDisplayYELLOW","colorOnDisplayRED")
    divColor.classList.add("colorOnDisplayGREEN");
}
//---------------------------------------------------------------------------------------------------------------
// funzioni che aprono e chiudono menu
// apre menu mobile e fa sparire icona apertura
function openMenu(){
    const myMenu = document.getElementById("navMobile");
    console.log("aperto");
    myMenu.classList.remove("hidden")
    btnHamburgerClose.classList.remove("hidden");
    btnHamburger.classList.add("hidden");
}
// chiude menu mobile e fa sparire icona chiusura
function closeMenu(){
    const myMenu = document.getElementById("navMobile");
    console.log("chiuso");
    myMenu.classList.add("hidden")
    btnHamburger.classList.remove("hidden");
    btnHamburgerClose.classList.add("hidden");

}


