public class practice9 {

    public static boolean distinct(int nums[]) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int j = 1; j <= k; j++) {
            int temp = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 15 };
        int k = 14;
        // System.out.println(distinct(nums));

        rotate(nums, k);

    }
}

// import java.util.Scanner;

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size:");
// int n = sc.nextInt();
// int[] a = new int[n];
// System.out.println("Enter array:");
// for (int k = 0; k < n; k++) {
// a[k] = sc.nextInt();
// }
// boolean flag = true;
// for (int i = 0; i < n - 2; i++) {

// if (a[i] > a[i + 1]) {
// flag = false;
// break;

// }
// }
// if (flag) {
// System.out.println("sorted");
// } else {
// System.out.println("unsorted");
// }

// }
// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size:");
// int n = sc.nextInt();
// int[] a = new int[n];
// System.out.println("Enter array:");
// for (int k = 0; k < n; k++) {
// a[k] = sc.nextInt();
// }
// int[] visited = new int[n];
// for (int i = 0; i < n; i++) {
// visited[i] = 0;
// }
// for (int i = 0; i < n; i++) {
// int count = 1;
// if (visited[i] == 0) {
// for (int j = i + 1; j < n; j++) {
// if (a[i] == a[j]) {
// count++;
// visited[j] = 1;
// }

// }
// System.out.println(a[i] + "->" + count);
// }

// }

// }
// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size:");
// int n = sc.nextInt();
// int[] a = new int[n];
// System.out.println("Enter array:");
// for (int k = 0; k < n; k++) {
// a[k] = sc.nextInt();
// }
// int i = 0;
// int j = n - 1;

// while (i < j) {
// int temp = a[i];
// a[i] = a[j];
// a[j] = temp;
// i++;
// j--;
// }

// System.out.println("Array Reversed:");
// for (int k = 0; k < n; k++) {
// System.out.println(a[k]);
// }

// }
// }

// import java.util.Scanner;

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a digit:");
// int n = sc.nextInt();
// int res = 0;
// int place = 1;
// while (n != 0) {
// int digit = n % 10;
// if (digit == 0) {
// digit = 1;
// ;
// }
// res = res + digit * place;
// place *= 10;
// n = n / 10;
// }

// System.out.println(res);

// }
// }

// public class program {
// int l=0;
// int findLen(String str,int index){

// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// // System.out.println("Enter String:");
// // String str=sc.nextLine();
// String str = "Hello";
// int len = findLen(str,0);

// }
// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a digit:");
// int n = sc.nextInt();
// int sum = 0;
// while (n != 0) {
// int digit = n % 10;
// sum += digit;
// n = n / 10;

// }
// System.out.println("Sum:" + sum);
// }
// }

// public class program {
// public static int factorial(int n) {
// if (n == 1 || n == 0) {
// return 1;
// }
// return n * factorial(n - 1);
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a digit:");
// int n = sc.nextInt();
// int fact = factorial(n);
// System.out.println(fact);
// }
// }

// public class program {
// static void pair(int n) {
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {

// }
// }

// }

// static void complex(int n) {
// for (int i = 0; i < n; i++) {
// pair(n);
// }
// }

// public static void main(String[] args) {
// int n = 8;
// complex(n);
// }
// }

// public class program {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the number of elements:");
// int n = sc.nextInt();
// int[] a = new int[n];
// int large = Integer.MIN_VALUE;
// int second = Integer.MIN_VALUE;
// System.out.println("Enter the elements:");
// for (int i = 0; i < n; i++) { // n
// a[i] = sc.nextInt();
// }
// for (int i = 0; i < n; i++) { // n
// if (a[i] > large) {
// second = large;
// large = a[i];
// } else if (a[i] > second) {
// second = a[i];
// }
// }
// System.out.println("Largest: " + large);
// System.out.println("Second Largest: " + second);

// }

// }

// // Time complexitiy=n+n=2n=n;

// // //time-complexity-n
// // for(int i=1;i<=n;i++){
// // //stmt
// // }

// // //time-complexity-n/2=n
// // for(int i=1;i<=n;i=i+2){
// // //stmt
// // }

// // //time-complexity-log n
// // for(int i=1;i<=n;i=i*2){
// // //stmt
// // }

// import java.util.Scanner;

// public class program {

// public static void main(String[] args) {
// // Input: nums = [2,7,11,15], target = 9
// // Output: [0,1]
// // Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// }
// }

// public class program {

// public static void main(String[] args) {
// //////////////////////////////////////////////////////////////////////////////////////////
// /// ///
// //// ascii values
// 32-space
// // biker highest altitude ///
// // remembering in programming means using variable ///
// // in c number of elemnets in an n=sizeof(move)/sizeof(move[0]);///
// /// ///in c number of elemnets n=sizeof(move)
// //////////////////////////////////////////////////////////////////////////////////////////
// int move[] = { 3, 6, -2, -4, -1, 7, -8 };

// int max = 0;
// int curr = 0;
// for (int i = 0; i < move.length; i++) {
// curr += move[i];
// // if (curr > max) {
// // max = curr;
// // }
// max = curr > max ? curr : max;

// }
// System.out.println(max);

// }

// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// float fin = 0;
// float in = 0;
// for (int i = n; i >= 1; i--) {
// fin = in;
// in = (fin + 100) / 2;
// }
// System.out.println("output " + in);

// }

// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size:");
// int n = sc.nextInt();
// int[] a = new int[n];
// System.out.println("Enter array:");
// for (int k = 0; k < n; k++) {
// a[k] = sc.nextInt();
// }
// boolean flag = true;
// for (int i = 0; i < n - 2; i++) {

// if (a[i] > a[i + 1]) {
// flag = false;
// break;

// }
// }
// if (flag) {
// System.out.println("sorted");
// } else {
// System.out.println("unsorted");
// }

// }
// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size:");
// int n = sc.nextInt();
// int[] a = new int[n];
// System.out.println("Enter array:");
// for (int k = 0; k < n; k++) {
// a[k] = sc.nextInt();
// }
// int[] visited = new int[n];
// for (int i = 0; i < n; i++) {
// visited[i] = 0;
// }
// for (int i = 0; i < n; i++) {
// int count = 1;
// if (visited[i] == 0) {
// for (int j = i + 1; j < n; j++) {
// if (a[i] == a[j]) {
// count++;
// visited[j] = 1;
// }

// }
// System.out.println(a[i] + "->" + count);
// }

// }

// }
// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter size:");
// int n = sc.nextInt();
// int[] a = new int[n];
// System.out.println("Enter array:");
// for (int k = 0; k < n; k++) {
// a[k] = sc.nextInt();
// }
// int i = 0;
// int j = n - 1;

// while (i < j) {
// int temp = a[i];
// a[i] = a[j];
// a[j] = temp;
// i++;
// j--;
// }

// System.out.println("Array Reversed:");
// for (int k = 0; k < n; k++) {
// System.out.println(a[k]);
// }

// }
// }

// import java.util.Scanner;

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a digit:");
// int n = sc.nextInt();
// int res = 0;
// int place = 1;
// while (n != 0) {
// int digit = n % 10;
// if (digit == 0) {
// digit = 1;
// ;
// }
// res = res + digit * place;
// place *= 10;
// n = n / 10;
// }

// System.out.println(res);

// }
// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// float fin = 0;
// float in = 0;
// for (int i = n; i >= 1; i--) {
// fin = in;
// in = (fin + 100) / 2;
// }
// System.out.println("output " + in);

// }

// }

// public class program {
// int l=0;
// int findLen(String str,int index){

// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// // System.out.println("Enter String:");
// // String str=sc.nextLine();
// String str = "Hello";
// int len = findLen(str,0);

// }
// }

// public class program {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a digit:");
// int n = sc.nextInt();
// int sum = 0;
// while (n != 0) {
// int digit = n % 10;
// sum += digit;
// n = n / 10;

// }
// System.out.println("Sum:" + sum);
// }
// }

// public class program {
// public static int factorial(int n) {
// if (n == 1 || n == 0) {
// return 1;
// }
// return n * factorial(n - 1);
// }

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a digit:");
// int n = sc.nextInt();
// int fact = factorial(n);
// System.out.println(fact);
// }
// }

// public class program {
// static void pair(int n) {
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {

// }
// }

// }

// static void complex(int n) {
// for (int i = 0; i < n; i++) {
// pair(n);
// }
// }

// public static void main(String[] args) {
// int n = 8;
// complex(n);
// }
// }

// public class program {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter the number of elements:");
// int n = sc.nextInt();
// int[] a = new int[n];
// int large = Integer.MIN_VALUE;
// int second = Integer.MIN_VALUE;
// System.out.println("Enter the elements:");
// for (int i = 0; i < n; i++) { // n
// a[i] = sc.nextInt();
// }
// for (int i = 0; i < n; i++) { // n
// if (a[i] > large) {
// second = large;
// large = a[i];
// } else if (a[i] > second) {
// second = a[i];
// }
// }
// System.out.println("Largest: " + large);
// System.out.println("Second Largest: " + second);

// }

// }

// // Time complexitiy=n+n=2n=n;

// // //time-complexity-n
// // for(int i=1;i<=n;i++){
// // //stmt
// // }

// // //time-complexity-n/2=n
// // for(int i=1;i<=n;i=i+2){
// // //stmt
// // }

// // //time-complexity-log n
// // for(int i=1;i<=n;i=i*2){
// // //stmt
// // }