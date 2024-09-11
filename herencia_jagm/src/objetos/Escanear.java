package objetos;

public class Escanear {
    int ppi;
    String[] formatos;
    double areaEscaneo;

    public Escanear(int ppi, String[] formatos, double areaEscaneo) {
        this.ppi = ppi;
        this.formatos = formatos;
        this.areaEscaneo = areaEscaneo;
    }

    public Escanear(){

    }

    public int getPpi() {
        return ppi;
    }

    public void setPpi(int ppi) {
        this.ppi = ppi;
    }

    public String[] getFormatos() {
        return formatos;
    }

    public void setFormatos(String[] formatos) {
        this.formatos = formatos;
    }

    public double getAreaEscaneo() {
        return areaEscaneo;
    }

    public void setAreaEscaneo(double areaEscaneo) {
        this.areaEscaneo = areaEscaneo;
    }


}
