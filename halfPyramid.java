import java.util.Scanner;
import java.lang.Math;

public class halfPyramid {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row=");
        n = sc.nextInt();
        for (int i = n; i >= -n; i--) {
            for (int j = n; j >= Math.abs(i); j--) {
                // System.out.print("*");
                // System.out.print(i + 'A');
                System.out.print("*");

            }
            System.out.println();

        }
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.

        // Right half diamond.........................................
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        for (int i = n; i >= -n; i--) {
            for (int j = 1; j <= Math.abs(i); j++) {
                System.out.print(" ");

            }
            for (int k = n; k >= Math.abs(i); k--) {
                System.out.print("*");
                // System.out.print(k + 65);

            }
            System.out.println();

        }

    }

}
