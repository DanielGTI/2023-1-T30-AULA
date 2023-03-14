package com.uninove.poo_01;

public class Matematica {
    
    //  Atributos locais
    double a, b;
    
    //  Método Construtor
    public Matematica(double num_a, double num_b){
        a = num_a;
        b = num_b;
    }
    
    //  Método soma
    public double somar(){
        return (a + b);
    }
    
     //  Método soma
    public double subtrair(){
        return (a - b);
    }
    
     //  Método soma
    public double multiplicar(){
        return (a * b);
    }
    
     //  Método soma
    public double dividir(){
        return (a / b);
    }
    
    public double calcular_IMC(){
        return (a / (b * b) );
    }
}
