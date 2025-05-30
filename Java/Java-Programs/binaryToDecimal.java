public class binaryToDecimal {
    public static void binaryToDecimal(int n) {
        int sum = 0;
        for (int i = 0; n != 0; i++) {
            int digit = n % 10;
            sum += Math.pow(2, i) * digit;
            n = n / 10;

        }
        System.out.println(sum);

    }

    public static void main(String args[]) {
        binaryToDecimal(4);
    }

}
