package sala_aula;

public class POO_04 {

    public static void main(String[] args) {
        
        Pessoa visitante = new Pessoa("Marcelo Gomes", "123.456.789", "01/05");
        visitante.matricula();
        visitante.apresentacao();
        visitante.trancar();
        visitante.apresentacao();
        
        
        //  Pessoa visitante_2 = new Pessoa("Daniel", "456.789", "01/06");
        //  visitante_2.apresentacao();
        
        
        
    }
}
