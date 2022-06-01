package strategy_clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata de " + pret + " prin card bancar");
    }
}
