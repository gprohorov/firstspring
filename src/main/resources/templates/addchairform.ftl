<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>


    <div>
        <fieldset>
            <legend>Add chair</legend>
            <form name="chair" action="" method="POST">
                 name:<@spring.formInput "chairForm.name" "" "text"/>
                <br>
                DESC:<@spring.formInput "chairForm.desc" "" "text"/>
                <input type="submit" value="Save"/>
            </form>
        </fieldset>
    </div>





</body>
</html>
