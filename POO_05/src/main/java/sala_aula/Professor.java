
package sala_aula;

public class Professor extends Pessoa{
    
    public double salario;
    public String matricula;
    
    public Professor(String nome, String cpf, String data_nascimento) {
        super(nome, cpf, data_nascimento);
    }
    
        
    // Polimorfismo
    @Override
    public String exibir_cadastro(){
        
        String info;
        
        info =  "-----------------\n";
        info += "Professor........";
        info += super.exibir_cadastro();
        info += "\nSalario = R$ " + salario;
        
        return info;
    }
}
