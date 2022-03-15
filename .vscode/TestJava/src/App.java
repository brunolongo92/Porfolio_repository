import CarpetaPokemon.*;

public class App {
    public static void main(String[] args) throws Exception {

Pokemon pikachu = new Pokemon ("Pikachu", 100, 1, "Eléctrico");
Pokemon kabutops = new Pokemon ("Kabutops", 100, 1, "Agua");

while (pikachu.GetVida() > 0 && kabutops.GetVida() > 0) {
pikachu.atacarA(kabutops);
System.out.println("Kabutops tiene " + kabutops.GetVida() + " puntos de vida");
kabutops.atacarA(pikachu);
System.out.println("Pikachu tiene " + pikachu.GetVida() + " puntos de vida");
}

if (pikachu.GetVida() < 1) {;
    System.out.println("GANÓ KABUTOPS!");
    } 
    else 
    {System.out.println("GANÓ PIKACHU!");}}}