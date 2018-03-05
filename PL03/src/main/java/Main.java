public class Main {
    public static void main(String args[]){
        Tempo t1 = new Tempo("5:30:12");

        System.out.println(t1.toString());

        System.out.println(t1.toSentence(2));

        t1.addSegundo();;

        System.out.println(t1.toSentence(2));

        Tempo t2 = new Tempo("18:5:20");

        System.out.println(t2.toSentence(2));

        System.out.println("t1 > t2 = " + t1.isMaior(t2));

        System.out.println("t1 > Tempo(23:7:4) = " + t1.isMaior("23:7:14"));

        Tempo t = new Tempo();
        System.out.println(t.toSentence(1));
        System.out.println(t.toSentence(2));

        Tempo t3 = new Tempo("0:99:99");
        System.out.println(t3.toSentence(2));
        Tempo t4 = new Tempo("12:1:0");
        System.out.println(t4.toSentence(2));
        System.out.println(Tempo.difTempo(t3,t4).toSentence(1));
        System.out.println(Tempo.difTempoSegundos(t3,t4));


        Tempo t5 = new Tempo("5:6:9");

        Tempo t6 = new Tempo("6:4:20");

        System.out.println(Tempo.difTempo(t6,t5).toSentence(1));
    }
}
