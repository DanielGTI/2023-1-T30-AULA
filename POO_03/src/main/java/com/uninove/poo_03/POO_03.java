package com.uninove.poo_03;

import java.util.Scanner;

/*  public class Pessoa {
        String nome;
        String cpf;
        int idade;    
    }*/
public class POO_03 {
    public static void main(String[] args) {
        int n=5;
        Pessoa listaPessoas[] = new Pessoa[n];
        Scanner ler = new Scanner(System.in);
        
        for( int i=0; i<n; i++){
            
            listaPessoas[i] = new Pessoa();
            System.out.printf("\n.. Cliente %d ..\n", i+1);
            System.out.printf("Digite o seu Nome: ");
            listaPessoas[i].nome = ler.next();
            
            System.out.printf("Digite o seu CPF: ");
            listaPessoas[i].cpf = ler.next();
            
            System.out.printf("Digite a sua Idade: ");
            listaPessoas[i].idade = ler.nextInt();
            
            //ler.nextLine();
        } 
       
        System.out.printf("\n\n");
        for( int i=0; i<n; i++ ){
            System.out.printf(".. Cliente %d ..\n", (i+1));
            System.out.println("nome : " + listaPessoas[i].nome);
            System.out.println("CPF  : " + listaPessoas[i].cpf);
            System.out.println("Idade: " + listaPessoas[i].idade);
            System.out.println("");
        }       
    }
}



