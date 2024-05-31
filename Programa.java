
/**
 * Write a description of class Programa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.Console;
public class Programa
{
    public static void main(String args [])
    {
            Console Miconsola = System.console();
            System.out.println("Ingresa el nombre del perro");
            String nombrePerro = Miconsola.readLine();
        Perro miPerro = new Perro(4, nombrePerro, 6.5f);
        miPerro.alimentar(1);
        miPerro.Interactuar();
        miPerro.imprimirInformacion();
        
        Gato miGato = new Gato(1, "Coby", 0.8f);
        miGato.alimentar(1);
        miGato.Interactuar();
        miGato.imprimirInformacion();
    }
}
