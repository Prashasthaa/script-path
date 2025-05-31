public class decimaltobinary {
    public static void decimaltobinary(int n) {
        int pow = 0;
        int decimal = 0;

        while (n > 0) {
            int rem = n % 2;
            decimal += rem * Math.pow(10, pow);
            n = n / 2;
            pow++;

        }
        System.out.println(decimal);
    }

    public static void main(String args[]) {
        decimaltobinary(4);
    }

}
