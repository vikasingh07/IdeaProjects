public class Maxwater {
    public int maxArea(int[] height){
        int a=0;
        int first=0;
        int last=height.length-1;
        while(first<last){
            a=Math.max(a,Math.min(height[first],height[last])*(last-first));
            if(height[first]<height[last]){
                first++;
            }else{
                last--;
            }
        }return a;
    }
}
