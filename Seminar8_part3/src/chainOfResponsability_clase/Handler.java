package chainOfResponsability_clase;

public abstract class Handler {
    protected int prag;
    protected Handler nextHandler;

    public Handler(int prag, Handler nextHandler) {
        this.prag = prag;
        this.nextHandler = nextHandler;
    }

    public Handler(int prag) {
        this.prag = prag;
        this.nextHandler = null;
    }

    public void setPrag(int prag) {
        this.prag = prag;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void afiseazaCuCeSaMearga(int distanta);
}
