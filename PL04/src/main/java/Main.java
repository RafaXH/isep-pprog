public class Main {
    public static void main(String args[]) {
        Utente u1 = new Utente("Rafa", "masculino", 26, 1.9,110);
        System.out.println(u1.toString());
        System.out.format("IMC = %.2f\n",u1.calcIMC());
        System.out.println(u1.grauIMC());

        Utente u2 = new Utente("Naps", "Feminino", 55, 1.7,70);
        System.out.println(u2.toString());
        System.out.format("IMC = %.2f\n",u2.calcIMC());
        System.out.println(u2.grauIMC());

        System.out.println(Utente.difIdades(u1,u2));
        System.out.println(u1.isMaisNovo(u2).getNome() + " é o mais novo");

        System.out.println("Este ginásio tem " + Utente.getNum_utentes() + " utentes");

        u1.setPeso(u1.getPeso()-5);
        System.out.println(u1.toString());
        System.out.format("IMC = %.2f\n",u1.calcIMC());
        System.out.println(u1.grauIMC());

        u1.setPeso(u1.getPeso()-5);
        System.out.println(u1.toString());
        System.out.format("IMC = %.2f\n",u1.calcIMC());
        System.out.println(u1.grauIMC());

        u1.setPeso(u1.getPeso()-5);
        System.out.println(u1.toString());
        System.out.format("IMC = %.2f\n",u1.calcIMC());
        System.out.println(u1.grauIMC());

        u1.setPeso(u1.getPeso()-5);
        System.out.println(u1.toString());
        System.out.format("IMC = %.2f\n",u1.calcIMC());
        System.out.println(u1.grauIMC());
    }
}
