package strategy_clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata de " + pret + " prin SMS");
    }
}
