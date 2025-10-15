public class Patterns {
    public static void pattern1(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= n - i + 1; j++, count++) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        pattern5(n);
    }

}
