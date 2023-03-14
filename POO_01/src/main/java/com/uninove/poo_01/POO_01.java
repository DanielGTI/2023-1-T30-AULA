package com.uninove.poo_01;

import java.util.Scanner;


public class POO_01 {
    public static void main(String[] args) {
        System.out.println("Calculadora de inteiros");
        //   variaveis
        double a, b;
        
        Scanner ler = new Scanner(System.in);
        // 1º Valores 
        System.out.print("Primeiro valor: ");
        a = ler.nextDouble();
        
        System.out.print("Segundo valor: ");
        b = ler.nextDouble();
        
        //  Instanciar a classe Matematica
        Matematica calcular = new Matematica(a, b);
        
        
        System.out.print("\n----------------------\n");
        System.out.print("\nA soma dos valores é: " + calcular.somar() );
        System.out.print("\nA subtração dos valores é: " + calcular.subtrair());
        System.out.print("\nA multiplicação dos valores é: " + calcular.multiplicar());
        System.out.print("\nA divisão dos valores é: " + calcular.dividir());             
    

        System.out.print("\n----------------------\n");
        System.out.print("Informe o PESO: ");
        a = ler.nextDouble();
        
        System.out.print("Informe a ALTURA: ");
        b = ler.nextDouble();
        //  Instanciar a classe Matematica
        Matematica imc = new Matematica(a, b);
        
        System.out.print("\nO valor do IMC é =   " + imc.calcular_IMC() );
        
        
    }
}
