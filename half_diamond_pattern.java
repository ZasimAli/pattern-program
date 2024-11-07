public class half_diamond_pattern {
    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {

                System.out.print("*");

            }
            // System.out.println();

            for (int k = 1; k <= i; k++) {

                System.out.print("*");

            }
            System.out.println();
        }

        // diamond down pattern......................

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 5; k >= i; k--) {

                System.out.print("*");

            }
            // System.out.println();

            for (int k = 6; k >= i; k--) {

                System.out.print("*");

            }
            System.out.println();
        }

    }

}
