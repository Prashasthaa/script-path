public class practice8 {

    // top right triangle
    public static void topRightTriangle(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r - c <= 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        topRightTriangle(5);
    }
}
