
class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length == 0){
            return 0;
        }
        int i;
        int targetIndex = 1;
        int comp = nums[0];
        
        for(i=1;i<length;i++){
            if(nums[i] != comp){
                comp = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
                
            }
        }
        return targetIndex;
    }
    public static void main(String args[]){
        int nums[] = {1,1,2};
        int len = removeDuplicates(nums);
        System.out.println("Array size after removing duplicates is "+len);
    }

}