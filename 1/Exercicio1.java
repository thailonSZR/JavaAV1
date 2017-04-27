package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua Idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Informe Seu nome: ");
        String nome = sc.next();
        
        System.out.println("Informe seu peso: ");
        float peso = sc.nextFloat();
        
        System.out.println("Informe seu tipo sanguineo sem declarar positivo ou negativo : ");
        String tiposangue = sc.next();
        
        System.out.println("Informe sua data de nascimento: ");
        String data = sc.next();
        
        System.out.println("Informe o numero que você calça: ");
        int tamsapato = sc.nextInt();
        
        System.out.println("Casado? (S/N)");
        String casado = sc.next();
              
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Data de nascimento: " + data);
        System.out.println("Tipo sanguineo : " + tiposangue);
        System.out.println("Peso: " + peso + " KG");
        System.out.println("Numero do calçado:" + tamsapato);
        System.out.println("Casado: " + casado);
        
        
        
    }
    
}
