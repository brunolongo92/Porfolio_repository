
function Editar() {
    document.getElementById("texto_1").contentEditable = true;
    document.getElementById("boton_e").style.display = "none";
  }
  
  function Confirmar() {
    document.getElementById("texto_1").contentEditable = false;
    document.getElementById("boton_e").style.display = "";
  }
  