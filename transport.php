<!DOCTYPE HTML>
<html lang="en">
 <head>
    <title>Scarlett OverKill</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/styles.css" media="all" href="css/slideshow.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
   <body>
    <div id="container">
       <?php include("includes/header.html");?>
       <?php include("includes/nav.html");?>
      <div id="content">
	  <div id = "transport" align="center">
	   <center><h3>SELECT YOUR TRANSPORT</h3>
			<form action="" method="post">
					<h4>Please enter the amount of planes & spaceships required</h4>
					<img src="img/minionblimp.jpg" height="200" width="300">
			<table>
				<tr>
					<td>
                <h5>Airplanes:<input type="text" name="airplanes" placeholder = "Max 3"></h5>
                
					</td>
				<tr>
				<td><h5>Spaceships:<input type="text" name="spaceships" placeholder = "Max 2"></h5>
				</td></tr>
			</table></center>
			 </div>
			<div align="center">
				         <form action="index.php" method="POST">
								
								</form>
								<form action="cargo.php" method="POST">
								<p><input type="submit" value="Submit"></p>
								</form>
									</div>
	  </div>
        <?php include("includes/footer.html");?>
       </div>
   </body>
</html>