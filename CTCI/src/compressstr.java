import java.util.*;

public class compressstr {
    String compressstr(String s){
        String Compressdsre = "";
        int countconsecutive=0;
        for(int i=0;i<s.length();i++){
            countconsecutive++;
            if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)){
                Compressdsre+=""+s.charAt(i)+countconsecutive;
                countconsecutive=0;
            }
        }
    return Compressdsre.length()<s.length() ? Compressdsre.toString(): s ;
    }

}
