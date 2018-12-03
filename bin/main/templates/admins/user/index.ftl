<#import "/spring.ftl" as spring/>
<#include "../../general/header.ftl">

<div id="conteneur">

    <#include "../menu_admin.ftl">

    <div id="window">

        <div class="head_window">
            <h1>Gestion des utilisateurs</h1>

            <form class="form-inline my-2 my-lg-0" action="${detailPath}/find" method="POST">
                <input class="form-control mr-sm-2" type="search" name="search" id="search" placeholder="Rechercher">
                <button type="submit" class="btn btn-outline-success">Rechercher</button>
            </form>
        </div>

        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Pseudo</th>
                    <th>Adresse mail</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
            <#list user as u>
                <tr>
                    <td>${u.id}</td>
                    <td>${u.name}</td>
                    <td>${u.mail}</td>
                    <td><a href="#" class="btn btn-secondary">Bloquer</a><a href="#" class="btn btn-danger">Supprimer</a></td>
                </tr>
            </#list>
            </tbody>
        </table>

    </div>
</div>