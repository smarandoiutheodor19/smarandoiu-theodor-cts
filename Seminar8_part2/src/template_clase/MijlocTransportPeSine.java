package template_clase;

public abstract class MijlocTransportPeSine {
    protected abstract void opresteStatie1();
    protected abstract void opresteStatie2();
    protected abstract void opresteStatie3();

    public final void parcurgeTraseu(){
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
    }

    public final void parcurgeTraseuInvers(){
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    }
}
