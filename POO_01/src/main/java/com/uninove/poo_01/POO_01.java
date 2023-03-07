package com.uninove.poo_01;
import java.util.Scanner;

public class POO_01 {
    public static void main(String[] args) {
        System.out.println("Calculadora de inteiros");
        //   variaveis
        int a, b;
        
        Scanner ler = new Scanner(System.in);
        // 1º Valores 
        System.out.print("Primeiro valor: ");
        a = ler.nextInt();
        
        System.out.print("Segundo valor: ");
        b = ler.nextInt();
        
        //  Instanciar a classe Matematica
        Matematica calcular = new Matematica(a, b);
        
        
        System.out.print("\n----------------------\n");
        System.out.print("\nA soma dos valores é: " + calcular.somar() );
        System.out.print("\nA subtração dos valores é: " + (a-b));
        System.out.print("\nA multiplicação dos valores é: " + (a*b));
        System.out.print("\nA divisão dos valores é: " + (a/b));             
    }
}
