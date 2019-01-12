import java.util.Scanner;

public class J14_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        String liczba = input.nextLine();



        for (int i = 0; i<liczba.length(); i++)
        {
            char wartosc = liczba.charAt(i);

            if (wartosc == '-')
                System.out.print("minus ");
            if (wartosc == '0')
                System.out.println("zero");
            if (wartosc == '1')
                System.out.println("jeden");
            if (wartosc == '2')
                System.out.println("dwa");
            if (wartosc == '3')
                System.out.println("trzy");
            if (wartosc == '4')
                System.out.println("cztery");
            if (wartosc == '5')
                System.out.println("pięć");
            if (wartosc == '6')
                System.out.println("sześć");
            if (wartosc == '7')
                System.out.println("siedem");
            if (wartosc == '8')
                System.out.println("osiem");
            if (wartosc == '9')
                System.out.println("dziewięć");
        }
    }
}
