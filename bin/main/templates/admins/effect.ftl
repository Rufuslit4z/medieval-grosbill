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
                <p>Win</p>
                <input name="win" type="text" placeholder="number">
            </div>
            <div class="data">
                <p>Lose</p>
                <input name="lose" type="text" placeholder="number">
            </div>
            <div class="submit">
                <input type="submit" value="Save">
            </div>
        </form>
    </body>
</html>