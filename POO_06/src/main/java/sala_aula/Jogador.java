package sala_aula;

// HERANCA:
// Jogador herda atributos e comportamentos de Pessoal.
public class Jogador extends Pessoal {

    // ENCAPSULAMENTO:
    // Dados especificos do jogador ficam protegidos com private.
    private String posicao;
    private int numeroCamisa;
    private int golsNaCopa;

    public Jogador(String nome, int idade, String pais, String posicao, int numeroCamisa) {
        super(nome, idade, pais);
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
        this.golsNaCopa = 0;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public int getGolsNaCopa() {
        return golsNaCopa;
    }

    public void marcarGol() {
        golsNaCopa++;
    }

    // POLIMORFISMO:
    // Implementacao especifica do metodo abstrato herdado de Pessoal.
    @Override
    public String descreverPapel() {
        return "Jogador " + getNome() + " joga como " + posicao
                + " e usa a camisa " + numeroCamisa + ".";
    }
}
