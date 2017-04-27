package Exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media ;
        
        System.out.println("Informe a primeira nota : ");
        float priNota = sc.nextFloat();
        
        System.out.println("Informe a segunda nota : ");
        float segNota = sc.nextFloat();
        
        media = ((priNota+segNota)/2);
        
        if (media >= 6){
            System.out.println("Aluno aprovado.");
        }
        else{
            System.out.println("Aluno reprovado.");
        }
        System.out.println("Sua média foi : " + media);
    }
    
}
