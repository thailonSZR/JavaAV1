package Exercicio7;

import java.util.Scanner;

public class Exercicio7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota ;
	float total = 0;
	int quant = 0;
        
        
        do{
            System.out.println("Informe a nota : ");
            
            nota = sc.nextFloat();
        
            if (nota != -1) {
		total += nota;
		quant++;
            }
            
        } while(nota != -1);
        
        float media = (total/quant);
        System.out.println("A sua m�dia � :  " + media );
    }
}
