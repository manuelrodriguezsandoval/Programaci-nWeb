<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>


<title>Menú Ingreso</title>

</head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body id="fondo">
 <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
 <script src="js/funciones.js" type="text/javascript"></script>
    
<center><h1 id="menuentrada1" >RESTAURANT RESIDENT</h1></center>

<br></br>

<div id=contenedor onsubmit="return validarCampo()" >

<header>
<h2 >Ingrese menú de almuerzo:</h2>
</header>
    

<form name="menuInicial"  method="post" action="Servlet" onsubmit="return validarCampo()">
<p>Seleccione Vendedor: </p>
<select name="vendedor" id="vendedor">
                    
                    <option value="Emanuel Toro">Emanuel Toro  </option>
                    <option value="Fabian Leonard">Fabián Leonard</option>
                    <option value="Manuel Rodríguez">Manuel Rodríguez</option>
                    <option value="Claudia Vallejos">Claudia Vallejos</option>
                    
                </select>

<br>
<p>Elegir Menú : </p>
<select name="menu" id="menu"> 
                    
                    <option value="Cazuela de Ave">Cazuela de Ave</option>
                    <option value="Cazuela de Vacuno">Cazuela de Vacuno</option>
                    <option value="Pollo con papas fritas">Pollo con papas fritas</option>
                    <option value="Paila marina">Paila marina</option>
                    
                </select> <p  id="porciones">Porciones: </p>
<input type="number" name="pormenu" id="cantidad">

<br></br>
<br>
<p>Ensaladas : </p>
<select name="ensalada" id="ensalada">
                    
                    <option value="Sin Ensalada">Sin Ensalada</option>
                    <option value="Lechugas">Lechugas</option>
                    <option value="Tomate">Tomate</option>
                    <option value="Pepinos">Pepinos</option>
                </select>
<p id="porciones">Porciones: </p>
<input type="number" name="porensa" id="cantidad">
<br></br>
<br>
<p>Bebidas : </p>
<select name="bebestible" id="bebida">
                    
                    <option value="Agua">Agua</option>
                    <option value="Bebida de Fantasia">Bebida de Fantasia</option>
                    <option value="Cerveza">Cerveza</option>
                    <option value="Vino">Vino</option>
                </select>
<p>Unidades: </p>
<input type="number" name="cantidadbebida" id="cantidad">
<br></br>
<p>Observación: </p>
<textarea cols="40" name="observa" placeholder="Ingrese Observación"></textarea>


<br>

<br>
<br></br>






<input id="registro" type="submit" value="Facturar">

</form>

</div>

</body>
</html>