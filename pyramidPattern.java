import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {

        int z = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                // System.out.print("*");
                System.out.print(" ");

            }
            for (int k = 1; k <= z; k++) {
                System.out.print("*");

            }
            z += 2;

            System.out.println();
        }

    }

}
