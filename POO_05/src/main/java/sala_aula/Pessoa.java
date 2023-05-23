
package sala_aula;

public class Pessoa {

    private String nome;
    private String cpf;
    private String data_nascimento;

    //  Método construtor
    public Pessoa(String nome, String cpf, String data_nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

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
    
    public String exibir_cadastro(){
        String info = "\n";
        
        info += "Nome = " + nome;
        info += "\nCPF = " + cpf;
        info += "\nData de nascimento = " + data_nascimento;    
        
        return info;
    }
}
