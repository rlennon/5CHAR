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
	  <div id="cargo" align="center">
	  <h4>Select cargo for Airplane 1</h4>
                    <select>
                      <option value="minions">All Minions</option>
                      <option value="half">Half n' Half</option>
                      <option value="lasers">Lasers Only</option>
                    </select></br>
                <h4>Select cargo for Airplane 2</h4>
                    <select>
                        <option value="minions">All Minions</option>
                        <option value="half">Half n' Half</option>
                        <option value="lasers">Lasers Only</option>
                    </select></br>
                <h4>Select cargo for Spaceship 1</h4>    
                    <select>
                        <option value="minions">All Minions</option>
                        <option value="half">Half n' Half</option>
                        <option value="lasers">Lasers Only</option>
                    </select>
          
					</table>
					</div>
                <div align="center">
						<form action="transport.php" method="POST">
							<p><input type="submit" value="Back"></p>
								</form>
								<form action="checkorder.php" method="POST">
								<p><input type="submit" value="Submit"></p>
								</form>
				</div>
							
					</div>
        <?php include("includes/footer.html");?>
       </div>
   </body>
</html>