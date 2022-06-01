package clase.testare.teste;

import clase.agentie.PachetTuristic;
import clase.persoana.IPersoana;
import clase.persoana.Persoana;
import clase.testare.categorii.TesteAplicaDiscount;
import clase.testare.categorii.TesteBoundary;
import clase.testare.categorii.TesteCuFake;
import clase.testare.categorii.TestePoateRezerva;
import clase.testare.dubluri.PersoanaFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;


import static org.testng.AssertJUnit.*;

public class PachetTuristicTest {

    @Test
    @Category({TestePoateRezerva.class, TesteCuFake.class})
    public void testPoateRezerva(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(21);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucureti",100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TestePoateRezerva.class})
    public void testNuPoateRezerva(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(16);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucureti",100.0);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TestePoateRezerva.class, TesteCuFake.class, TesteBoundary.class})
    public void testBoundaryPoateRezerva(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucureti",100.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightAplicaDiscount(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(70);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(250.0, pachetTuristic.getPret(), 0.01);
    }

    @Test
    @Category({TesteCuFake.class, TesteAplicaDiscount.class})
    public void testRightNuAplicaDiscount(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(21);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Bucuresti", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(500.0, pachetTuristic.getPret(), 0.01);
    }
}
