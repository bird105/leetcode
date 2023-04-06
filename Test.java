public class Test {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int count = removeElement(nums,val);
        System.out.println(count);
    }
    public static int removeElement(int[] nums, int val) {
        int count = nums.length;
        nums[0] = 0;
        for(int i = 0,j = nums.length - 1; i < j ; ){
            if (nums[i] == val){
                nums[i] = nums[j];
                nums[j] = val;
                j--;
                count--;
            } else {
                i++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return count;
    }
}
