package clase.testare.dubluri;

import clase.agentie.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private double valoareGetPret;
    private boolean valoarePoateRezerva;

    public void setValoareGetPret(double valoareGetPret) {
        this.valoareGetPret = valoareGetPret;
    }

    public void setValoarePoateRezerva(boolean valoarePoateRezerva) {
        this.valoarePoateRezerva = valoarePoateRezerva;
    }

    @Override
    public boolean poateRezerva() {
        return valoarePoateRezerva;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return valoareGetPret;
    }
}
