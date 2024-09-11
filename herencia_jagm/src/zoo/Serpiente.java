package zoo;

public class Serpiente extends Animal{

    @Override
    public void hacerSonido() {
        System.out.println(" SSS ");
    }

    @Override
    public void comer() {
        System.out.println(" Come ratones ");
    }

    @Override
    public void dormir() {
        super.dormir();
    }
}
