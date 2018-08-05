public class Intpalindrome {
    public boolean palindrome(int x){
        int reverse_input = 0; int base =0; int sign = 0;
        int temp =x;
        if(x<0){
            sign= -1;
        }else{
            sign=1;
        }

        while(x!=0){
            base=x%10;
            reverse_input=reverse_input*10+base;
            x=x/10;
        }


        if(temp==reverse_input){
            return true;
        }else{
            return false;
        }

    }
}
