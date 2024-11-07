
public class right_pattern {
    public static void main(String[] args) {
        // right up tringle.........................

        for (int i = 0; i <= 6; i++) {

            for (int j = 6; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        // right down tringle.........................................

        for (int i = 1; i <= 6; i++) {
            for (int h = 0; h <= i; h++) {
                System.out.print(" ");

            }
            for (int b = 6; b >= i; b--) {
                System.out.print("*");

            }
            System.out.println(" ");

        }

    }

}
