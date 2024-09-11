package zoo;

public class Ave {

    double tamannoAlas=0;
    boolean puedeVolar;

    public Ave(double tamannoAlas, boolean puedeVolar) {
        this.tamannoAlas = tamannoAlas;
        this.puedeVolar = puedeVolar;
    }

    public Ave() {
    }

    public double getTamannoAlas() {
        return tamannoAlas;
    }

    public void setTamannoAlas(double tamannoAlas) {
        this.tamannoAlas = tamannoAlas;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
}
