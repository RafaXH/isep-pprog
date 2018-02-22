public class TesteData {

    public static void main(String[] args) {

        data.Data data1 = new data.Data();

        System.out.println(data1.toString());

        data.Data data2 = new data.Data(2018,2,22);

        System.out.println(data2.toString());

        if (data2.isMaior(data1)) {
            System.out.println("data2 é maior que data1");
        } else {
            System.out.println("data2 não é maior que data1");
        }

        System.out.println("Entre data1 e data2 passam " + data2.calcularDiferenca(data1) + " dias.");

        data.Data data3 = new data.Data(2018,12,25);

        if (data3.isMaior(data2)) {
            System.out.println("Faltam " + data3.calcularDiferenca(data2) + " dias para o Natal.");
        } else {
            System.out.println("O Natal já passou!");
        }
        // System.out.println("Faltam " + data3.calcularDiferenca(data2) + " dias para o Natal.");

        data.Data data4 = new data.Data(1974,4,25);

        System.out.println("O 25 de Abril de 1974 foi " + data4.determinarDiaDaSemana() + ".");
        // objeto
        if (data4.isAnoBissexto()) {
            System.out.println("O ano de 1974 foi bisexto.");
        } else {
            System.out.println("O ano de 1974 não foi bisexto.");
        }
        // classe
        if (data.Data.isAnoBissexto(1974)) {
            System.out.println("O ano de 1974 foi bisexto.");
        } else {
            System.out.println("O ano de 1974 não foi bisexto.");
        }

    }

}