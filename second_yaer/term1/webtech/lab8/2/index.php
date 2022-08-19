<?php
$url = "https://covid19.ddc.moph.go.th/api/Cases/today-cases-by-provinces";
$response = file_get_contents($url);
$result = json_decode($response);

foreach ($result as $case) {
    $data = $case->txn_date;
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
</head>

<body>
    <div class="container">
        <h2>ข้อมูลวันที่ : <?php echo $data; ?></h2>
        <table class="table">
            <thead>
                <th>ลำดับ</th>
                <th>จังหวัด</th>
                <th>ผู้ติดเชื้อ</th>
                <th>เสียชีวิต</th>
                <th>ยอดผู้ป่วยสะสม</th>
            </thead>
            <tbody>
                <?php
                $i = 1;
                foreach ($result as $case) {
                    echo "<tr><td>$i</td>";
                    echo "<td>$case->province</td>";
                    echo "<td>$case->new_case</td>";
                    echo "<td>$case->new_death</td>";
                    echo "<td>$case->total_case</td></tr>";
                    $i++;
                }
                ?>
            </tbody>
        </table>
    </div>
</body>
</html>