
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato
{
    // atributos
    private int edad;
    private String nombre;
    private float peso = 1.0f;
    
    //Constructor
    public Gato (int edad, String nombre, float peso){
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public int edadHumana(int edad){
        return edad*7;
    }
    
    public void alimentar (int tipoDeComida){
        if(tipoDeComida == 0){
            System.out.println("Soy un gato comiendo carne");
        }else{
            System.out.println("Soy un gato que come whiskas");
        }
        }
        
    public String Interactuar(){
        return "Miau";
    }
    
    public void imprimirInformacion (){
        System.out.println("Soy un gato con " + edad + " años, y me llamo: " + nombre);
    }
    
}