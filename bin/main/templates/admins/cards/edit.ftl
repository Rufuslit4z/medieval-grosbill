<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <form action="${detailPath}/create" method="POST" id="formulaire">
            <input type="hidden" name="${type}.id" value="${card.getId()}">
            <label for="name">Nom :</label>
            <input class="form-control" type="text" name="${type}.name" id="name" maxlength="64" value="${card.name}" onkeypress="title_card.innerText=this.value">
            <label for="desc">Description :</label>
            <textarea class="form-control" id="desc" name="${type}.description" maxlength="232" rows="7" onkeypress="desc_card.innerText=this.value">${card.description}</textarea>
            <label for="img">Image :</label>
            <input class="form-control-file" type="file" name="${type}.image" id="img" value="${card.img}" accept="image/*">

    <#switch switch>
        <#case "monster">
            <label for="lvl">Niveau :</label>
            <input class="form-control" type="number" name="monster.level" id="lvl" min="1" max="99" value="${card.level}" onkeyup="bonus1.innerText=this.value;bonus2.innerText=this.value">
            <label for="treasure">Tr�sor(s) gagn�(s) :</label>
            <input class="form-control" type="number" name="monster.treasure" id="treasure" min="1" max="9" value="${card.treasure}" onkeyup="this.value>1?rightbot.innerText=this.value+\' trésors\':rightbot.innerText=this.value+\' trésor\';">
            <label for="leak">Minimum fuite :</label>
            <select class="form-control" name="monster.leak" id="leak">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5" selected>5</option>
            </select>
            <label for="malus">Action si fuite raté :</label>
            <select class="form-control" name="monster.malus" id="malus">

            </select>
            <#break>
        <#case "curse">
            <label for="curse">Effet malédiction :</label>
            <select class="form-control" name="curse.effect" id="curse">

            </select>
            <#break>
        <#case "equipment">
            <label for="att">Point d'attaque :</label>
            <input class="form-control" type="number" name="${type}.attack" id="att" min="0" max="9" value="${card.attack}" onkeyup="bonus1.innerText=\'+\'+this.value;bonus2.innerText=\'+\'+this.value">
            <label id="cost">Valeur pièce d\'or :</label>
            <input class="form-control" type="number" name="${type}.cost" id="cost" min="0" max="2000" value="${card.cost}" onkeyup="printCost(this.value)">
            <label>Poids :  </label>
            <br>
            <div class="custom-control custom-radio custom-control-inline">
            <input class="custom-control-input" class="form-control" type="radio" name="${type}.weight" value=true id="big" <#if card.bigItem??><#if card.bigItem == true> checked</#if></#if>>
            <label class="custom-control-label" for="big">Gros</label>
            </div>
            <div class="custom-control custom-radio custom-control-inline">
            <input class="custom-control-input" class="form-control" type="radio" name="${type}.weight" value=false id="normal" <#if card.bigItem??><#if card.bigItem == false> checked</#if></#if>>
            <label class="custom-control-label" for="normal">Normal</label>
            </div>
        <#if type == "weapon">
            <label>Nombres de main :  </label>
            <br>
            <div class="custom-control custom-radio custom-control-inline">
            <input class="custom-control-input" type="radio" name="weapon.hand" value=true id="1hand" <#if card.hand??><#if card.hand == true> checked</#if></#if>>
            <label class="custom-control-label" for="1hand">1 main</label>
            </div>
            <div class="custom-control custom-radio custom-control-inline">
            <input class="custom-control-input" type="radio" name="weapon.hand" value=false id="2hand" <#if card.hand??><#if card.hand == false> checked</#if></#if>>
            <label class="custom-control-label" for="2hand">2 mains</label>
            </div>
        </#if>
            <#break>
    </#switch>
    		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input class="btn btn-success" type="submit" name="submit" value="Modifier">
        </form>
    </div>

</div>


<script src="<@spring.url '/javascript/cards/createCards.js'/>"></script>