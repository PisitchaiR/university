<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <table border=1>
        <tr>
            <th>Su</th>
            <th>Mo</th>
            <th>Tu</th>
            <th>We</th>
            <th>Th</th>
            <th>Fr</th>
            <th>Sa</th>
        </tr>
        <?php
        $day = 1;
        for ($col = 1; $col <= 35; $col++) {
            if ($col % 7 === 1) {
                echo "<tr>";
            }
            if ($col > 3 && $day <= 31) {
                echo "<td>{$day}</td>";
                $day++;
            } else {
                echo "<td></td>";
            }
            if ($col % 7 === 0) {
                echo "</tr>";
            }
        }
        ?>
    </table>
</body>

</html>