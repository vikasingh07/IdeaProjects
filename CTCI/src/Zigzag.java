import java.util.*;

public class Zigzag {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        StringBuffer[] ld = new StringBuffer[numRows];
        for (int i=0;i<numRows;i++) ld[i]=new StringBuffer();

        int i=0;
        while ( i<s.length()){

            for(int index=0;index<numRows && i<s.length();index++) ld[index].append(c[i++]);
            for(int index=numRows-2;index<numRows && i<s.length();index--) ld[index].append(c[i++]);

        }
        for (int idx = 1; idx < ld.length; idx++)
            ld[0].append(ld[idx]);
        return ld[0].toString();
    }
}
