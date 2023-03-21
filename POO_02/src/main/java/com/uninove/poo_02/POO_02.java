package com.uninove.poo_02;

import java.util.Scanner;

public class POO_02 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        float av1, av2, av3, media;
        
        
        /*
            REPETIÇÃO
        
            Do While(??)    // REPITA
            While(??)       // ENQUANTO 
            For(???)        // PARA 
        */
        int x = 11;
        do{
            System.out.println(x);
            x++;
        }while( x<=10 );
        
        x = 11;
        while( x<=10 ){
            System.out.println(x);
            x++;
        }
        
        for( x=11; x<=10; x++ ){
            System.out.println(x);
        }
        
      
        
        
        
        
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
