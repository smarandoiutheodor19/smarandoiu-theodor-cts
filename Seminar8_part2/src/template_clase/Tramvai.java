package template_clase;

public class Tramvai extends MijlocTransportPeSine {

    @Override
    protected void opresteStatie1() {
        System.out.println("Oprire in statie 1");
    }

    @Override
    protected void opresteStatie2() {
        System.out.println("Oprire in statie 2");
    }

    @Override
    protected void opresteStatie3() {
        System.out.println("Oprire in statie 3");
    }
}
