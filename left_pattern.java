public class left_pattern {
    public static void main(String[] args) {
        // left tringle.....................

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }

        // bottom left tringle pattern>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print("*");

            }
            System.out.println(" ");

        }
    }
}
