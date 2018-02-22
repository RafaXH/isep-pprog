public class Pessoa {
    //
    // class object attributes
    //
    String nome;
    int idade;

    //class constants
    private static final String DEFAULT_NOME = "";
    private static final int DEFAULT_IDADE = 0;

    //class variables

    //
    // constructors
    //
    public Pessoa() {
        setNome(DEFAULT_NOME);
        setIdade(DEFAULT_IDADE);
    }

    public Pessoa(String nome) {
        setNome(nome);
        setIdade(0);
    }

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    //
    // getters
    //
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    //
    // setters
    //
    public void setNome(String novoNome) {
        if (novoNome.length() > 0) {
            this.nome = novoNome;
        } else {
            this.nome = "";
        }
    }

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {
            this.idade = novaIdade;
        }
    }

    //
    // methods
    //
    public String toString2() {
        if (this.nome.length() > 0) {
            return "O meu nome é " + this.nome + ".";
        } else {
            return "Não sei o meu nome.";
        }
    }

    public String toString3() {
        if (this.nome.length() > 0 && this.idade > 0 ) {
            return "O meu nome é " + this.nome + " e a minha idade é " + this.idade;
        } else if (this.nome.length() > 0 && this.idade == 0) {
            return "O meu nome é " + this.nome + " e não sei a minha idade.";
        } else {
            return "Não sei nem o meu nome nem a minha idade";
        }
    }

    public void cumprimentar(String nome) {
        System.out.println("Olá " + nome + "!");
    }
}
