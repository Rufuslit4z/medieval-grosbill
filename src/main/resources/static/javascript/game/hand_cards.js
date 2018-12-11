function handCardsPlacement(handId) {
    // Declaration variable
    var hand = document.getElementById(handId);
    var nb = hand.children.length - 1;
    var tab = [];
    var isPair;

    // Initialisation des variables
    for (var i = 0; i < hand.children.length - 1; i++)
        tab.push(hand.children[i]);
    (nb % 2 != 0) ? isPair=false : isPair=true;


    if (isPair) {
        var coef = (nb / 2) * -1;
        for (var i=0; i < tab.length; i++) {
            // Rotation of card
            tab[i].style.transform = "rotateZ("+ ((10*coef) + 5) + "deg)";
            // Position of card
            if (coef < 0) {
                tab[i].style.left = "calc(((100% - 110px)/ 2) - "+ ((20*coef*-1) - 20) +"px)";
                tab[i].style.bottom = 3*coef + "px";
            } else {
                tab[i].style.left = "calc(((100% - 110px)/ 2) + "+ 20*coef +"px)";
                tab[i].style.bottom = (-3 + (-3*coef)) + "px";
            }
            coef++;
        }
    } else {
        var coef = ((nb - 1)/ 2) * -1 ;
        for (var i=0; i < tab.length; i++) {
            // Rotation of card
            tab[i].style.transform = "rotateZ("+ 10*coef + "deg)";
            // Position of card
            if (coef < 0) {
                tab[i].style.left = "calc(((100% - 110px)/ 2) - "+ (20*coef*-1) +"px)";
                tab[i].style.bottom = 3*coef + "px";
            } else {
                tab[i].style.left = "calc(((100% - 110px)/ 2) + "+ (20*coef) +"px)";
                tab[i].style.bottom = -3*coef + "px";
            }
            coef++;
        }
    }
}
handCardsPlacement("hand_p0");
handCardsPlacement("hand_p1");
handCardsPlacement("hand_p2");
handCardsPlacement("hand_p3");

///////////////////////////////////////////////////////////////
// 						  Drag'n'Drop						 //
///////////////////////////////////////////////////////////////
var drop = document.querySelector('body');

// Autorise le drop sur chaque élément du plateau
drop.addEventListener('dragover', function(e) {
    e.preventDefault();
});
// Vérifie l'endroit du drop
drop.addEventListener('drop', function(e) {
    if (e.target.className !== "card" && e.target.className !== "hand") {
        // Mettre en jeu une carte
    }
});

drop.addEventListener('dragstart', function(e) {
    e.target.style.transform="scale(2)";
    console.log('yes ' + e.target.className);
}, false);

































