<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Gestion des cartes</h1>

            <form class="form-inline my-2 my-lg-0" action="${detailPath}/find" method="POST">
                <input class="form-control mr-sm-2" type="search" name="search" id="search" placeholder="Rechercher">
                <button type="submit" class="btn btn-outline-success">Rechercher</button>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </div>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nom</th>
                    <th>Type</th>
                    <th>Bonus/Level</th>
                    <th>Trésor</th>
                    <th>Effet</th>
                    <th>Modification</th>
                    <th><a class="btn btn-success btn-sm" href="${detailPath}/create">Ajouter</a></th>
                </tr>
            </thead>
            <tbody>
        <#if cards??>
            <#list cards as c>
                <tr>
                    <td>${c.id}</td>
                    <td><#if c.name??>${c.name}</#if></td>
                    <td>test</td>
                    <td><#if c.level??>${c.level}</#if><#if c.attack??>${c.attack}</#if></td>
                    <td><#if c.treasure??>${c.treasure}</#if></td>
                    <td><#if c.effect??>${c.effect}</#if></td>
                    <td><a href="${detailPath}/edit/${c.id}" class="btn btn-secondary">Modifier</a> <a href="${detailPath}/delete/${c.id}" class="btn btn-danger">Supprimer</a></td>
                    <td></td>
                </tr>
            </#list>
        </#if>
            </tbody>
        </table>
    </div>
</div>
