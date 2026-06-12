class SumArray{
    public static void sumArray(int[] nums) {
        int sum=0;
        for(int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
            sum+= nums[i];
        }
         System.out.println(sum);
        
       
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        sumArray(nums);
   
    }
}