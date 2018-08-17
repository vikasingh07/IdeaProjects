import java.util.ArrayList;

public class Flipbittowin {
    ArrayList<Integer> Findlongestones(int n){
        ArrayList<Integer> sequence = new ArrayList<Integer>();
        int searchingfor =0;
        int counter =0;

        for(int i=0;i<Integer.BYTES*8;i++){
            if((n&1)!=searchingfor){
                sequence.add(counter);
                searchingfor=n&1;
                counter=0;
            }
                counter++;
                n>>>=1;
        } sequence.add(counter);
        return sequence;
    }
}
