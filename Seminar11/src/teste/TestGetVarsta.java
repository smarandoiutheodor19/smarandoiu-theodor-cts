package teste;

import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetVarsta {

    @Test
    public void testRightVarsta(){
        Persoana persoana = new Persoana("Ion", "600122221435");
        assertEquals(21, persoana.getVarsta());
    }


    @Test
    public void testBoundaryVarstaInferior(){
        Persoana persoana = new Persoana("Ion", "3000101221435");
        assertEquals(222, persoana.getVarsta());
    }

    @Test
    public void testBoundaryVarstaSuperior(){
        Persoana persoana = new Persoana("Ana", "6220101221435");
        assertEquals(0, persoana.getVarsta());
    }

    @Test(expected = CNPIncorect.class)
    public void testErrorVarsta(){
        Persoana persoana = new Persoana("Ana", "623010134567");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void testPerformanceVarsta(){
        Persoana persoana = new Persoana("Ana", "621010134567");
        persoana.getVarsta();
    }

    @Test
    public void testOrderVarsta(){
        Persoana persoana1 = new Persoana("Ana", "600010134567");
        Persoana persoana2 = new Persoana("Andrei", "199010134567");
        assertTrue(persoana1.getVarsta() < persoana2.getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testExistenceVarsta(){
        Persoana persoana = new Persoana("Ana", null);
        persoana.getVarsta();
    }


}