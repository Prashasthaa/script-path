public class isEven {
    public static void isEven(int num) {
        boolean isEven = false;
        if (num % 2 == 0) {
            isEven = true;
        }
        System.out.println(isEven);
    }

    public static void main(String args[]) {
        isEven(4);
    }

}
