package zoo;

public class Leon extends Animal{
    @Override
    public void hacerSonido(){
        System.out.println("RUGE");
    }

    @Override
    public void comer() {
        System.out.println("Come carne");
    }

    @Override
    public void dormir() {
        super.dormir();
    }
}
