public class Main {
    public static void main(String[] args) {
        //
        // 1
        //
        Automovel a1 = new Automovel("11-11-AA","Toyota", 1400);
        //
        // 2
        //
        System.out.println(a1.toString());
        //
        // 3
        //
        System.out.println("A matrícula é " + a1.getMatricula());
        //
        // 4
        //
        System.out.println("O total de automóveis é " + Automovel.getTotalAutomoveis());
        //
        // 5
        //
        Automovel a2 = new Automovel();
        //
        // 6
        //
        a2.setCilindrada(1800);
        //
        // 7
        //
        System.out.println(a2.toString());
        //
        // 8
        //
        System.out.println("O total de automóveis é " + Automovel.getTotalAutomoveis());
        //
        // 9
        //
        System.out.println("A diferença de cilindrada entre a1 e a2 é " + a2.calcularDiferencaCilindrada(a1));
        //
        // 10
        //
        if (a1.isCilindradaMaior(a2)) {
            System.out.println("A cilindrada de a1 é maior que a de a2");
        } else if (a2.isCilindradaMaior(a1)) {
            System.out.println("A cilindrada de a2 é maior que a de a2");
        } else {
            System.out.println("Os dois carros têm a mesma cilindrada");
        }
        //
        // 11
        //
        if (a1.isCilindradaMaior(2000)) {
            System.out.println("A cilindrada de a1 é maior que 2000c");
        } else {
            System.out.println("A cilindrada de a1 não é maior que 2000c");
        }
    }
}
