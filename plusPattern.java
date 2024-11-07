import java.util.Scanner;

public class plusPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == (n / 2) + 1 || j == (n / 2) + 1) {
                    System.out.print("*");

                } else {
                    System.out.print("0");
                }

            }
            System.out.println();

        }
    }

}
