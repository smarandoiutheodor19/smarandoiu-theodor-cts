package proxy_clase;

public class MijlocTransportNoapte implements MijlocTransport{

    private MijlocTransport mijlocTransport;

    public MijlocTransportNoapte(MijlocTransport mijlocTransport) {
        this.mijlocTransport = mijlocTransport;
    }

    @Override
    public void opresteInStatie() {
        if(mijlocTransport.getNrCalatori() > 0) {
            mijlocTransport.opresteInStatie();
        } else {
            System.out.println("Autobuzul de noapte nu opreste");
        }
    }

    @Override
    public int getNrCalatori() {
        return mijlocTransport.getNrCalatori();
    }
}
