
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
    private int czasParkowania;
    private int godzina = 2;
    private int minuty, noweMinuty;
    
    
    void zwiekszCzas(int b)
    {
        if (b == 0)
            System.out.println("Czas parkowania: 0");
        else if (b == 1)
            System.out.println("Czas parkowania 0,5h");
        else if (b == 2)
            System.out.println("Czas parkowania 1h");
        else if (b == 3)
            System.out.println("Czas parkowania 1,5h");
        else if (b == 4)
            System.out.println("Czas parkowania 1h 45min");
        else if (b == 5)
            System.out.println("Cas parkowania 2h");
        else {                  //powyżej 2 godzin każde 1 zł to 15 mmin
//            if (b == 6){
       minuty = (b - 5)*15;
//            //godzina = 2;
//            }
//            else 
//            {
//                minuty = (b - (b -1)) * 15;
//                godzina +=
//            }
                
            if (minuty >=60)
            {
                godzina +=1;
                noweMinuty = minuty -= 60;
            }
            else 
                noweMinuty = minuty;
            
            System.out.println("Czas parkowania " +godzina + " h " + noweMinuty + " min");
        }
    }
    
}


