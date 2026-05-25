package sala_aula;

public class Local {

    private String estadio;
    private String cidade;
    private int capacidade;

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

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
            this.capacidade = capacidade;
        }
    }

    public String exibirLocal() {
        return estadio + " - " + cidade + " (Capacidade: " + capacidade + ")";
    }
}
