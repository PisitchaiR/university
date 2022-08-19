<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
    <style>
        .vl {
            border-left: 0.1rem solid green;
            height: auto;
            background-color: black;
        }
    </style>
</head>

<body>
    <div class="container">
        <?php
        $url = "http://10.0.15.20/lab8/restapis/10countries";
        $response = file_get_contents($url);
        $result = json_decode($response);
        for ($i = 0; $i < count($result); $i++) { ?>
            <div class="card mt-4">
                <div class="card-body d-flex flex-rows-reverse w-100">
                    <div class="card-text col-5">
                        Name : <?php echo $result[$i]->name; ?> <br>
                        Capital : <?php echo $result[$i]->capital; ?> <br>
                        Population : <?php echo $result[$i]->population; ?> <br>
                        Region : <?php echo $result[$i]->region; ?> <br>
                        Location : <?php echo $result[$i]->latlng[0] . " " . $result[$i]->latlng[1]; ?><br>
                        Borders :
                        <?php foreach ($result[$i]->borders as $case) { ?>
                            <?php echo "$case "; ?>
                        <?php } ?><br>
                    </div>
                    <div class="col-7">
                        <div class="card-img w-100 h-100 d-flex justify-content-center align-items-center">
                            <img class="w-50" src="<?php echo $result[$i]->flag ?>" alt="sdfasd">
                        </div>
                    </div>
                </div>
            </div>
        <?php } ?>
    </div>
</body>

</html>