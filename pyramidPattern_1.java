
// method second print the  diamond .....................

public class pyramidPattern_1 {
    public static void main(String[] args) {
        int n = 9;
        int px = n;
        int py = n;
        int z = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n * 2; j++) {
                if (j >= px && j <= py) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            px--;
            py++;
            System.out.println();

        }

        System.out.println(".................................");

        for (int i = n; i >= 1; i--) {

            for (int j = n - 1; j >= i; j--) {

                System.out.print(" ");

            }
            for (int k = 1; k <= z; k++) {
                System.out.print("*");

            }
            z -= 2;
            System.out.println();

        }

    }

}
