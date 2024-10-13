package TwoSum;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(TwoSum.twoSum(new int[] {3,2,3},6));
    }
}
