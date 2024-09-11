package zoo;

public class Reptil {

    boolean esVenenoso;
    boolean poneHuevos;

    public Reptil(boolean esVenenoso, boolean poneHuevos) {
        this.esVenenoso = esVenenoso;
        this.poneHuevos = poneHuevos;
    }

    public Reptil() {
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean isPoneHuevos() {
        return poneHuevos;
    }

    public void setPoneHuevos(boolean poneHuevos) {
        this.poneHuevos = poneHuevos;
    }
}
