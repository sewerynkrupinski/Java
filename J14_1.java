import java.util.Random;
import java.util.Scanner;

public class J14_1 {

    public static void main(String[] args) {

        int wylosowana = new Random().nextInt(100)+1;
        //System.out.println(wylosowana);

        Scanner input = new Scanner(System.in);

        int wpisana;
        int licznik = 0;

        System.out.println("Witaj w grze 'Zgadnij liczbę', masz 5 prób");

        while(licznik <5)
        {
            System.out.println("Podaj liczbę od 0 do 100");
            wpisana = input.nextInt();



            if (wpisana == wylosowana)
            {
                System.out.println("Gratulacje, zgadłeś za " + (licznik+1) + " razem");
                break;
            }

            else if (wpisana > wylosowana)
            {
                System.out.println("Za dużo...");
                licznik ++;
            }
            else if (wpisana < wylosowana)
            {
                System.out.println("Za mało...");
                licznik ++;
            }
            else
                continue;




        }

        if (licznik == 5)
            System.out.println("Nie zgadłeś w 5 próbach");


        }

    }



