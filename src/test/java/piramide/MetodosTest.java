package piramide;

import org.junit.Test;
import org.junit.Assert;

public class MetodosTest {

	
    @Test
    public void testGenerarPiramideNormalConAltura3() {
        Metodos piramide = new Metodos(3);

        String salidaEsperada = 
              "  *\n"
            + " ***\n"
            + "*****\n";
        Assert.assertEquals(salidaEsperada, piramide.dibujarPiramideNormal());
    }

  
    @Test
    public void testGenerarLineasCentralesConAltura3() {
        Metodos piramide = new Metodos(3);
        String salidaEsperada = 
              " ******\n";
        Assert.assertNotEquals(salidaEsperada, piramide.dibujarLineasCentrales());
    }

    
    @Test
    public void testGenerarPiramideNormalConAltura5() {
        Metodos piramide = new Metodos(5);
        String salidaEsperada = 
              "    *\n"
            + "   ***\n"
            + "  *****\n"
            + " *******\n"
            + "*********\n";
        Assert.assertEquals(salidaEsperada, piramide.dibujarPiramideNormal());
    }

 
    @Test
    public void testGenerarLineasCentralesConAltura5() {
        Metodos piramide = new Metodos(5);
        String salidaEsperada = 
              "   ****\n"
            + "       \n"
            + "   ****\n"
            + "  ******\n";
        Assert.assertNotEquals(salidaEsperada, piramide.dibujarLineasCentrales());
    }
}
