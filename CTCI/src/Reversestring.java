public class Reversestring {
    public int reverse(int x){
        int result =0;

        while(x!=0){
            int last=x%10;
            int y = result*10+last;
            if ((y-last)/10 != result){
                return 0;
            }
            result=y;
            x=x/10;
        }
        return result;
    }
}
