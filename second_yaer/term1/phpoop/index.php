<?php

include_once('connect.object.php');
$userdata = new DB_con();

if(isset($_POST['submit'])){
    $password = "";
    $email = $_POST['email'];
    $password1 = $_POST['password1'];
    $password2 = $_POST['password2'];
    if($password1 == $password2){
        $password = $password1;
    }
    $sql = $userdata->registration($email, $password);

    if ($sql) {
        echo "<script>alert('Registor Successful!');</script>";
        echo "<script>window.location.href='login.php'</script>";
    }else{
        echo "<script>alert('Something went wrong! Please try again.');</script>";
        echo "<script>window.location.href='index.php'</script>";
    }
}

?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
</head>

<body>

    <div class="container">
        <h1 class="mt-5">Register Page</h1>
        <hr>
        <form method="POST">
            <div class="mb-3">
                <label for="Email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="Email" aria-describedby="emailHelp" name="email" onblur="checkemail(this.value)">
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                <span id="emailavailable"></span>
            </div>
            <div class="mb-3">
                <label for="Password1" class="form-label">Password</label>
                <input type="password" class="form-control" id="Password1" name="password1">
            </div>
            <div class="mb-3">
                <label for="Password2" class="form-label">Confirm Password</label>
                <input type="password" class="form-control" id="Password2" name="password2">
            </div>
            <button type="submit" name="submit" id="submit" class="btn btn-success">Submit</button>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        let checkemail = (val) => {

            console.log('email = '+val);
            $.ajax({
                type: 'POST',
                url: 'checkuser .php',
                data: 'email ='+val,
                success: function(data) {
                    $('#emailavailable').html(data);
                }

            })
        }
    </script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.min.js" integrity="sha384-PsUw7Xwds7x08Ew3exXhqzbhuEYmA2xnwc8BuD6SEr+UmEHlX8/MCltYEodzWA4u" crossorigin="anonymous"></script>
</body>

</html>