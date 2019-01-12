import java.util.Scanner;

public class J14_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program wypisuje liczby nieparzyste, mniejse lub równe od podanej");
        System.out.println("Podaj liczbę całkowitą dodatnią");
        int x = input.nextInt();

        if (x <= 0)
            System.out.println("Podałeś liczbę spoza zakresu");

        else {
            System.out.println("Liczby nieparzyste, nie większe od " + x + " to:");

            for (int i = 0; i <= x; i++) {
                if (!(i % 2 == 0))
                    System.out.println(i);

            }
        }
    }
}
