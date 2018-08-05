import java.util.*;

public class permtu {
    public static void main(String[] args){
            String a = "cat";
            String b = "tac";
            if(comparestr(a,b)){
                System.out.println("permutation");
            }else{
                System.out.println("not a permutation");
            }
    }


public static String sortstring (String s){
    char[] sorteds = s.toCharArray();
    Arrays.sort(sorteds);
    return new String(sorteds);
}

public static boolean comparestr (String a, String b){
        String p =sortstring(a);
        String q = sortstring(b);
        if(p.equals(q)){
            return true;
        }else{
            return false;
        }
}

}

