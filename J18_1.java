import java.util.Scanner;

public class J18_1 {

    public static void main(String[] args) {

        String[] imiona = new String[5];

        Scanner odczyt = new Scanner(System.in);

        for (int i=0; i<imiona.length; i++)
        {
            System.out.println("Podaj imię ");
            imiona[i] = odczyt.nextLine();
        }

        for (String tmp: imiona)
        {
            System.out.println("Cześć to ja: "+tmp);
        }

        odczyt.close();
    }
}
