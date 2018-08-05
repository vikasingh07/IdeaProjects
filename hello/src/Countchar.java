import java.util.Arrays;

public class Countchar {
public void main(String[] args){
    String strinput="aabcccccaaa";
    compressstr(strinput);

}
void compressstr(String s){
    char[] a =s.toCharArray();
    Arrays.sort(a);
    String seen= "";
    int count1=0;
    for (int i = 0; i < a.length; i++) {
        char character = a[i];
        if (!seen.contains(character+"")){
            seen+=a[i];
            seen+=count1;
            count1=0;
        }else {
            count1++;

        }
    }
    System.out.println(seen);


}


}
