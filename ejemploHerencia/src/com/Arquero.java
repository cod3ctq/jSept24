package com;
class Arquero extends Deportista implements IOdontologia {
	    // Implementación del método abstracto entrenar
	    @Override
	    void entrenar() {
	        System.out.println("Entrenando habilidades de tiro con arco.");
	    }
	    
	    // Puedes añadir métodos específicos de Arquero
	    void apuntar() {
	        System.out.println("Apuntando con el arco.");
	    }
	

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Arquero
        Arquero archer = new Arquero();
        
        // Llamar al método implementado
        archer.entrenar();  // Salida: Entrenando habilidades de tiro con arco.
        
        // Llamar al método heredado de Deportista
        archer.descansar(); // Salida: Descansando...
        
        // Llamar al método específico de Arquero
        archer.apuntar();   // Salida: Apuntando con el arco.
    }
}
}

