import java.util.Scanner;

public class squarPattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:-");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // if (i == 1 || i == n || j == 1 || j == n) {
                // System.out.print("*");

                // } else {
                // System.out.print(" ");
                // }
                System.out.print(i);

            }
            System.out.println(" ");

        }
    }

}
