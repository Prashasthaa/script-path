public class Factorial {
    public static void Factorail(int a) {
        int fact = 1;
        for (int i = 2; i <= a; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + a + " is " + fact);
    }

    public static void main(String args[]) {
        Factorail(6);
    }

}