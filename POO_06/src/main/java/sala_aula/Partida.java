package sala_aula;

public class Partida {

    private Selecao casa;
    private Selecao visitante;
    private Local local;
    private Placar placar;

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

    public void registrarGolCasa(Jogador jogador) {
        placar.golCasa();
        jogador.marcarGol();
    }

    public void registrarGolVisitante(Jogador jogador) {
        placar.golVisitante();
        jogador.marcarGol();
    }

    public String resumoPartida() {
        String info = "PARTIDA DA COPA DO MUNDO\n";
        info += casa.getPais() + " x " + visitante.getPais() + "\n";
        info += "Local: " + local.exibirLocal() + "\n";
        info += "Placar final: " + placar.exibirPlacar();
        return info;
    }
}
