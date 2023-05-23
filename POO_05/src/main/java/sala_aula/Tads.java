
package sala_aula;

public class Tads {

    
    public static void main(String[] args){
    
        // Instância da classe Aluno
        Aluno aluno_1 = new Aluno("Helder", "123456", "01/01/2001");
        
        // Instânciar da classe Professor
        Professor prof_1 = new Professor("Daniel", "456789", "01/01/1980");
        
        prof_1.salario = 20000f;
        
        //  Modificação
        // aluno_1.setNome("Daniel");
        // aluno_1.setCpf("456789");
        
        //System.out.println("Nome do Aluno = " + aluno_1.getNome());
        //System.out.println("CPF do Aluno = " + aluno_1.getCpf());
        
        System.out.println(aluno_1.exibir_cadastro());
        System.out.println(prof_1.exibir_cadastro());
        
        
    }
    
}
