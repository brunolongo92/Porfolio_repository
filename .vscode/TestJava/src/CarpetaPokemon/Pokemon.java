package CarpetaPokemon;

public class Pokemon {
    //atributos
String nombre;
int vida; 
int nivel;
String tipo; 


    //contructores
    public int Random() {
return (int)Math.floor(Math.random()*11);
    }

public Pokemon (String nombre, int vida, int nivel, String tipo){
    this.nombre = nombre;
    this.vida = vida;
    this.nivel = nivel;
    this.tipo = tipo;
}

   //metodos
//Getters
   public String GetNombre() {
    return nombre;
   }

   public int GetNivel () {
       return nivel;
   }

   public int GetVida () {
    return vida;
   }

   public String GetTipo() {
    return tipo;
   }

   // Setters
   public void SetVida (int vida) {
    this.vida = vida;
   }

   public void SetNivel(int nivel) {
       this.nivel = nivel;
   }

   //Acciones
   public void atacarA(Pokemon nombre) {
    System.out.println(this.nombre + " ataca a " + nombre.GetNombre());
    nombre.recibirAtaqueDe(this.GetNombre());
}

   public void recibirAtaqueDe(String nombre) {
    this.SetVida(this.vida - Random());
}



}