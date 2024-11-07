import java.util.Scanner;

public class webkul_patern_2 {
    public static void main(String[] args) {

        int n;
        int z = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row");
        n = sc.nextInt();

        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = n; j >= i; j--) {
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
