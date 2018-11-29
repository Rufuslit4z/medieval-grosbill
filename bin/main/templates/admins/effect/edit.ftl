<#import "/spring.ftl" as spring/>

<html>
    <head>
        <title>Home Médieval GrosBill</title>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="<@spring.url '/css/form.css'/>">
    </head>
    <body>
        <h1>CREATE EFFECT</h1>
        <hr>
        <form method="POST">
            <div class="data">
                <p> Effect name</p>
                <input name="name" type="text" placeholder="name" value="${effect.getName()}">
            </div>
            <div class="data">
                <p>Type effect</p>
                <select name="type" size="1">
                    <option <#if effect.getType() == "niveau"> selected</#if>>niveau</option>
                    <option <#if effect.getType() == "attaque"> selected</#if>>attaque</option>
                    <option <#if effect.getType() == "cartes"> selected</#if>>cartes</option>
                </select>
            </div>
            <div class="data">
                <p>Value</p>
                <input name="value" type="number" value="${effect.getValue()}">
            </div>
            <div class="submit">
                <input type="submit" id="submit" value="Save">
            </div>
        </form>
    </body>
</html>