<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>pisitchai</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />

    <style>
        @import url('https://fonts.googleapis.com/css2?family=Prompt:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap');

        * {
            font-family: 'Prompt', sans-serif;
            font-weight: 400;
            font-size: 18px;
        }

        body {
            padding-top: 12vh;
            height: 100%;
        }

        .content {
            border-radius: 5px;
        }

        select {
            margin-bottom: 6px !important;
        }
    </style>
</head>

<body>
    <div class="content container">
        <form action="" method="POST">
            <h1>currency Converter</h1><br><br>
            <h3>From : </h3>
            <div class="input-group mb-5 row">
                <div class="col-md-2">
                    <select class="custom-select" id="select_before" name="select_before">
                        <?php
                        $text0 = 'selected="selected"';
                        $text1 = '';
                        $text2 = '';
                        $text3 = '';
                        $text4 = '';
                        $text5 = '';

                        if (isset($_POST['submit'])) {
                            switch ($_POST['select_before']) {
                                case 'THB':
                                    $text1 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'JPY':
                                    $text2 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'CNY':
                                    $text3 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'SGD':
                                    $text4 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'USD':
                                    $text5 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                default:
                                    break;
                            }
                        }

                        echo '<option value="" ' . $text0 . ' disabled><center>เลือกค่าเงิน</center></option>';
                        echo '<option value="THB" ' . $text1 . '>THB</option>';
                        echo '<option value="JPY" ' . $text2 . '>JPY</option>';
                        echo '<option value="CNY" ' . $text3 . '>CNY</option>';
                        echo '<option value="SGD" ' . $text4 . '>SGD</option>';
                        echo '<option value="USD" ' . $text5 . '>USD</option>';
                        ?>
                    </select>
                </div>
                <div class="col-md-4">
                    <?php
                    $text = "";
                    if (isset($_POST['submit'])) {
                        $text = $_POST['num_before'];
                    }
                    echo '<input class="form-control input1" value="' . $text . '" placeholder="จำนวนเงิน" type="text" id="num_before" name="num_before" />';
                    ?>
                </div>
            </div>
            <h3>To : </h3>
            <div class="input-group mb-3 row">

                <div class="col-md-2">
                    <select class="custom-select" id="select_to" name="select_to">
                        <?php
                        $text0 = 'selected="selected"';
                        $text1 = '';
                        $text2 = '';
                        $text3 = '';
                        $text4 = '';
                        $text5 = '';

                        if (isset($_POST['submit'])) {
                            switch ($_POST['select_to']) {
                                case 'THB':
                                    $text1 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'JPY':
                                    $text2 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'CNY':
                                    $text3 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'SGD':
                                    $text4 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                case 'USD':
                                    $text5 = 'selected="selected"';
                                    $text0 = '';
                                    break;
                                default:
                                    break;
                            }
                        }

                        echo '<option value="" ' . $text0 . ' disabled><center>เลือกค่าเงิน</center></option>';
                        echo '<option value="THB" ' . $text1 . '>THB</option>';
                        echo '<option value="JPY" ' . $text2 . '>JPY</option>';
                        echo '<option value="CNY" ' . $text3 . '>CNY</option>';
                        echo '<option value="SGD" ' . $text4 . '>SGD</option>';
                        echo '<option value="USD" ' . $text5 . '>USD</option>';
                        ?>
                    </select>
                </div>
                <div class="col-md-4">
                    <?php
                    $url = "http://10.0.15.20/lab8/restapis/currencyrate";
                    $response = file_get_contents($url);
                    $result = json_decode($response);

                    $result_num = 0;

                    if (isset($_POST['submit'])) {
                        $be = $_POST['select_before'];
                        $af = $_POST['select_to'];

                        $thb = $result->rates->THB;
                        $jpy = $result->rates->JPY;
                        $cny = $result->rates->CNY;
                        $sgd = $result->rates->SGD;
                        $usd = $result->rates->USD;
                        if ($be != "" && $af != "") {
                            switch ($be) {
                                case 'THB':
                                    $result_num = doubleval($_POST['num_before']) / $thb;
                                    break;
                                case 'JPY':
                                    $result_num = doubleval($_POST['num_before']) / $jpy;
                                    break;
                                case 'CNY':
                                    $result_num = doubleval($_POST['num_before']) / $cny;
                                    break;
                                case 'SGD':
                                    $result_num = doubleval($_POST['num_before']) / $sgd;
                                    break;
                                case 'USD':
                                    $result_num = doubleval($_POST['num_before']) / $usd;
                                    break;
                                default:
                                    break;
                            }

                            switch ($af) {
                                case 'THB':
                                    $result_num *= $thb;
                                    break;
                                case 'JPY':
                                    $result_num *= $jpy;
                                    break;
                                case 'CNY':
                                    $result_num *= $cny;
                                    break;
                                case 'SGD':
                                    $result_num *= $sgd;
                                    break;
                                case 'USD':
                                    $result_num *= $usd;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }

                    echo '<input class="form-control input1" placeholder="ผลลัพธ์" value="' . $result_num . '" type="text" id="num_before" name="num_before" disabled/>';
                    ?>
                </div>
            </div>
            <button class="btn btn-warning" type="submit" name="submit">Submit</button>
        </form>
    </div>
</body>

</html>