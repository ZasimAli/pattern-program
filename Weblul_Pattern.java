import java.util.Scanner;

public class Weblul_Pattern {
    public static void main(String[] args) {
        int n;
        int z = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row");
        n = sc.nextInt();

        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = n + 2; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <= z; k++) {
                System.out.print("*");

            }
            z += 2;
            System.out.println();

        }

        ////////////////////////////////////////////

        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                // System.out.print("e");
                if (k == i) {
                    System.out.print("e");

                } else {
                    System.out.print(" ");
                }

            }

            //////////////////////////////////
            for (int b = 1; b <= (n + 1) / 2; b++) {
                System.out.print(" ");

            }

            // /////////////////////////////////////////////////
            for (int a = 1; a <= i; a++) {
                // System.out.print("e");
                if (a == 1) {
                    System.out.print("e");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        for (int i = (n + 1) / 2; i >= 1; i--) {

            for (int j = n - 2; j >= i; j--) {

                System.out.print(" ");

            }

            for (int k = 3; k <= z; k++) {
                System.out.print("*");

            }
            z -= 2;
            // System.out.println();

            // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            for (int b = 3; b <= n; b++) {

                System.out.print(" ");

            }

            // System.out.println();
            // z += 1;
            // System.out.println();

            // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            // for (int j = n - 3; j >= i; j--) {
            // System.out.print(" ");
            // }

            for (int k = 1; k <= z; k++) {
                System.out.print("*");

            }

            // z -= 2;
            System.out.println();

        }

    }

}
