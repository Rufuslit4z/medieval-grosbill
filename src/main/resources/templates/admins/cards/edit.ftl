<#import "/spring.ftl" as spring/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<#include "../menu_admin.ftl">

<form action="${detailPath}/create" method="POST" id="formulaire">
    <input type="hidden" name="${type}.id" value="${card.getId()}">
    <label for="name">Nom :</label>
    <input type="text" name="${type}.name" id="name" maxlength="64" value="${card.name}" onkeypress="title_card.innerText=this.value">
    <label for="desc">Description :</label>
    <textarea id="desc" name="${type}.description" maxlength="232" rows="9" onkeypress="desc_card.innerText=this.value">${card.description}</textarea>
    <label for="img">Image :</label>
    <input type="file" name="${type}.image" id="img" value="${card.image}" accept="image/*">
    <label for="type">Type de carte :</label>

    <#switch switch>
        <#case "monster">
            <label for="lvl">Niveau :</label>
            <input type="number" name="monster.level" id="lvl" min="1" max="99" value="${card.level}" onkeyup="bonus1.innerText=this.value;bonus2.innerText=this.value">
            <label for="treasure">Trésor(s) gagné(s) :</label>
            <input type="number" name="monster.treasure" id="treasure" min="1" max="9" value="${card.treasure}" onkeyup="this.value>1?rightbot.innerText=this.value+\' trésors\':rightbot.innerText=this.value+\' trésor\';">
            <label for="leak">Minimum fuite :</label>
            <select name="monster.leak" id="leak">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5" selected>5</option>
            </select>
            <label for="malus">Action si fuite raté :</label>
            <select name="monster.malus" id="malus">

            </select>
            <#break>
        <#case "curse">
            <label for="curse">Effet malédiction :</label>
            <select name="curse.effect" id="curse">

            </select>
            <#break>
        <#case "equipment">
            <label for="att">Point d\'attaque :</label>
            <input type="number" name="${type}.attack" id="att" min="0" max="9" value="${card.attack}" onkeyup="bonus1.innerText=\'+\'+this.value;bonus2.innerText=\'+\'+this.value">
            <label id="cost">Valeur pièce d\'or :</label>
            <input type="number" name="${type}.cost" id="cost" min="0" max="2000" value="${card.cost}" onkeyup="printCost(this.value)">
            <label>Poids :</label>
            <input type="radio" name="${type}.weight" value=true id="big" <#if card.bigItem==true> checked</#if>>
            <label for="big" class="radio">Gros</label>
            <input type="radio" name="${type}.weight" value=false id="normal" <#if card.bigItem==false> checked</#if>>
            <label for="normal" class="radio">Normal</label>
            <#if type == "weapon">
                <label>Nombres de main :</label>
                <input type="radio" name="weapon.hand" value=true id="1hand" <#if card.hand> checked</#if>>
                <label for="1hand" class="radio">1 main</label>
                <input type="radio" name="weapon.hand" value=false id="2hand" <#if card.hand==false> checked</#if>>
                <label for="2hand" class="radio">2 mains</label>
            </#if>
            <#break>
    </#switch>

    <input type="submit" name="submit" value="Modifier">
</form>

<script src="<@spring.url '/javascript/cards/createCards.js'/>"></script>