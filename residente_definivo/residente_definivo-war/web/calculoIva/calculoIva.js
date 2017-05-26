
function calcularTotal(){
    var precioMenu   = document.getElementById('cajitas5').value;
    var cantidadMenu = document.getElementById('cajitas6').value;
    var totalMenu      = cantidadMenu*precioMenu;
    document.getElementById('cajitas7').value = totalMenu;
    }
 function calcularIVA(){
   var preciopagar   = document.getElementById('precio2').value;
   var final= (preciopagar * 1.19);
   document.getElementById("precio2").innerHTML=final;
}
