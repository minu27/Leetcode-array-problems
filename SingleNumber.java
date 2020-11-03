import java.util.HashMap;
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int l = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int s = 0;
        for(int i=0; i<l; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                map2.put(nums[i], i);
            }
        }
        for(int i=0; i<l; i++){
            if (!map2.containsKey(nums[i])) {
                    s=nums[i];
                    return s;
            }
        }
        return s;
    }
    public static void main(String args[]){
        int nums[] = {4,1,2,1,2};
        int single = singleNumber(nums);
        System.out.println(single);
    }
}
