
/**
 * Write a description of class Perro here.
 * 
 * @author (Jhojan) 
 * @version (1)
 */
public class Perro
{
    // atributos
    private int edad;
    private String nombre;
    private float peso = 1.0f;
    
    //Constructor
    public Perro (int edad, String nombre, float peso){
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public int edadHumana(int edad){
        return edad*7;
    }
    
    public void alimentar (int tipoDeComida){
        if(tipoDeComida == 0){
            System.out.println("Soy un perro comiendo carne");
        }else{
            System.out.println("Soy un perro que come croquetas");
        }
        }
        
    public String Interactuar(){
        return "Guau";
    }
    
    public void imprimirInformacion (){
        System.out.println("Soy un perro con " + edad + " años, y me llamo: " + nombre);
    }
    
}