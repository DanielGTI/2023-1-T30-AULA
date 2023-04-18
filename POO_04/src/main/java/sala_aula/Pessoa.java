
package sala_aula;


public class Pessoa {
    
    public String nome;
    public String cpf;
    public String data_Nascimento;
    
    
    public boolean entrar(){
        return true;
    }
    
    public boolean sair(){
        return true;
    }
    
    void apresentacao(){
        System.out.println("Meu nome é " + this.nome);
        System.out.println("Meu cpf é " + this.cpf);
    }
}
