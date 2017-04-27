
package Exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        float hipot ;
        float resHipot ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro cateto : ");
        float priCat = sc.nextFloat();
        
        System.out.println("Informe o segundo cateto : ");
        float segCat = sc.nextFloat();
        
        hipot =  ((float) Math.pow(priCat, 2) + (float) Math.pow(segCat, 2)) ;
        resHipot = (float)Math.pow(hipot, (1.0/2));
        
        System.out.println("O valor da hipotenusa é :" + resHipot);
    }
}
