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
                <input name="name" type="text" placeholder="name">
            </div>
            <div class="data">
                <p>Type effect</p>
                <select name="type" size="1">
                    <option>type</option>
                    <option>level</option>
                    <option>attack</option>
                </select>
            </div>
            <div class="data">
                <p>Value</p>
                <input name="value" type="number" value="0">
            </div>
            <div class="submit">
                <input type="submit" id="submit" value="Save">
            </div>
        </form>
        <a href="<@spring.url '/admins'/>">BACK</a>
        <a href="<@spring.url '/admins/effect/show'/>">SHOW EFFECT</a>
    </body>
</html>