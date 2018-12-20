
import java.util.Arrays;
import java.util.Scanner;


public class Zadanie1_1 {
    
    
    public static void main(String[] args) {
        
        int[] tab = new int[3];  //deklaracja tablicy 3-elementowej
        Scanner odczyt = new Scanner(System.in); 
        
       System.out.println("Witaj w programie 'układanie liczb od największej do najmniejszej ver. 2.0 :)");
       
       for (int i = 0; i < tab.length; i++) //pętla wczytująca 3 liczby całkowite
       {
           System.out.println("Wprowadź "+ (i+1)+ " liczbę całkowitą");
           tab[i] = odczyt.nextInt();
           
       }
       odczyt.close();
       
       Arrays.sort(tab);  //sortowanie tablicy od najmniejszej do największej liczby
       
       // 1 sposób
//       System.out.println("Twoje liczby to: ");
//       System.out.println(tab[2]);
//       System.out.println(tab[1]);
//       System.out.println(tab[0]);
       

        // 2 sposób
       System.out.println("Twoje liczby od największej do najmniejszej to: "); //pętla "w tył", czyta tablicę od ostatniego elementu do pierwszego
       for (int i=2; i>=0; i--)
       {
           System.out.println(tab[i]);
       }
       

          //3 sposób ??? ale jak odwrócić kolejność w tablicy
         
//       for (int tmp: tab)
//       {
//           System.out.println(tmp);
//       }
//        
        
    }
    
}
