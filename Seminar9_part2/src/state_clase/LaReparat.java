package state_clase;

public class LaReparat implements Stare{
    @Override
    public void doAction(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu nr " + autobuz.getNrAutobuz() + " intra in service");
            autobuz.setStare(this);
        } else {
            System.out.println("Autobuzul cu nr " + autobuz.getNrAutobuz() + " nu poate intra in service." +
                    "Trebuie sa ajunga la capat de linie");
        }
    }
}
