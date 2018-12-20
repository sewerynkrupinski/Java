
import java.util.Scanner;

public class Zadanie1 {
    
    
    public static void main(String[] args) {
        
        int a;      //deklaracja zmiennych
        int b;
        int c;
        
        Scanner odczyt = new Scanner(System.in); 
        
        System.out.println("Witaj w programie 'układanie liczb od największej do najmniejszej");
        System.out.println("");
        
        System.out.println("Wprowadź pierwszą liczbę");
            a = odczyt.nextInt();
        System.out.println("Wprowadź drugą liczbę");
            b = odczyt.nextInt();
        System.out.println("Wprowadź trzecią liczbę");
            c = odczyt.nextInt();
        
        odczyt.close();
        System.out.println("Twoje liczby od największej do najmniejszej to: ");
        
        //sprawdzenie możliwości
        if (a >= b & a >= c) {              // a jest największe
            System.out.println(a);
            if (b >= c ){                   //b jest drugie, c trzecie
                System.out.println(b);
                System.out.println(c);
            }
            else if (c > b){
                System.out.println(c);      //c jest drugie, b trzecie
                System.out.println(b);
            }
        }
        else if (b >= a & b>= c){           // b jest nawiększe
            System.out.println(b);
            if (a >= c){                    //a jest drugie, c trzecie
                System.out.println(a);
                System.out.println(c);
            }
            else if (c > a){                //c jest drugie, a trzecie
                System.out.println(c);
                System.out.println(a);
            }
        }
        else {                              // c jest największe
            System.out.println(c);
            if (a >= b){                    // a jest drugie, b trzecie
                System.out.println(a);
                System.out.println(b);
            }
            else if (b > a){                // b jest drugie, a trzecie
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}

        
            
            
        
        
        

        
            
         
      /*
    możliwości
    a > b i a >c        a największe
        b > c           b drugie, c trzecie
        c > b           c drugie, b trzezcie
    b > a i b >c        b największe
        a > c           a drugie, c trzecie
        c > a           c drugie, b trzecie
    c > a i c> b        c największe
        a > b           a drugie, b trzecie
        b > a           b drugie, a trzecie
    
    */

