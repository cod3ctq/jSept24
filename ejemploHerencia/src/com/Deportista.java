package com;
abstract class Deportista {
    // Método abstracto (debe ser implementado por las subclases)
    abstract void entrenar();

    // Método concreto
    void descansar() {
        System.out.println("Descansando...");
    }
}
