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
var drop = document.getElementById('handDropZone');
var drag = document.getElementById('main-hand');
var hand = document.getElementById('hand_p0');
var mainCard = document.getElementById('main-cards');
var c; //Copie de l'element drag

// Autorise le drop sur chaque élément du plateau
drop.addEventListener('dragover', function(e) {
    e.preventDefault();
});

// Vérifie l'endroit du drop
drop.addEventListener('drop', function(e) {
    if (e.target.className !== "card" && e.target.className !== "hand") {
        // Mettre en jeu une carte
        console.log(e.dataTransfer.getData('id'));
        var card = document.createElement('div');
        card.id = e.dataTransfer.getData('id');
        card.className = "card";
        mainCard.appendChild(card);
        hand.removeChild(document.getElementById('select'));
        handCardsPlacement("hand_p0");
        c.style.display = "none";
        hideDropZone();

    }
});

// Initialise le drag pour la main
drag.addEventListener('dragstart', function(e) {
    e.target.id = "test";
    e.dataTransfer.setData("id", e.target.id);
    e.target.parentNode.id = "select";

    // Créer une copie pour l'afficher à côté
    c = e.target.cloneNode(true);
    c.style.width = "250px";
    c.style.height = "370px";
    c.style.position = "absolute";
    c.style.top = "calc((100% - 370px)/ 2)";
    c.style.right = "50px";
    document.body.appendChild(c);

}, false);

drag.addEventListener('dragend', function(e) {
    c.style.display = "none";
}, false);


function displayDropZone() {
    document.getElementById('handDropZone').className = "handDropZoneHover";
};
function hideDropZone() {
    document.getElementById('handDropZone').classList.remove('handDropZoneHover');
};






























