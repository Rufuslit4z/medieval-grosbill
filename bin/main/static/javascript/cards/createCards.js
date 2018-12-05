var parent = document.getElementById('formulaire');
var form = document.getElementById('insertForm');
var formWeapon = document.getElementById('insertFormWeapon');

function reset() {
    document.getElementsByClassName('bonus1').innerText="";
    document.getElementsByClassName('bonus2').innerText="";
    document.getElementsByClassName('leftbot').innerText="";
    document.getElementsByClassName('rightbot').innerText="";
}

function printCost(c) {
    var a = document.getElementsByClassName('rightbot');
    (c > 0) ? a.innerText=c+' pièces d\'or' : a.innerText="";
}

function insertMonsterForm() {
    reset();
    form.insertAdjacentHTML('beforeend',
        '<label for="lvl">Niveau :</label> <input class="form-control" type="number" name="monster.level" id="lvl" min="1" max="99" onkeyup="bonus1.innerText=this.value;bonus2.innerText=this.value"> <label for="treasure">Trésor(s) gagné(s) :</label> <input class="form-control" type="number" name="monster.treasure" id="treasure" min="1" max="9" onkeyup="this.value>1?rightbot.innerText=this.value+\' trésors\':rightbot.innerText=this.value+\' trésor\';"> <label for="leak">Minimum fuite :</label> <select class="form-control" name="monster.leak" id="leak"> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option><option value="4">4</option> <option value="5" selected>5</option> </select> <label for="malus">Action si fuite raté :</label> <select class="form-control" name="monster.malus" id="malus"> <option value="">Effet 1</option> <option value="">Effet 2</option> </select>'
    );
    document.getElementById('name').setAttribute('name', "monster.name");
    document.getElementById("desc").setAttribute("name", "monster.description");
    document.getElementById('img').setAttribute('name', "monster.image");
}

function insertCurseForm() {
    reset();
    form.insertAdjacentHTML('beforeend',
        '<label for="curse">Effet malédiction :</label> <select class="form-control" name="curse.effect" id="curse">'+ effectList +' </select>'
    );
    document.getElementById('name').setAttribute('name', "curse.name");
    document.getElementById("desc").setAttribute("name", "curse.description");
    document.getElementById('img').setAttribute('name', "curse.image");
}

function insertEquipmentForm() {
    reset();
    form.insertAdjacentHTML('beforeend',
        '<label for="att">Point d\'attaque :</label> <input class="form-control" type="number" name="head.attack" id="att" min="0" max="9" onkeyup="bonus1.innerText=\'+\'+this.value;bonus2.innerText=\'+\'+this.value"> <label for="cost">Valeur pièce d\'or :</label> <input class="form-control" type="number" name="head.cost" id="cost" min="0" max="2000" onkeyup="printCost(this.value)"> <label for="type_equip">Type d\'équipement :</label> <select class="form-control" name="type_equip" id="type_equip" onChange="addEquipType()"> <option value="head">Couvre-chef</option> <option value="armor">Armure</option> <option value="boot">Bottes</option> <option value="weapon">Arme</option> <option value="other">Autres</option> </select> <label>Poids :  </label><div class="custom-control custom-radio custom-control-inline"> <input class="custom-control-input" type="radio" name="head.bigItem" value=true id="big"> <label for="big" class="custom-control-label">Gros</label></div><div class="custom-control custom-radio custom-control-inline"> <input class="custom-control-input" type="radio" name="head.bigItem" value=false id="normal" checked> <label for="normal" class="custom-control-label">Normal</label></div>'
    );
}

function insertWeaponForm() {
    reset();
    formWeapon.insertAdjacentHTML('beforeend',
        '<label>Nombres de main :  </label><div class="custom-control custom-radio custom-control-inline"> <input class="custom-control-input" type="radio" name="weapon.hand" value=true id="1hand" checked> <label for="1hand" class="custom-control-label">1 main</label></div> <div class="custom-control custom-radio custom-control-inline"><input class="custom-control-input" type="radio" name="weapon.hand" value=false id="2hand"> <label for="2hand" class="custom-control-label">2 mains</label></div>'
    );
    document.getElementById('name').setAttribute('name', "weapon.name");
    document.getElementById("desc").setAttribute("name", "weapon.description");
    document.getElementById('img').setAttribute('name', "weapon.imgage");
}

addForm();
addEquipType();

function addForm() {
    form.innerHTML = "";
    formWeapon.innerHTML = "";
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
    formWeapon.innerHTML = "";
    switch (parent.type_equip.selectedIndex) {
        case 0:
            document.getElementById('name').setAttribute('name', "head.name");
            document.getElementById("desc").setAttribute("name", "head.description");
            document.getElementById('img').setAttribute('name', "head.image");
            document.getElementById('att').setAttribute('name', "head.attack");
            document.getElementById('cost').setAttribute('name', "head.cost");
            document.getElementById('big').setAttribute('name', "head.bigItem");
            document.getElementById('normal').setAttribute('name', "head.bigItem");
            break;
        case 1:
            document.getElementById('name').setAttribute('name', "armor.name");
            document.getElementById("desc").setAttribute("name", "armor.description");
            document.getElementById('img').setAttribute('name', "armor.image");
            document.getElementById('att').setAttribute('name', "armor.attack");
            document.getElementById('cost').setAttribute('name', "armor.cost");
            document.getElementById('big').setAttribute('name', "armor.bigItem");
            document.getElementById('normal').setAttribute('name', "armor.bigItem");
            break;
        case 2:
            document.getElementById('name').setAttribute('name', "boots.name");
            document.getElementById("desc").setAttribute("name", "boots.description");
            document.getElementById('img').setAttribute('name', "boots.image");
            document.getElementById('att').setAttribute('name', "boots.attack");
            document.getElementById('cost').setAttribute('name', "boots.cost");
            document.getElementById('big').setAttribute('name', "boots.bigItem");
            document.getElementById('normal').setAttribute('name', "boots.bigItem");
            break;
        case 3:
            document.getElementById('name').setAttribute('name', "weapon.name");
            document.getElementById("desc").setAttribute("name", "weapon.description");
            document.getElementById('img').setAttribute('name', "weapon.image");
            document.getElementById('att').setAttribute('name', "weapon.attack");
            document.getElementById('cost').setAttribute('name', "weapon.cost");
            document.getElementById('big').setAttribute('name', "weapon.bigItem");
            document.getElementById('normal').setAttribute('name', "weapon.bigItem");
            insertWeaponForm();
            break;
        case 4:
            document.getElementById('name').setAttribute('name', "other.name");
            document.getElementById("desc").setAttribute("name", "other.description");
            document.getElementById('img').setAttribute('name', "other.image");
            document.getElementById('att').setAttribute('name', "other.attack");
            document.getElementById('cost').setAttribute('name', "other.cost");
            document.getElementById('big').setAttribute('name', "other.bigItem");
            document.getElementById('normal').setAttribute('name', "other.bigItem");
            break;
    }
}