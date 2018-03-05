import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    @Test
    void setCumprimento() {
        Retangulo r = new Retangulo(3,4,"popo");
        assertEquals(3,r.getComprimento());
        r.setComprimento(4);
        assertEquals(4,r.getComprimento());
    }

    @Test
    void toStringTest() {
        Retangulo r = new Retangulo("blau");
        assertEquals("Retângulo: comprimento=2.0 largura=1.0 cor=blau",r.toString());
    }

    @Test
    void setLargura() {
        Retangulo r = new Retangulo();
        r.setLargura(6);
        assertEquals(6, r.getLargura());
    }

    @Test
    void getArea() {
        Retangulo r1 = new Retangulo(5, 2);
        assertEquals(10, r1.getArea());

        Retangulo r2 = new Retangulo();
        assertEquals(2, r2.getArea());
    }

}