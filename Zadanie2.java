
import java.util.Scanner;

public class Zadanie2 {
    
    public static void main(String[] args) {
   
        int a;              //zmienna dla wprowadzanych liczb całkowitych
        int suma = 0;       //zmmienna dla sumy liczb całkowitych    
        int licznik = 0;    //licznik powtórzeń pętli
        double srednia;     //zmienna typu double bo średnia dwóch liczb całkowityc może być liczbą zmiennoprzecinkową
        
        Scanner odczyt = new Scanner(System.in);
        
        System.out.println("Witaj w programie średnia liczb. Wprowadź wybrane liczby całkowite. 0 - kończy wprowadzanie");
              
        do{     //pętla musi się wykonać co najmniej raz   
            licznik++;
            System.out.println("Podaj " + (licznik) + " liczbę");
            a = odczyt.nextInt();  //odczyt z klawiatury
            
            if (a != 0){  //jeżeli a jest różne od 0 to dodaje liczbę do sumy i wykonuje następną iterację
                suma += a;
            }
            
            else{ //jeżeli a jest równe zero to:
                licznik--; //odejmujemy stan licznika bo dane powtórzenie pętli nie jest brane pod uwagę przy liczeniu średniej
                System.out.println("0 kończy wprowadzanie");
                break; //wychodzi z pętli
            }
        }
        while (a != 0); //pętla działa dopóki a jest różne od zero, jeżeli a jest równe zero to kończy działanie 
        
        odczyt.close();                       //zamykamy strumień
        //System.out.println("suma" + suma);
        //System.out.println("licznik" +licznik);
        if (licznik != 0){ //jeżeli licznik jest różny od zera to wypisuje średnią, jeśli nie to kończy działanie żeby nie dzielić przez 0
            srednia = (double)suma/licznik; //liczy średnią i rzeutuję ją na double
            System.out.println("Srednia wprowadzonych liczb to: " + srednia); //wypisuje średnią
        }
       // else 
           // System.out.println("Podałeś 0 więć średnia to 0");
        
        
}
    
}
