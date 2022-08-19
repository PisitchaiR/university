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
    <form action="" method="POST">
        <label for="num" class="">กรอกสูตรคูณ</label>
        <input type="number" name="input">
        <button type="submit" class="btn btn-warning">แสดงตาราง</button>
    </form>
    <table class="">
        <?php
        if (isset($_POST['input'])) {
            echo "<h2>ตารางสูตรคูณแม่ $num </h2><br>";
            $num = $_POST['input'];
            for ($i = 1; $i <= 12; $i++) { ?>
                <tr>
                    <td class="border-bottom w-50 border-dark text-center"><?php echo "$num X $i = " . $i * $num . "<br>"; ?></td>
                </tr>
        <?php
            }
        }
        ?>
    </table>
</body>

</html>