public class J18_2 {

    public static void main(String[] args) {

        int[] tab1 = new int[5];
        int[] tab2 = new int[5];

        tab1[0] = 2;
        tab1[1] = 22;
        tab1[2] = 12;
        tab1[3] = 42;
        tab1[4] = 25;

        tab2[0] = 22;
        tab2[1] = 22;
        tab2[2] = 1;
        tab2[3] = 4;
        tab2[4] = 2;

        int suma = 0;

        for (int i = 0; i<tab1.length; i++){

            suma += tab1[i]+tab2[i];
        }

        System.out.println("Suma obu tablic to "+suma);

    }
}
