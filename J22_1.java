import java.util.HashMap;
import java.util.Scanner;

public class J22_1 {

    public static void main(String[] args) {

        HashMap<String, Double> sklep = new HashMap<>();
        HashMap<String, Integer> koszyk = new HashMap<>();

        Scanner wybor = new Scanner(System.in);
        String decyzja;

        Scanner odczyt = new Scanner(System.in);
        String produkt;

        Scanner ilosc = new Scanner(System.in);
        int szt;
        double ile;
        double poile;
        double podsuma =0;
        double suma = 0.00;

        sklep.put("mleko", 2.49);
        sklep.put("jajka", 2.99);
        sklep.put("chleb", 3.5);
        sklep.put("cukier", 4.89);
        sklep.put("woda", 1.59);


        System.out.println("Witaj w sklepie!");
        System.out.println();
        System.out.println("Ceny produktów: ");
        System.out.println("mleko - 2.49");
        System.out.println("jajka - 2.99");
        System.out.println("chleb - 3.5");
        System.out.println("cukier - 4.89");
        System.out.println("woda - 1.59");

        while(true){
            System.out.println();
            System.out.println("D - Dodaj produkt, U - Usuń produkt, P - Podgląd koszyka, Z - Zakończenie i podsumowanie");

            decyzja = wybor.nextLine().toUpperCase();

            if (decyzja.equals("D"))
            {

                System.out.println("Podaj nazwę produktu");
                produkt = odczyt.nextLine();

                if (produkt.equals("")) //po wciśnięciu pustego entera powtarza pętlę
                    continue;

                else if (!(sklep.containsKey(produkt)))
                {
                    System.out.println("Nie znaleziono takiego produktu");
                    continue;
                }

                else
                    System.out.println("ile sztuk?");
                    szt = ilosc.nextInt();

                    if (!koszyk.containsKey(produkt)) {
                        koszyk.put(produkt, szt);
                    }
                    else if (koszyk.containsKey(produkt)){
                        int tmp = koszyk.get(produkt);             //pobiera ile sztuk
                        koszyk.put(produkt, tmp+szt);
                    }

            }

            else if (decyzja.equals("P"))
            {
                System.out.println("Zawartość twojego koszyka: ");
                for (String tmp: koszyk.keySet())
                {

                    System.out.print(tmp + " w ilości sztuk: ");
                    System.out.println(koszyk.get(tmp));
                }
            }

            else if (decyzja.equals("U"))
            {
                System.out.println("Który produkt chcesz usunąć?");
                produkt = odczyt.nextLine();
                if (koszyk.containsKey(produkt)) {
                    int dotychczasowa_ilosc = koszyk.get(produkt);
                    int nowailosc = dotychczasowa_ilosc - 1;
                    if (nowailosc > 0)
                        koszyk.put(produkt, nowailosc);
                    else
                        koszyk.remove(produkt);
                }
                else {
                    System.out.println("Nie ma takiego produktu w koszyku");
                    continue;
                }
            }

            else if(decyzja.equals("Z")){

                System.out.println("Podsumowanie zakupów: ");

                for (String tmp: koszyk.keySet())
                {

                        System.out.print(tmp + " w ilości sztuk: ");
                        System.out.println(koszyk.get(tmp));


                    ile = koszyk.get(tmp);
                    poile = sklep.get(tmp);
                    podsuma = ile * poile;
                    suma += podsuma;


                }
                System.out.println("Łączna cena: " +suma);
                break;







            }








        }


    }
}