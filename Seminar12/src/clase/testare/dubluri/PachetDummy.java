package clase.testare.dubluri;

import clase.agentie.IPachetTuristic;

public class PachetDummy implements IPachetTuristic {

    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
