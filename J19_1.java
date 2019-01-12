public class J19_1 {

    public static void main(String[] args) {

        int[][] tab = new int [5][5];

        for (int i=0; i<tab.length; i++)
        {
            tab[i][i] = 1;
            tab[i][tab.length-1-i] = 1;
        }




        for (int i=0; i<tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println();
        }
    }
}
