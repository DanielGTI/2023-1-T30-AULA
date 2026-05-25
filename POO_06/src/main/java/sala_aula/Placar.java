package sala_aula;

public class Placar {

    private int golsCasa;
    private int golsVisitante;

    // Inicia o placar da partida com zero para os dois lados.
    public Placar() {
        this.golsCasa = 0;
        this.golsVisitante = 0;
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    // Soma um gol ao time mandante.
    public void golCasa() {
        golsCasa++;
    }

    // Soma um gol ao time visitante.
    public void golVisitante() {
        golsVisitante++;
    }

    // Retorna o formato classico de placar para exibicao.
    public String exibirPlacar() {
        return golsCasa + " x " + golsVisitante;
    }
}
