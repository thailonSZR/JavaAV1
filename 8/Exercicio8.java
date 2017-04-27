package Exercicio8;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
        
       System.out.println("Informe o numero : ");
       int num = sc.nextInt(); 
       
       String bin = Integer.toString(num, 2);
       
       System.out.println("Seu numero em binario é : " + bin);
        
    }
}
