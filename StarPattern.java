public class StarPattern {
    public static void main(String[] args) {

        // star pattern up...........................................

        for (int i = 0; i <= 6; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");

            }
            System.out.println();

        }
        // star pattern down..................................................

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int k = 6; k >= i; k--) {
                System.out.print(" *");

            }
            System.out.println();

        }

    }

}
