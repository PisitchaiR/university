<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>

<body>
    <table class="table">
        <tbody>
            <?php
            echo "<tr>";
            echo "<td>x</td>";
            for($i = 1; $i <=12; $i++){
                echo "<td>".$i."</td>";
            }
            echo "</tr>";
            for ($i = 1; $i <= 12; $i++) {
                echo "<tr>";
                echo "<td>".$i."</td>";
                for ($j = 1; $j <= 12; $j++) {
                    echo "<td>" . $i * $j . "</td>";
                }
                echo "</tr>";
            }
            ?>
        </tbody>
    </table>
</body>

</html>