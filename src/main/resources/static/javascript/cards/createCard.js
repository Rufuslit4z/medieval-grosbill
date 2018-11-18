var parent = document.getElementById('formulaire');
var form = document.getElementById('insertForm');
var formWeapon = document.getElementById('insertFormWeapon');


function insertMonsterForm() {
    form.insertAdjacentHTML('beforeend',
        '<label for="lvl">Niveau :</label> <input type="number" name="level" id="lvl" min="1" max="99"> <label for="treasure">Trésor(s) gagné(s) :</label> <input type="number" name="treasure" id="treasure" min="1" max="9"> <label for="leak">Minimum fuite :</label> <select name="leak" id="leak"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option><option value="4">4</option> <option value="5" selected>5</option> </select> <label for="malus">Action si fuite raté :</label> <select name="malus" id="malus"> <option value="">Effet 1</option> <option value="">Effet 2</option> </select>'
    );
}

function insertCurseForm() {
    form.insertAdjacentHTML('beforeend',
        '<label for="curse">Effet malédiction :</label> <select name="curse" id="curse"> <option value="">Malédiction 1</option> <option value="">Malédiction 2</option> </select>'
    );
}

function insertEquipmentForm() {
    form.insertAdjacentHTML('beforeend',
        '<label for="att">Point d\'attaque :</label> <input type="number" name="attack" id="att" min="0" max="9"> <label id="cost">Valeur pièce d\'or :</label> <input type="number" name="cost" id="cost" min="0" max="2000"> <label for="type_equip">Type d\'équipement :</label> <select name="type_equip" id="type_equip" onChange="addEquipType()"> <option value="head">Couvre-chef</option> <option value="armor">Armure</option> <option value="boot">Bottes</option> <option value="weapon">Arme</option> <option value="other">Autres</option> </select> <label>Poids :</label> <input type="radio" name="weight" value="big" id="big"> <label for="big" class="radio">Gros</label> <input type="radio" name="weight" value="normal" id="normal" checked> <label for="normal" class="radio">Normal</label>'
    );
}

function insertWeaponForm() {
    formWeapon.insertAdjacentHTML('beforeend',
        '<label>Nombres de main :</label> <input type="radio" name="hand" value="1" id="1hand" checked> <label for="1hand" class="radio">1 main</label> <input type="radio" name="hand" value="2" id="2hand"> <label for="2hand" class="radio">2 mains</label>'
    );
}

insertEquipmentForm();

function addForm() {
    form.innerHTML = "";
    switch (parent.type.selectedIndex) {
        case 0:
            insertEquipmentForm();
            break;
        case 1:
            insertMonsterForm();
            break;
        case 2:
            insertCurseForm();
            break;
        default:
            break;
    }
}

function addEquipType() {
    if (parent.type_equip.selectedIndex == 3) {
        insertWeaponForm();
    } else {
        formWeapon.innerHTML = "";
    }
}