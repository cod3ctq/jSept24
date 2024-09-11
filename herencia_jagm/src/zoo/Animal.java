package zoo;

public class Animal {
    String nombre;
    int edad;
    String tipoAnimal;

    public Animal(String nombre, int edad, String tipoAnimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
    }
    public Animal(){
        
    }

    public void hacerSonido(){
        System.out.println("Hace un sonido......");
    }

    public void comer(){
        System.out.println("Esta comiendo ...");

    }

    public void dormir(){
        System.out.println("Esta dormido .....");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}
