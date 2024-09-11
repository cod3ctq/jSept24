package objetos;

public class Mulltifuncional extends Impresora{

        Escanear escanear;
    public Mulltifuncional(String marca, String modelo, String tipoImpresion, boolean color) {
        super(marca, modelo, tipoImpresion, color);
    }
    public Mulltifuncional(){

    }

    public Mulltifuncional(Escanear escanear){
        super();
        this.escanear=escanear;
    }

    public Escanear getEscanear() {
        return escanear;
    }

    public void setEscanear(Escanear escanear) {
        this.escanear = escanear;
    }

    @Override
    public String toString() {
        return "Mulltifuncional{" +
                "escanear=" + escanear +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoImpresion='" + tipoImpresion + '\'' +
                ", color=" + color +
                '}';
    }
}
