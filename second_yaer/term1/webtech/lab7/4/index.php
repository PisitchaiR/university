<?php
$name = $lastname = $address = $kete = $province = $zip = $phone = $identify_number = $error = "";
$arr = [];
$check = 0;
if (isset($_POST['submit'])) {
    $name = $_POST['name'];
    $identify_number = $_POST['identify-number'];
    $lastname = $_POST['lastname'];
    $address = $_POST['address'];
    $kete = $_POST['kete'];
    $province = $_POST['province'];
    $zip = $_POST['zipcode'];
    $phone = $_POST['phone'];
    $arr_data = [$name, $lastname, $address, $kete, $province, $zip, $phone, $identify_number];
    for ($i = 0; $i < count($arr_data); $i++) {
        if (strlen($arr_data[$i]) < 5) {
            $check += 1;
        }
    }
    if ($check > 0) {
        $error = "<p class='text-danger'>***ให้ใส่ค่าที่กรอกไว้ใน FORM ด้วย ***</p>";
    }
}
?>
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
        <?php echo $error; ?>
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="POST">
            <div class="input-group">
                <label for="identify-number">หมายเลขบัตรประชาชน : </label>
                <input type="text" placeholder="" name="identify-number">
            </div>
            <div class="input-group">
                <label for="idetify-number">ชื่อ : </label>
                <input type="text" placeholder="" name="name">
            </div>
            <div class="input-group">
                <label for="idetify-number">นามสกุล : </label>
                <input type="text" placeholder="" name="lastname">
            </div>
            <div class="input-group">
                <label for="idetify-number">ที่อยู่ : </label>
                <input type="text" placeholder="" name="address">
            </div>
            <div class="input-group">
                <label for="idetify-number">อำเภอ/เขต : </label>
                <input type="text" placeholder="" name="kete">
            </div>
            <div class="input-group">
                <label for="idetify-number">จังหวัด : </label>
                <input type="text" placeholder="" name="province">
            </div>
            <div class="input-group">
                <label for="idetify-number">รหัสไปรษณีย์ : </label>
                <input type="text" placeholder="" name="zipcode">
            </div>
            <div class="input-group">
                <label for="idetify-number">เบอร์โทรศัพทร์ : </label>
                <input type="text" placeholder="" name="phone">
            </div>
            <input type="submit" class="btn btn-warning mt-3" name="submit">
        </form>
    </div>
    <table class="table mt-4">
        <thead>
            <th>ลำดับ</th>
            <th>รายการ</th>
        </thead>
        <tbody>
            <?php
            if ($arr_data != "") {
                for ($i = 0; $i < count($arr_data); $i++) {
                    $order = $i + 1;
                    echo "<tr>
                                <td>{$order}</td>
                                <td>{$arr_data[$i]}</td>
                        </tr>";
                }
            }
            ?>
        </tbody>
    </table>
</body>

</html>