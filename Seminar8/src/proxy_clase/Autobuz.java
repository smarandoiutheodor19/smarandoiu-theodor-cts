package proxy_clase;

public class Autobuz implements MijlocTransport{
    private int nrCalatori;
    private String nrAutobuz;

    public Autobuz(int nrCalatori, String nrAutobuz) {
        this.nrCalatori = nrCalatori;
        this.nrAutobuz = nrAutobuz;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + nrAutobuz + " a oprit in statie cu " + nrCalatori);
    }
}
