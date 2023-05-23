
package sala_aula;

public class Aluno extends Pessoa {

    private String RA;

    public Aluno(String nome, String cpf, String data_nascimento) {
        super(nome, cpf, data_nascimento);
    }

    
    // Polimorfismo
    @Override
    public String exibir_cadastro(){
        
        String info;
        
        info = "-----------------\n";
        info += "Aluno............";
        info += super.exibir_cadastro();
        
        return info;
    }
    
    

    
    
    
}
