<?php

define('DB_SERVER', 'localhost');
define('DB_USER', 'root');
define('DB_PASS', '');
define('DB_NAME', 'register');

class DB_con {
    function __construct()
    {
        $conn = mysqli_connect(DB_SERVER, DB_USER, DB_PASS, DB_NAME);
        $this->dbcon = $conn;

        if(mysqli_connect_errno()){
            echo "Failed to connect to MySQL: ". mysqli_connect_error();
        }
        header('localhost: register.php');
    }

    public function emailavailable($umail){
        $checkuser = mysqli_query($this->dbcon, "SELECT email FROM register WHERE email = '$umail'");
        return $checkuser;
    }

    public function registration($umail, $password){
        $password = hash('md5', $password);
        $reg = mysqli_query($this->dbcon, "INSERT INTO users(email, password) VALUES('$umail', '$password')");
        return $reg;
    }

}

?>