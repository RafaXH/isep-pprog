import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    @Test
    void getRaio() {
        Circulo c = new Circulo("pim");
        assertEquals(1,c.getRaio());
    }

    @Test
    void toStringTest() {
        Circulo c = new Circulo(5);
        assertEquals("Círculo: raio=5.0 cor=cinzento",c.toString());
    }

    @Test
    void getArea() {
        Circulo c = new Circulo(2,"fac");
        assertEquals(Math.PI*Math.pow(c.getRaio(),2),c.getArea());
    }

    @Test
    void setRaio() {
        Circulo c = new Circulo();
        c.setRaio(2);
        assertEquals(2,c.getRaio());
    }

}