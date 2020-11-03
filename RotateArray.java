import java.util.*; 
public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        int length = nums.length;
        int newarr[] = new int[length]; 
        int j = length-k;
        
        for(int i=0;i<k;i++){
            newarr[i] = nums[j];
            j++;
        }
        int y = 0;
        for(int x = k; x<length; x++){
            newarr[x] = nums[y];
            y++;
        }
        return newarr;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        int newarr[] = rotate(nums,k);
        System.out.println("Array after rotation: "+ Arrays.toString(newarr));
    }
}
