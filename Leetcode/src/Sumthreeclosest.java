import java.util.Arrays;

import static java.lang.Math.abs;

public class Sumthreeclosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=0;
        for(int i=0;i<nums.length-2;i++){
            if(i==0||i>0&&nums[i]!=nums[i-1]){
                int lo=i+1, hi = nums.length-1,sum=0-target;
                while(lo<hi){
                        diff=Math.max(diff,abs(nums[lo]+nums[hi]+nums[i])-target);
                    while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                    while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                    lo++;
                    hi--;
                    }
            }
        }return (diff==0)? target:diff;
    }
}
