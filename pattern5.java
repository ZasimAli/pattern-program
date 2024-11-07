public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int px = n;
        int py = n;
        for (int i = 1; i <= n; i++) {
            for (int j = n * 2; j >= 0; j--) {
                if (j >= px && j <= py) {
                    System.out.print(" ");

                } else {
                    System.out.print("*");
                }

            }
            px--;
            py++;
            System.out.println();

        }
    }

}
