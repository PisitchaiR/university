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
    <div class="container-full">
        <div class="w-full text-center bg-light shadow-sm p-3">Gallery</div>
        <?php
        for ($j = 1; $j <= 6; $j++) {
            echo '<div class="row mt-4">';
            for ($i = 1; $i <= 4; $i++) {
                echo "<img class='col-3 rounded' src='https://source.unsplash.com/random?sig=".rand(10,99)."}'>";
            }
            echo '</div>';
        }
        ?>
    </div>
</body>

</html>