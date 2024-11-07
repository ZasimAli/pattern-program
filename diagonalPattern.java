import java.util.Scanner;

public class diagonalPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:-");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (j == n + 1 - i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }

}
