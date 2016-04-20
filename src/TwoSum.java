/**
 * Created by Shadow on 2016/3/30.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] ints = new TwoSum().twoSum(new int[]{1, 2, 3,9,6,4}, 10);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] n = {0,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    n[0] = i;
                    n[1] = j;
                    return n;
                }
            }
        }
        return n;
    }
}
