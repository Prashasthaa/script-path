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
