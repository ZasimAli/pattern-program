public class pattern6 {
    public static void main(String[] args) {
        int n = 8;
        int px = n;
        int py = n;
        for (int i = 1; i <= n; i++) {
            for (int j = n * 2; j >= 1; j--) {
                if (j == px || j == py) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            px--;
            py++;
            System.out.println();

        }
    }

}
