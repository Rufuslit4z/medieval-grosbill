<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Création de carte</h1>
        </div>

        <form action="${detailPath}/create" method="POST" id="formulaire">
            <label for="name">Nom :</label>
            <input class="form-control" type="text" name="name" id="name" maxlength="64" onkeypress="title_card.innerText=this.value">
            <label for="desc">Description :</label>
            <textarea class="form-control" id="desc" name="description" maxlength="232" rows="7" onkeypress="desc_card.innerText=this.value"></textarea>
            <label for="img">Image :</label>
            <input class="form-control-file" type="file" name="imgage" id="img" accept="image/*">
            <label for="type">Type de carte :</label>
            <select class="form-control" name="type" onchange="addForm()">
                <option selected value="equipment">Equipement</option>
                <option value="monster">Monstre</option>
                <option value="curse">Malédiction</option>
            </select>

            <div id="insertForm"></div>
            <div id="insertFormWeapon"></div>

            <input class="btn btn-success" type="submit" name="submit" value="Ajouter">
        </form>

    </div>
</div>


<script type="text/javascript">
    console.log("test");
    var effectList = '<#list effect as e><option value="${e.id}">${e.name}</option></#list>';
</script>
<script src="<@spring.url '/javascript/cards/createCards.js'/>"></script>