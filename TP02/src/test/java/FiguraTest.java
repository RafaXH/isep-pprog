import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    @Test
    void getCor() {
        Figura f = new Figura();
        assertEquals("cinzento", f.getCor());
    }

    @Test
    void setCor() {
        Figura f = new Figura();
        f.setCor("blue");
        assertEquals("blue", f.getCor());
    }

}