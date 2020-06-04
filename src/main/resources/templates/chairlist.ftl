<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>

<h1 style="text-align: center">  Список кафедр </h1>

<div>

    <table class="table table-striped">
        <thead class="thead-dark">
        <tr >
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">DESC</th>
            <th scope="col">Delete</th>
            <th scope="col">Edit</th>


        </tr>
        </thead>
        <#list chairs as chair>
            <tr>
                <td>${chair.id}</td>
                <td>${chair.name}</td>
                <td>${chair.desc}</td>
                <td><a href="/web/chair/delete/${chair.id}" type="button" class="btn btn-outline-danger"  onclick="return confirm('Are you sure you want to delete ${chair.name} ?');">DELETE</a></td>
                <td><a href="/web/chair/edit/${chair.id}" type="button" class="btn btn-outline-warning"  onclick="return confirm('Are you sure you want to edit ${chair.name} ?');">EDIT</a></td>
                <td></td>

     </tr>
        </#list>

    </table>
</div>

</body>
</html>
