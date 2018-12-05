<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Modifier un effet</h1>
        </div>

        <form id="formulaire" action="${detailPath}/create" method="POST">

            <input type="hidden" name="id" value="${effect.getId()}">

            <label>Nom :</label>
            <input class="form-control" name="name" type="text" value="${effect.getName()}">
            <label>Type d'effet :</label>
            <select class="form-control" name="type">
                <option <#if effect.getType() == "niveau"> selected</#if>>niveau</option>
                <option <#if effect.getType() == "attaque"> selected</#if>>attaque</option>
                <option <#if effect.getType() == "cartes"> selected</#if>>cartes</option>
            </select>
            <label>Valeur :</label>
            <input class="form-control" name="value" type="number" value="${effect.getValue()}">
            <br>
            <input class="btn btn-success" type="submit" id="submit" value="Save">

        </form>
    </div>
</div>