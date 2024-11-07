import java.util.Scanner;

public class pattern8 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Row =");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j == 1 || i == n) {
                    System.out.print("e");

                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("@");

            }
            System.out.println();
        }

    }

}
