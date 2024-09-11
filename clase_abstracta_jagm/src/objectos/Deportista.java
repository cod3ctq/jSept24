package objectos;

public abstract  class Deportista {
String nombre;
String datos;

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Deportista(String nombre, String datos) {
        this.nombre = nombre;
        this.datos = datos;
    }

    public Deportista() {
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", datos='" + datos + '\'' +
                '}';
    }

    public abstract void entrenar();
}
