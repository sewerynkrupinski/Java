import java.util.HashSet;
import java.util.Random;

public class J21_2 {

    public static void main(String[] args) {
        HashSet<String> zbior1 = new HashSet<String>();
        zbior1.add("A");
        zbior1.add("B");
        zbior1.add("C");
        zbior1.add("D");
        zbior1.add("E");

        HashSet<String> zbior2 = new HashSet<String>();
        zbior2.add("A");
        zbior2.add("B");
        zbior2.add("F");
        zbior2.add("D");
        zbior2.add("G");

        System.out.println(zbior1.size());
        System.out.println(zbior2.size());
        zbior1.addAll(zbior2);
        System.out.println(zbior1.size());
        zbior1.remove("A");
        System.out.println(zbior1.size());

        System.out.println("---------");

        for (String tmp: zbior1)
        {
            System.out.println(tmp);
        }





    }
}
