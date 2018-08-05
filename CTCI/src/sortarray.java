import java.util.Arrays;
import java.util.*;
public class sortarray {
    public double findMedianSortedArrays(int[] A, int[] B ){
        int nums1length= A.length;
        int nums2length= B.length;

        int[] final1 = new int[nums1length + nums2length];
        int q =0;
        int i=0;
        for(i=0;i<nums1length;i++){
            final1[i]=A[i];
        }
        for(int j=0;j<nums2length;j++)
        {
            final1[j+i]=B[j];

        }

        Arrays.sort(final1);

        double max=0;
        double min =0;
        double median =0;

        if(final1.length%2!=0) {
            median=final1[final1.length/2];
        }else{
            max = final1[((final1.length) / 2)];
            min = final1[((final1.length)/ 2) - 1];
            median = ( (max+min)/2);
        }
        return median;
    }
}
