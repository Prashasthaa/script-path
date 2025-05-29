public class primeRange {

    public static boolean isprime(int var0) {
        if (var0 == 2) {
            return true;
        } else {
            for (int var1 = 2; (double) var1 <= Math.sqrt((double) var0); ++var1) {
                if (var0 % var1 == 0) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        primeRange(40);
    }

}
