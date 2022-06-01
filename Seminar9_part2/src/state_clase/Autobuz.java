package state_clase;

public class Autobuz {
    private int nrAutobuz;
    private Stare stare;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare = new LaCapatDeLinie();
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void pleacaInCursa() {
        new InCursa().doAction(this);
    }

    public void ajungeLaCapatDeLinie() {
        new LaCapatDeLinie().doAction(this);
    }

    public void trimiteInService() {
        new LaReparat().doAction(this);
    }

    public void iesireDinService() {
        new LaCapatDeLinie().doAction(this);
    }

}
