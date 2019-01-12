import java.util.Scanner;

public class J18_1 {

    public static void main(String[] args) {

        String[] imiona = new String[5]; //deklaracja tablicy 5 elementowej

        Scanner odczyt = new Scanner(System.in);

        for (int i=0; i<imiona.length; i++) //pętla wczytuje podane imiona po kolei do tablicy
        {
            System.out.println("Podaj imię ");
            imiona[i] = odczyt.nextLine();
        }

        for (String tmp: imiona)    //pętla each-for wyświetla wszystkie elementy tablicy
        {
            System.out.println("Cześć to ja: "+tmp);
        }

        odczyt.close(); //zamyka strumień
    }
}
