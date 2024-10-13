package ProductOfArrayExceptSelf;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums){
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] solution = new int[nums.length];
        int cumulative_product = 1;

        for (int i = 0; i < nums.length; i++) {
            cumulative_product *= nums[i];
            left[i] = cumulative_product;
        }
        cumulative_product = 1;
        for (int i = nums.length-1; i >= 0 ; i--) {
            cumulative_product *= nums[i];
            right[i] = cumulative_product;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                solution[i] = right[1];
                continue;
            } else if (i == nums.length-1){
                solution[i] = left[i-1];
                continue;
            }
            solution[i] = left[i-1] * right[i+1];
        }
        return solution;
    }

    public static void main(String[] args) {
        int[] output = productExceptSelf(new int[] {1,2,3,4});
        for (int num : output){
            System.out.println(num);
        }
    }
}
