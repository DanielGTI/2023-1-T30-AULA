package sala_aula;

public class POO_04 {

    public static void main(String[] args) {
        
        Pessoa visitante = new Pessoa();
        
        visitante.nome = "Marcelo Gomes";
        visitante.cpf = "123.456.789";
        visitante.data_Nascimento = "01/05";
        
        visitante.apresentacao();
        
    }
}
