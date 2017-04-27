package Exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;
        System.out.println("Informe o primeiro numero: ");
        double priNumero = sc.nextDouble();
        
        System.out.println("Informe o operador: ");
        String op = sc.next();
        
        System.out.println("Informe o segundo numero: ");
        double segNumero = sc.nextDouble();
        
        switch (op){
            case "+" :
                result = (priNumero + segNumero);
                break;
            case "-":
                result = (priNumero - segNumero);
                break;
            case "*":
                result = (priNumero * segNumero);
                break;
            case "/":
                result = (priNumero / segNumero);
                break;
        }
          System.out.println("O resultado é : " + result);   
    }
}
