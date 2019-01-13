import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J22 {

    public static void main(String[] args) {

        HashMap<String, Double> sklep = new HashMap<>();
        Scanner odczyt = new Scanner(System.in);
        ArrayList<String> koszyk = new ArrayList<>();
        String produkt;
        double cena;
        double suma = 0.00;

        sklep.put("mleko", 2.49);
        sklep.put("jajka", 2.99);
        sklep.put("chleb", 3.5);
        sklep.put("cukier", 4.89);
        sklep.put("woda", 1.59);


        System.out.println("Witaj w sklepie!");
        System.out.println("Ceny produktów: ");
        System.out.println("mleko - 2.49");
        System.out.println("jajka - 2.99");
        System.out.println("chleb - 3.5");
        System.out.println("cukier - 4.89");
        System.out.println("woda - 1.59");


        while(true)
        {

            System.out.println("Podaj nazwę produktu, (Enter) kończy zakupy");
            produkt = odczyt.nextLine();

            if (produkt.equals("")) //po wciśnięciu entera kończy pętlę
                break;

            else if (!(sklep.containsKey(produkt)))     //zadanie z gwiazdką (jeżeli nie ma takiego produktu to prosi o następny)
            {
                System.out.println("Nie znaleziono takiego produktu");
                continue;
            }

            else
            koszyk.add(produkt);
        }

        odczyt.close();

        System.out.println("Zawartość twojego koszyka to: ");       //wyświetla zawartość koszyka i sumuje jego wartość
        for(String tmp: koszyk)
        {
            System.out.println(tmp);
            suma += sklep.get(tmp);

        }


        System.out.println("Łączna cena to: " + suma);




    }
}
