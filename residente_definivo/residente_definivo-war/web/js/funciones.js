/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   function validarCampo() {
       var canMenu = document.forms["menuInicial"]["pormenu"].value;
    if (canMenu  === "") {
        alert("Por favor ingresar cantidad de menu a solicitar");
   
        return false;
    
    }
    var canensalada = document.forms["menuInicial"]["porensa"].value;
    if (canensalada  === "") {
        alert("Debe ingresar cantidad de ensalada(s)");
   
        return false;
    
    }
    
    var canBebida = document.forms["menuInicial"]["cantidadbebida"].value;
    if (canBebida  === "") {
        alert("Debe ingresar cantidad de bebidas");
   
        return false;
    
    }
    
    
    var observacion = document.forms["menuInicial"]["observa"].value;
    if (observacion === "") {
        alert("Debe ingresar una observación");
        return false;
    }
   }
    
