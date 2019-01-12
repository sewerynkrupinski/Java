import java.util.Scanner;

public class J14_2_choinka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ile rzędów?");
        int x = input.nextInt();


        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}

