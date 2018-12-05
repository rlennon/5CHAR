<!DOCTYPE HTML>
<html lang="en">
<head>
   <title Scarlett OverKill></title>
   <meta charset="utf-8">
   <link rel="stylesheet" href="css/styles.css" media="all">
   <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
</head>
 <body>
  <div id="container">
    <?php include("includes/header.html");?>
    <?php include("includes/nav.html");?>
	<div id="content">
	<div id="admin">
     <h3>Administator Area</h3>
      <?php
       session_start();
       if(isset($_SESSION['username'])){
       $username=$_SESSION['username'];
       echo "Hi-".$username."!"."";
       echo "Choose one of the menu options to View, Change or Delete Order. &nbsp;&nbsp;";
       echo "<p><a href='vieworder.php'>View Order</a>
       <p><a href='manageorder.php'>Manage Order</a>
       <p><a href='deleteorder.php'>Delete Order</a>
       <p><a href='logout.php'>Logout</a>";
        }
      ?>
     </div>
	  <div id="logo"><img src="img/giphy.gif" width="400" height="300" border="2"></div>
	 </div>
       <?php include("includes/footer.html");?>
  </div>
 </body>
</html>