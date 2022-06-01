package clase.testare.teste;

import clase.agentie.AgentieTurism;
import clase.agentie.IPachetTuristic;
import clase.testare.categorii.TesteAdaugaPachet;
import clase.testare.categorii.TesteCalculeazaSumaToatala;
import clase.testare.categorii.TesteCuFake;
import clase.testare.dubluri.PachetDummy;
import clase.testare.dubluri.PachetFake;
import clase.testare.dubluri.PachetStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import static org.testng.AssertJUnit.assertEquals;

public class AgentieTurismTest {

    @Test
    @Category(TesteAdaugaPachet.class)
    public void testAdaugaPachet(){
        PachetDummy pachetDummy = new PachetDummy();
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1, agentieTurism.getNumarPachete());
    }

    @Test
    @Category(TesteCalculeazaSumaToatala.class)
    public void testCalculareSumaTotalaPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetStub());
        agentieTurism.adaugaPachet(new PachetStub());

        assertEquals(200.0, agentieTurism.calculareSumaTotalaPachete());
    }

    @Test
    @Category({TesteCalculeazaSumaToatala.class, TesteCuFake.class})
    public void testCalculareSumaTotalaPacheteFake(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake p1 = new PachetFake();
        p1.setValoareGetPret(100.0);
        PachetFake p2 = new PachetFake();
        p2.setValoareGetPret(200.0);
        agentieTurism.adaugaPachet(p1);
        agentieTurism.adaugaPachet(p2);

        assertEquals(300.0, agentieTurism.calculareSumaTotalaPachete());
    }
}
