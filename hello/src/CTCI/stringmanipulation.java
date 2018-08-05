import java.util.*;

public class stringmanipulation {
    public static void main(String[] args){
        String init = "I am the best       ";
        findspace(init);
    }


    public static void findspace(String t){

        String a=t.trim();

        char[] finalstring = new char[a.length()*3];
        int index = finalstring.length;
        char[] initialstring = a.toCharArray();
        for(int i=initialstring.length-1;i>=0;i--){
            if(initialstring[i] == ' '){
                finalstring[index-1]='%';
                finalstring[index-2]='2';
                finalstring[index-3]='0';
                index=index-3;
            }else{
                finalstring[index-1]=initialstring[i];
                index--;
            }
        }
        System.out.println(finalstring);
    }
}
