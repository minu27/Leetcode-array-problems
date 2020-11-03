import java.util.*; 
public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
       
        int l = nums.length;
        
        for (int j = 0; j < k; j++){
            
            int i, temp; 
            temp = nums[l-1]; 
            for (i = l-1; i > 0 ; i--) 
                nums[i] = nums[i - 1]; 
            nums[0] = temp;
        }
        
        return nums;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n[] = rotate(nums,k);
        System.out.println("Array after rotation: "+ Arrays.toString(n));
    }
}
