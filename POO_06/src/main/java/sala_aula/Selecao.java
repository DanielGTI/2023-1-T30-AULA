package sala_aula;

import java.util.ArrayList;
import java.util.List;

public class Selecao {

    // ENCAPSULAMENTO:
    // Informacoes internas da selecao ficam protegidas por private.
    private String pais;
    private String tecnico;
    private List<Jogador> jogadores;

    // Cria a selecao com dados iniciais e lista vazia de jogadores.
    public Selecao(String pais, String tecnico) {
        this.pais = pais;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    // Adiciona um jogador ao elenco da selecao.
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    // Soma os gols de todos os jogadores cadastrados na selecao.
    public int getTotalGolsJogadores() {
        int total = 0;
        for (Jogador jogador : jogadores) {
            total += jogador.getGolsNaCopa();
        }
        return total;
    }

    // Monta uma descricao textual do elenco para exibicao.
    public String listarJogadores() {
        String info = "Selecao: " + pais + " | Tecnico: " + tecnico + "\n";

        for (Jogador jogador : jogadores) {
            info += " - " + jogador.getNome() + " (" + jogador.getPosicao() + ")\n";
        }

        return info;
    }
}
