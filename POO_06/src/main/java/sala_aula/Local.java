package sala_aula;

public class Local {

    private String estadio;
    private String cidade;
    private int capacidade;

    // Define os dados basicos do estadio onde a partida acontece.
    public Local(String estadio, String cidade, int capacidade) {
        this.estadio = estadio;
        this.cidade = cidade;
        this.capacidade = capacidade;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    // Atualiza a capacidade apenas com valores positivos.
    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        }
    }

    // Retorna uma descricao pronta para exibicao em telas e relatorios.
    public String exibirLocal() {
        return estadio + " - " + cidade + " (Capacidade: " + capacidade + ")";
    }
}
