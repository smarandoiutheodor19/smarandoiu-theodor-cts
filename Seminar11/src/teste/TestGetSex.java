package teste;

import clase.Persoana;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestGetSex {

    @Test
    public void testRightSex(){
        Persoana persoana = new Persoana("Ion", "500122221435");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testRightSexF(){
        Persoana persoana = new Persoana("Ana", "200122221435");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testBoundarySexInferior(){
        Persoana persoana = new Persoana("Ion", "1000101221435");
        assertEquals("M", persoana.getSex());
    }


    @Test
    public void testBoundarySexSuperior(){
        Persoana persoana = new Persoana("Ana", "6220101221435");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheckSex(){
        Persoana persoana = new Persoana("Ana", "6220101221435");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra%2 != 0 ? "M" : "F", persoana.getSex());
    }


    @Test(expected = CNPIncorect.class)
    public void testErrorSex(){
        Persoana persoana = new Persoana("Ana", "0220101221435");
        persoana.getSex();
    }

    @Test(timeout = 100)
    public void testPerformanceSex(){
        Persoana persoana = new Persoana("Ana", "6220101221435");
        persoana.getSex();
    }

    @Test
    public void testFormatSex(){
        Persoana persoana = new Persoana("Ana", "6220101221435");
        assertEquals(1, persoana.getSex().length());
    }

    @Test(expected = NullPointerException.class)
    public void testExistenceSex(){
        Persoana persoana = new Persoana("Ana", null);
        persoana.getSex();
    }
}