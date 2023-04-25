
package sala_aula;
/*
    + publico   public  (todas as classes)
    - privado   private (somente a classe atual)
    # protegido (somente a classe atual e subclasses)
*/

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String data_Nascimento;
    
    // Método Construtor

    public Pessoa(String nome, String cpf, String data_Nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_Nascimento = data_Nascimento;
    }
    
    public boolean entrar(){
        return true;
    }
    public boolean sair(){
        return true;
    }
    
    void apresentacao(){
        System.out.printf("\n\nMeu nome é " + this.getNome());
        System.out.printf("\nMeu cpf é " + this.getCpf());
    }

    // Método Acessores e Modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }

    public void setData_Nascimento(String data_Nascimento) {
        this.data_Nascimento = data_Nascimento;
    }
    
}
