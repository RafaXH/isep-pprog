import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtenteTest {

    @Test
    void setNome() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        u1.setNome("Nappy");
        assertEquals("Nappy",u1.getNome());
    }

    @Test
    void setGenero() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        u1.setGenero("feminino");
        assertEquals("feminino",u1.getGenero());
    }

    @Test
    void setIdade() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        u1.setIdade(33);
        assertEquals(33,u1.getIdade());
    }

    @Test
    void setAltura() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        u1.setAltura(2);
        assertEquals(2,u1.getAltura());
    }

    @Test
    void setPeso() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        u1.setPeso(50);
        assertEquals(50,u1.getPeso());
    }

    @Test
    void calcIMC() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        assertEquals(u1.getPeso()/Math.pow(u1.getAltura(),2),u1.calcIMC());
    }

    @Test
    void grauIMC() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,60);
        assertEquals("Magro",u1.grauIMC());
        u1.setPeso(90);
        assertEquals("Saudável",u1.grauIMC());
        u1.setPeso(110);
        assertEquals("Obeso",u1.grauIMC());
    }

    @Test
    void difIdades() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        Utente u2 = new Utente("Mafs","feminino",30,1.7,60);
        assertEquals(-4,Utente.difIdades(u1,u2));
    }

    @Test
    void maisNovo() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        Utente u2 = new Utente("Mafs","feminino",30,1.7,60);
        assertEquals(u1,u1.isMaisNovo(u2));
        assertEquals(u1,u2.isMaisNovo(u1));
    }

    @Test
    void getNum_utentes() {
        int temp = Utente.getNum_utentes();
        Utente u3 = new Utente("Rafa","masculino",26,1.9,110);
        assertEquals(temp+1,Utente.getNum_utentes());
    }

    @Test
    void toStringTest() {
        Utente u1 = new Utente("Rafa","masculino",26,1.9,110);
        assertEquals("O utente " + u1.getNome() + " é do genero " + u1.getGenero() + ", tem " + u1.getIdade() + " anos de idade, " + u1.getAltura() + "m de altura e pesa " + u1.getPeso() + "kg.",u1.toString());
    }
}