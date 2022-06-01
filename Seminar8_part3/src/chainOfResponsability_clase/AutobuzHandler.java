package chainOfResponsability_clase;

public class AutobuzHandler extends Handler{

    public AutobuzHandler(int prag, Handler nextHandler) {
        super(prag, nextHandler);
    }

    @Override
    public void afiseazaCuCeSaMearga(int distanta) {
        if(distanta < prag) {
            System.out.println("Te poti deplasa cu autobuzul");
        } else {
            nextHandler.afiseazaCuCeSaMearga(distanta);
        }
    }
}
