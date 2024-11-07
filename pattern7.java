public class pattern7 {
    public static void main(String[] args) {
        int n = 8;
        int px = 1;
        int py = n * 2 - 1;
        for (int i = n; i >= 1; i--) {
            for (int j = n * 2; j >= 1; j--) {
                if (j == px || j == py) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            px++;
            py--;
            System.out.println();

        }

    }

}
