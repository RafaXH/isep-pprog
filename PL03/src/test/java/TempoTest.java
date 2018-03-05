import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempoTest {
    /*@BeforeAll
    void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }*/

    /*@BeforeEach
    void executeBeforeEach() {
        Tempo t = new Tempo();
        System.out.println("@Before: executedBeforeEach");
    }*/

    @Test
    void getHora() {
        Tempo t = new Tempo();
        assertEquals(0, t.getHora());
    }

    @Test
    void getMinuto() {
        Tempo t = new Tempo();
        assertEquals(0, t.getMinuto());
    }

    @Test
    void getSegundo() {
        Tempo t = new Tempo();
        assertEquals(0, t.getSegundo());
    }

    @Test
    void toSentence() {
        Tempo t = new Tempo();
        assertEquals("00:00:00", t.toSentence(1));

        assertEquals("12:00:00 AM", t.toSentence(2));

        Tempo t2 = new Tempo("55:66:97");
        assertEquals("11:59:59 PM",t2.toSentence(2));


        Tempo t3 = new Tempo("8:66:97");
        assertEquals("08:59:59 AM",t3.toSentence(2));
    }

    @Test
    void addSegundo() {
        Tempo t = new Tempo("50:60:60");
        assertEquals("23:59:59", t.toSentence(1));
        t.addSegundo();
        assertEquals("00:00:00", t.toSentence(1));
        t.addSegundo();
        assertEquals("00:00:01", t.toSentence(1));

        Tempo t2 = new Tempo("22:60:60");
        assertEquals("22:59:59", t2.toSentence(1));
        t2.addSegundo();
        assertEquals("23:00:00", t2.toSentence(1));

        Tempo t3 = new Tempo("22:55:60");
        assertEquals("22:55:59", t3.toSentence(1));
        t3.addSegundo();
        assertEquals("22:56:00", t3.toSentence(1));
    }

    @Test
    void isMaiorTempo() {
        Tempo t1 = new Tempo();
        Tempo t2 = new Tempo("2:2:2");
        assertEquals(Boolean.TRUE,t2.isMaior(t1));
    }

    @Test
    void isMaiorString() {
        Tempo t1 = new Tempo();
        assertEquals(Boolean.FALSE,t1.isMaior("2:2:5"));
    }

    @Test
    void difTempo() {
        Tempo t = new Tempo("5:6:9");

        Tempo t2 = new Tempo("5:7:6");
        assertEquals(0,Tempo.difTempo(t2,t).getHora());
        assertEquals(0,Tempo.difTempo(t2,t).getMinuto());
        assertEquals(57,Tempo.difTempo(t2,t).getSegundo());

        Tempo t3 = new Tempo("6:4:20");
        assertEquals(23,Tempo.difTempo(t,t3).getHora());
        assertEquals(1,Tempo.difTempo(t,t3).getMinuto());
        assertEquals(49,Tempo.difTempo(t,t3).getSegundo());

        assertEquals(11, Tempo.difTempo(t3,t).getSegundo());
        assertEquals(58, Tempo.difTempo(t3,t).getMinuto());
        assertEquals(0, Tempo.difTempo(t3,t).getHora());

        System.out.println(Tempo.difTempo(t3,t).toSentence(1));
    }

    @Test
    void difTempoSegundos() {
        Tempo t = new Tempo("5:6:9");

        Tempo t2 = new Tempo("5:7:8");
        assertEquals(59,Tempo.difTempoSegundos(t2,t));
        
        t2 = new Tempo("6:4:20");
        assertEquals(23*3600+1*60+49,Tempo.difTempoSegundos(t,t2));
    }

    @Test
    void toStringTest() {
        Tempo t = new Tempo();
        assertEquals("Tempo{" + "hora=" + t.getHora() + ", minuto=" + t.getMinuto() + ", segundo=" + t.getSegundo() + '}',t.toString());
    }
}