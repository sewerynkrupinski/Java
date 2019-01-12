import java.util.Scanner;

public class J14_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ile podajemy liczb?");
        int ile = input.nextInt();
        int liczba_max = 0;
        int liczba_min = 0;

        for (int i = 0; i<ile; i++)
        {
            System.out.println("Podaj " + (i+1) + " liczbę");
            int podana = input.nextInt();

            if (i == 0){

                liczba_max = podana;
                liczba_min = podana;
            }

            else{

                if (podana > liczba_max)
                    liczba_max = podana;

                else if (podana < liczba_min)
                    liczba_min = podana;
            }
        }


        System.out.println("Maksymalna liczba to: "+ liczba_max);
        System.out.println("Minimalna liczba to: "+ liczba_min);



    }



}
