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

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 15 };
        System.out.println(distinct(nums));

    }
}
