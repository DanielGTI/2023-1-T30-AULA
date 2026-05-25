package sala_aula;

public class Partida {

    private Selecao casa;
    private Selecao visitante;
    private Local local;
    private Placar placar;

    // Inicializa uma partida com seleções, local e placar zerado.
    public Partida(Selecao casa, Selecao visitante, Local local) {
        this.casa = casa;
        this.visitante = visitante;
        this.local = local;
        this.placar = new Placar();
    }

    public Selecao getCasa() {
        return casa;
    }

    public Selecao getVisitante() {
        return visitante;
    }

    public Local getLocal() {
        return local;
    }

    public Placar getPlacar() {
        return placar;
    }

    // Registra o gol para o time da casa e para o jogador responsável.
    public void registrarGolCasa(Jogador jogador) {
        placar.golCasa();
        jogador.marcarGol();
    }

    // Registra o gol para o visitante e para o jogador responsável.
    public void registrarGolVisitante(Jogador jogador) {
        placar.golVisitante();
        jogador.marcarGol();
    }

    // Gera uma visão textual final com confronto, local e resultado.
    public String resumoPartida() {
        String info = "PARTIDA DA COPA DO MUNDO\n";
        info += casa.getPais() + " x " + visitante.getPais() + "\n";
        info += "Local: " + local.exibirLocal() + "\n";
        info += "Placar final: " + placar.exibirPlacar();
        return info;
    }
}
