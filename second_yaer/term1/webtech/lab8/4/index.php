<?php

$url = "https://www.themealdb.com/api/json/v1/1/random.php";
$res = file_get_contents($url);
$result = json_decode($res);


foreach ($result as $obj) {
    $result = $result->meals[0];
    $image = $result->strMealThumb;
    $name = $result->strMeal;
    $recomment = $result->strInstructions;
    $link = $result->strSource;
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
    <style>
        body {
            height: 100vh;
            width: 100vw;
        }

        .description-text {
            text-overflow: ellipsis;
            overflow: hidden;
            display: -webkit-box !important;
            -webkit-line-clamp: 4;
            -webkit-box-orient: vertical;
            white-space: normal;
        }
    </style>
</head>

<body>
    <div class="container w-100 h-100">
        <div class="d-flex justify-content-center align-items-center w-100 h-100">
            <div class="card p-4" style="width: 18rem;">
                <img src="<?php echo $image; ?>" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title"><?php echo $name; ?></h5>
                    <hr>
                    <p class="card-text description-text"><?php echo $recomment; ?></p>
                    <button onclick="location.reload();" class="btn btn-light ">refesh</button>
                    <a href="<?php echo $link; ?>" target="blank" class="btn btn-success">Learn more</a>
                </div>
            </div>
        </div>
    </div>
</body>

</html>