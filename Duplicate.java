import java.util.HashMap; 
public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        boolean duplicate = false;
        
        for(int i=0; i<l; i++){
            if(map.containsKey(nums[i])){
                duplicate = true;
                return duplicate;
            }else{
                map.put(nums[i], i);
            }
        }
        return duplicate;      
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,3,6,7};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
}
