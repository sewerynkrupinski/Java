import java.util.ArrayList;

public class J21_1 {

    public static void main(String[] args) {

        ArrayList<String> nowaLista = new ArrayList<String>();

        nowaLista.add("A");
        nowaLista.add("B");
        nowaLista.add("C");
        nowaLista.add("D");
        nowaLista.add("E");

        System.out.println(nowaLista.get(2));
        nowaLista.set(3, "A");
        nowaLista.remove("A");
        nowaLista.remove(0);
        System.out.println(nowaLista.contains("D"));
        System.out.println(nowaLista.size());
        System.out.println(nowaLista);


        for (String tmp: nowaLista)
        {
            System.out.println(tmp);
        }





    }
}
