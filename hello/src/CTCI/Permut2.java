public class Permut2 {
    public static void main(String[] args){
        String s= "aaaaabbbbb";
        charcount(s);
    }

    public static void charcount(String s){
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++) {
            int acount = 0;
            char[] testexist = new char[30];
            for (int p = 0; i < testexist.length; p++) {
                testexist[p]=a[i];
                for (int j = 0; j < s.length(); j++) {
                    if (a[i] == a[j]) {
                        acount++;
                    }
                }
                if(testexist[p]==a[i+1]){
                    testexist[p]--;
                }
                System.out.println("the character " + testexist[p] + " occurs " + acount);
            }
        }
    }
}
