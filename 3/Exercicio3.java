
package Exercicio3;


public class Exercicio3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = b + 1;
        int d = c > ++b ? (a - 3) : b;
        int e = 4;
        
        if( d > a && b + 1 < a || b > 1){
            c += 7;
        }
        if( -7 >= -c){
            a -= 4;
        }
        else{
            d *= 2;
            e = ++d % 3;
            b = d++ % 3;
        }
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);
        System.out.println("D : " + d);
        System.out.println("E : " + e);
    }
    
}
