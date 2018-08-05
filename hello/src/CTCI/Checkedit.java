package CTCI;
import java.util.*;
public class Checkedit {
public void main(String[] args){
  String a="Pale";
  String b="Bale";

  if(a.length()==b.length()){
      oneeditupdate(a,b);
  }else if (a.length()+1==b.length()){
      oneeditreplace(a,b);
  }else if(b.length()+1==a.length()){
      oneeditreplace(b,a);
  }else {
      System.out.println("not a one edit string comparision");
  }

}

void oneeditreplace(String s1, String s2){
  char[] p = s1.toCharArray();
  char[] q = s2.toCharArray();
  Arrays.sort(p);
  Arrays.sort(q);
  int index0=0;
  int index1=1;
  while(index1<s2.length() && index0<s1.length()) {
      if(s1.charAt(index0)!=s2.charAt(index1)){
          if (index1!=index0){
              System.out.println("not a one edit string comparision");
          }index1++;
      }else{
          index0++;
          index1++;
      }
  }System.out.println("One edit string comparision");
}

void oneeditupdate(String s1, String s2){
    Boolean check =false;
    for (int i=0;i<s1.length();i++){
        if(s1.charAt(i)!=s2.charAt(i)){
            if (check){
                System.out.println("not a one update string");
            }
            check =true;
        }
        System.out.println("one edit string");
}


}}
