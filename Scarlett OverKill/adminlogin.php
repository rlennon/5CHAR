<!DOCTYPE HTML>
<html lang="en">
<head>
  <title> Scarlett OverKill</title>
  <meta charset="utf-8">
 <link rel="stylesheet" href="css/styles.css" media="all">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 </head>
<body>
<div id="container">
<?php include("includes/header.html");?>
<?php include("includes/nav.html");?>
<div id="content">
<div id="login">
<?php
if (empty($_SESSION))
session_start();
if (isset($_SESSION['errors'])) {
echo "<div class='form-errors'>";
foreach($_SESSION['errors'] as $error)
{
echo "<p>";
echo $error;
echo "</p>";
}
echo "</div>";
}
unset($_SESSION['errors']);
?>
<h3> Login </h3>
<form action="login_action.php" method="POST">
<p>Username: <input type="text" name="admin_name" required="required"></p>
<p>Password  : <input type="password" name="password" required="required"></p>
<p><input type="submit" value="Login"></p>
</form>
</div>
</div>
<?php include("includes/footer.html");?>
</div>
</body>
</html>