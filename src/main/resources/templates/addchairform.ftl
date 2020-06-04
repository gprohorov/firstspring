<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>


    <div>
        <fieldset>
            <legend>${action} chair</legend>
            <form name="chair" action="" method="POST">
                 name:<@spring.formInput "form.name" "" "text"/>
                <br>
                DESC:<@spring.formInput "form.desc" "" "text"/>
                <input type="submit" value="Save"/>
            </form>
        </fieldset>
    </div>





</body>
</html>
