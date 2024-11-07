import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        int n;

        Scanner cs = new Scanner(System.in);
        System.out.print("Enter The Row =");
        n = cs.nextInt();
        int px = n;
        int py = n;

        for (int i = 0; i < n / 2 + 2; i++) {
            for (int j = 0; j < n * 2; j++) {
                if (j >= px && j <= py) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }

            }

            px--;
            py++;
            System.out.println();
        }
        for (int i = n / 2; i >= -n / 2; i--) {
            for (int j = 1; j <= Math.abs(i); j++) {
                System.out.print(" ");

            }
            for (int k = n / 2; k >= Math.abs(i); k--) {
                System.out.print("*");
                // System.out.print(k + 65);

            }

            for (int p = 1; p <= n; p++) {

                if (i == n / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }

            for (int j = n / 2; j >= Math.abs(i); j--) {
                // System.out.print("*");
                // System.out.print(i + 'A');
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
