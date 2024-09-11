package zoo;

public class Aguila extends Animal{

    @Override
    public void hacerSonido() {
        System.out.println(" CHillido ");
    }

    @Override
    public void comer() {
        System.out.println(" Caza conejos y pescado ");
    }

    @Override
    public void dormir() {
        super.dormir();
    }
}
