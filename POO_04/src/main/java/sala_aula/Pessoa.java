
package sala_aula;

import java.util.HashSet;

/*
    + publico   public  (todas as classes)
    - privado   private (somente a classe atual)
    # protegido (somente a classe atual e subclasses)
*/

public class Pessoa implements Aluno {
    
    private String nome;
    private String cpf;
    private String data_Nascimento;
    private String RA;
    private boolean presente;
    private boolean matricula;
    private boolean falar_perguntar;
    private boolean executar_atividade;
    
    
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
        System.out.println("\nRA = " + this.getRA());
        System.out.print("\nMatriculado? ");
        if( this.isMatricula()){
            System.out.println("SIM!");
        }else{
            System.out.println("Não.");
        }
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
    
    @Override
    public void matricula() {
        this.setMatricula(true);
        this.setRA("123456");
    }

    @Override
    public void estudar(){
        this.setExecutar_atividade(true);
    }

    
    @Override
    public void trancar() {
        this.setMatricula(false);
    }

    @Override
    public void assistir_aula() {
    
        if( this.isMatricula() ){
            this.setPresente(true);
        }
    }

    @Override
    public void prova() {
    
    }

    @Override
    public void atividade() {
    
    }

    @Override
    public void participar() {
    
    }

    
    
    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public boolean isFalar_perguntar() {
        return falar_perguntar;
    }

    public void setFalar_perguntar(boolean falar_perguntar) {
        this.falar_perguntar = falar_perguntar;
    }

    public boolean isExecutar_atividade() {
        return executar_atividade;
    }

    public void setExecutar_atividade(boolean executar_atividade) {
        this.executar_atividade = executar_atividade;
    }
    
    

}
