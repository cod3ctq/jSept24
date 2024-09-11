package zoo;

public class Mamifero {
    boolean siTienePelo;
    int cantidadPatas;

    public boolean isSiTienePelo() {
        return siTienePelo;
    }

    public void setSiTienePelo(boolean siTienePelo) {
        this.siTienePelo = siTienePelo;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    public void setCantidadPatas(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }

    public Mamifero(boolean siTienePelo, int cantidadPatas) {
        this.siTienePelo = siTienePelo;
        this.cantidadPatas = cantidadPatas;
    }

    public Mamifero(){

    }


}
