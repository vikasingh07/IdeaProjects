import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sumtarget {
    public int[] twosum(int[] nums, int target){
        Set<Integer> set = new HashSet<Integer>();
        int[] ints = new int[2];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=nums.length-1;j>i;j--){
                if(nums[i]+nums[j]==target){
                    set.add(i);
                     set.add(j);
                }
            }
        }

        int b=0;
       for(int x: set)
           ints[b++]=x;
        return ints;

    }

}
