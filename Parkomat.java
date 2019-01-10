
package parkomat;

import java.util.Scanner;

/**
 *
 * @author Seweryn Krupiński
 */
public class Parkomat {

     public static void main(String[] args) {
        
         System.out.println("Witaj w strefie płatnego parkowania, wrzuć monetę");
         Scanner odczyt = new Scanner(System.in);
         int a;
         
         PoborOplaty wplata = new PoborOplaty();
         CzasParkowania czas = new CzasParkowania();
         
         do{
         a = odczyt.nextInt();
         wplata.wplac(a);
         System.out.println("Stan konta: " +wplata.getStanKonta()+ " zł");
         
         int b = wplata.getStanKonta();
         czas.zwiekszCzas(b);
         
         }
         while (a != 0);
         
    }
    
}

class PoborOplaty
{
    private int stanKonta;
    
   void wplac(int a)
   {
       this.stanKonta +=a;
       
   }
    
   int getStanKonta() 
   {
       return this.stanKonta;
   }
   
   
}

class CzasParkowania
{
  
    
    
    void zwiekszCzas(int b)
    {
        
        int godzina = 2;
        
        if (b == 0)
            System.out.println("Czas parkowania: 0");
        else if (b == 1)
            System.out.println("Czas parkowania 0,5 h");
        else if (b == 2)
            System.out.println("Czas parkowania 1 h");
        else if (b == 3)
            System.out.println("Czas parkowania 1,5 h");
        else if (b == 4)
            System.out.println("Czas parkowania 1 h 45 min");
        else if (b == 5)
            System.out.println("Cas parkowania 2 h");
        else { 
            
            int timer = b - 5; 
            int minutes = timer * 15; 
            int hours = minutes / 60;   
            int rest = minutes - (hours * 60);
            
            int newHours = 2 + hours;
            System.out.println("Czas parkowania " +newHours+ " h " + rest + " min");
        }
    }
    
}


