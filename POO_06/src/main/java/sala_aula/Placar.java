package sala_aula;

public class Placar {

    private int golsCasa;
    private int golsVisitante;

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

    public void golCasa() {
        golsCasa++;
    }

    public void golVisitante() {
        golsVisitante++;
    }

    public String exibirPlacar() {
        return golsCasa + " x " + golsVisitante;
    }
}
