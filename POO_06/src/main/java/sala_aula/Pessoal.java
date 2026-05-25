package sala_aula;

// ABSTRACAO:
// Classe base abstrata representa caracteristicas comuns de pessoas no sistema.
// Ela nao pode ser instanciada diretamente, apenas herdada.
public abstract class Pessoal {

    // ENCAPSULAMENTO:
    // Atributos privados para proteger o estado interno do objeto.
    private String nome;
    private int idade;
    private String pais;

    public Pessoal(String nome, int idade, String pais) {
        this.nome = nome;
        this.idade = idade;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String exibirDadosBasicos() {
        return "Nome: " + nome + " | Idade: " + idade + " | Pais: " + pais;
    }

    // ABSTRACAO + POLIMORFISMO:
    // Cada classe filha define de forma propria o seu papel.
    public abstract String descreverPapel();
}
