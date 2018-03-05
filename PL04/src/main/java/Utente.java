

public class Utente {

    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;

    private static int num_utentes = 0;

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Utente(String nome, String genero, int idade, double altura, double peso) {
        this.setNome(nome);
        this.setGenero(genero);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);

        num_utentes = num_utentes + 1;
    }

    public double calcIMC() {
        return (this.getPeso()/Math.pow(this.getAltura(),2));
    }

    public String grauIMC() {
        if (this.calcIMC() < 18) {
            return "Magro";
        } else {
            if (this.calcIMC() > 25) {
                return  "Obeso";
            } else {
                return "Saudável";
            }
        }
    }

    public static int difIdades(Utente umUtente, Utente outroUtente) {
        return umUtente.getIdade() - outroUtente.getIdade();
    }

    public Utente isMaisNovo(Utente outroUtente) {
        if (Utente.difIdades(this,outroUtente) < 0) {
            return this;
        } else {
            return outroUtente;
        }
        //return umUtente.getIdade() > outroUtente.getIdade();
    }

    public static int getNum_utentes() {
        return num_utentes;
    }

    @Override
    public String toString() {
        return "O utente " + this.getNome() + " é do genero " + this.getGenero() + ", tem " + this.getIdade() + " anos de idade, " + this.getAltura() + "m de altura e pesa " + this.getPeso() + "kg.";
    }
}
