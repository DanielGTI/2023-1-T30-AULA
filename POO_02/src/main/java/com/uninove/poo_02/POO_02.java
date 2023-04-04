package com.uninove.poo_02;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



class GlobalVariaveis{

    static int quina[][]= new int [10][5];
    
    public static void realizarQuina(){
        for(int i=0; i<10; i++){
            for( int j=0; j<5; j++){
                quina[i][j] = POO_02.num_sorteio();
            }
            Arrays.sort(quina[i]);
        }      
    }
}    
    
public class POO_02 {
    
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        
        do{
            System.out.print("\n\n---------------------------------------\n");
            System.out.print("\t|.. Menu de exemplos ..|\n");
            System.out.print("\tOpção 1: Exemplo de notas.\n");
            System.out.print("\tOpção 2: Exemplo de repetição.\n");
            System.out.print("\tOpção 3: Exemplo de controles.\n");
            System.out.print("\tOpção 4: Novos Sorteios\n");
            System.out.print("\tOpção 5: Listar Sorteios\n");
            System.out.print("\tOpção 0: Sair do sistema.\n");

            System.out.print("\nEscolha uma opção: ");
            escolha = ler.nextInt();

            switch(escolha){
                case 1:     notas();                break;
                case 2:     exemplo_repeticao();    break;
                case 3:     controle();             break;
                case 4:     sorteio();              break;
                case 5:     listar_sorteio();       break;
                case 0:     sair();                 break;
                    
                default:    System.out.println("Opção Inválida\n"); break;
            }
        }while( escolha != 0 );
    }    


    public static void listar_sorteio(){
        
        
        System.out.println("\n-------------------------------------");
        System.out.println("Listar sorteio\n");
       
        for(int i=0; i<10; i++){
            for( int j=0; j<5; j++){
                if( j < 4 )
                    System.out.printf("%02d - ", GlobalVariaveis.quina[i][j]);
                else
                    System.out.printf("%02d", GlobalVariaveis.quina[i][j]);
            }
            System.out.println("");
            
        } 
        
        
    }
    
    
    public static void sair(){
        System.out.println("\n-------------------------------------");
        System.out.println("Obrigado por utilizar o nosso sistema\n");
        System.out.println("Até breve.\n");
    }
    
    public static void exemplo_repeticao(){
        /*
            Do While(??)    // REPITA
            While(??)       // ENQUANTO 
            For(???)        // PARA 
        */
        int x = 1;
        do{
            System.out.println("do while() " + x);
            x++;
        }while( x<=10 );
        
        x = 1;
        while( x<=10 ){
            System.out.println("while() " + x);
            x++;
        }
        
        for( x=1; x<=10; x++ ){
            System.out.println("for() " + x);
        }
    }
    
    public static void controle(){
        System.out.println("\nMétodo de controle\n");
    }
    
    public static void notas(){
    
        Scanner ler = new Scanner(System.in);
        float av1, av2, av3, media;
        
        
        System.out.print("Informe a nota AV1: ");
        av1 = ler.nextFloat();
        
        System.out.print("Informe a nota AV2: ");
        av2 = ler.nextFloat();
        
        System.out.print("Informe a nota AV3: ");
        av3 = ler.nextFloat();
        
        media = valorMedia(av1, av2, av3);
        
        System.out.println("A média é: " + media);
        
        /*
        if ( media == 10 )
            System.out.println("Parabéns, você tirou a nota máxima.");
        else if ( media >= 9 )
            System.out.println("Ótimo, quase a nota máxima.");
        else if( media >= 8 )
            System.out.println("Muito bem, grande nota.");
        else if( media >= 7 )
            System.out.println("Muito bem, podemos melhorar.");
        else if( media >= 6 )
            System.out.println("Aprovado.");
        else 
            System.out.println("Al
        uno reprovado.");

        */    
        
        int media_int;
        media_int = (int) media;
        
       switch(media_int){     
           case 10: System.out.println("Parabéns, você tirou a nota máxima.");  break;
           case 9:  System.out.println("Ótimo, quase a nota máxima.");          break;
           case 8:  System.out.println("Muito bem, grande nota.");              break;
           case 7:  System.out.println("Muito bem, podemos melhorar.");         break;
           case 6:  System.out.println("Aprovado.");                            break;
           
           default: System.out.println("Aluno reprovado."); break;
       }
    }
    
    public static int num_sorteio(){
        Random num_aleatorio = new Random();
        int numero = (num_aleatorio.nextInt(60))+1;
        return numero;
    }
    
    public static void sorteio(){
        
        GlobalVariaveis.realizarQuina();
        listar_sorteio();     
        
        /*int i;
        int bingo[] = new int[5];
        
        System.out.print("\nSorteio do bingo (ultimo sorteio):\n");
        
        for( i=0; i<5; i++){
            bingo[i] = GlobalVariaveis.quina[9][i];
            System.out.print("Numero gerado (" + (i+1) + "): " + bingo[i] + "\n");
        }
        */
        
    }
    
    public static float valorMedia(float nota1, float nota2, float nota3){
    
        float valorMedio=0;
                
        // < av1
        if( nota1 < nota2 && nota1 < nota3 ){
            valorMedio = (nota2 + nota3) / 2;
        }
        else if( nota2 < nota1 && nota2 < nota3 ){  //  < AV2
            valorMedio = (nota1 + nota3) / 2;
        }
        else{
             valorMedio = (nota1 + nota2) / 2;      //  < AV3
        }        
        return valorMedio;
    }
    
}
