public class pattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k < (i * 2); k++) {
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k < (i * 2); k++) {

                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");

                }

            }
            System.out.println();

        }

    }

}
