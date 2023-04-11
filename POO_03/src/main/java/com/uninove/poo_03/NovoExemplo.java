
package com.uninove.poo_03;

import java.util.ArrayList;
import java.util.Scanner;

public class NovoExemplo {
    
    
    public static void main(String[] args) {
        int n=1, proximo;
        
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        
        
        
        System.out.printf("\nClasse Novo Exemplo!\n\n");
        for( int i=0; i<n; i++){
            
            Pessoa provisorio = new Pessoa();
            System.out.printf("\n.. CLIENTE ..\n");
            System.out.printf("Digite o seu Nome: ");
            provisorio.nome = ler.next();
            
            System.out.printf("Digite o seu CPF: ");
            provisorio.cpf = ler.next();
            
            System.out.printf("Digite a sua Idade: ");
            provisorio.idade = ler.nextInt();
            
            listaPessoas.add(provisorio);
            
            System.out.printf("\nDigite 0 para sair ou 1 para cadastrar nova pessoa: ");
            proximo  = ler.nextInt();
            
            if( proximo == 1)
                i--;
            
            //ler.nextLine();
        } 
       
        System.out.println("Tamanho da lista: " + listaPessoas.size());
        
        System.out.printf("\n\n");
        for( int i=0; i < listaPessoas.size(); i++ ){
            System.out.printf(".. Cliente %d ..\n", (i+1));
            System.out.println("nome : " + listaPessoas.get(i).nome);
            System.out.println("CPF  : " + listaPessoas.get(i).cpf);
            System.out.println("Idade: " + listaPessoas.get(i).idade);
            System.out.println("");
        }       
    }
    
}
