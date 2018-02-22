import java.util.Scanner;

public class Main {
    //import Pessoa;

    public static void main(String[] args){

        // 1
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o teu nome?");
        String s = in.next();

        System.out.println("Olá " + s);
        System.out.println("");


        // 1.2
        Pessoa eu = new Pessoa();

        eu.cumprimentar("José");
        System.out.println(eu.toString2());
        System.out.println(eu.toString3());
        System.out.println("");

        // 2 e 3
        Pessoa dois = new Pessoa("Rafael");
        System.out.println(dois.toString2());
        System.out.println(dois.toString3());
        System.out.println("");

        Pessoa tres = new Pessoa("Alberta", 7);
        System.out.println(tres.toString2());
        System.out.println(tres.toString3());
        System.out.println("");

        Pessoa quatro = new Pessoa("Quatarina", -5);
        System.out.println(quatro.toString2());
        System.out.println(quatro.toString3());
    }
}
