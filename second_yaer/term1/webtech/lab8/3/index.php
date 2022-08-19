<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <?php
        $url = "http://10.0.15.20/lab8/restapis/movies90";
        $response = file_get_contents($url);
        $result = json_decode($response);
        for($i=0; $i<count($result);$i++) {?>
            <div class="card mt-4">
                <div class="card-body">
                    <div class="card-title">
                        <?php echo $result[$i]->title . "({$result[$i]->year})"; ?>
                    </div>
                    <div class="card-text">
                        Cast:
                        <?php foreach($result[$i]->cast as $cast){?>
                            <?php echo "-$cast<br>";?>
                        <?php } ?>
                        Genres: <?php echo $result[$i]->genres[0]; ?>
                    </div>
                </div>
            </div>
        <?php } ?>
    </div>
</body>

</html>