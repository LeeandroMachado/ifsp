<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta chartset="UTF-8" />
    <title>Calculo de area</title>
  </head>
  <body> 
    <h1>Calculo de area</h1>
    
    <form action="Calculate" method="GET">  
			<table style="width: 50%">
				<tr>
					<td>Selecione a forma: </td>
					<td>
						<select name="geometry">
							<option value="circle">Circulo</option>
							<option value="triangle">Triangulo</option>
							<option value="square">Quadrado</option>
						</select>
					</td>
				</tr>
			</table>
			
      <input type="submit" value="Submit" />
    </form>
  </body>
</html>