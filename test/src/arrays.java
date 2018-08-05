public class arrays {
    public  void main(String[] args){
       if(isuniquestr("abacd")){
           System.out.println("unique string");
       }else{
           System.out.println("not unique");
       }
    }


    public boolean isuniquestr(String str){
        if (str.length() >128) return false;
        boolean[] charset = new boolean[128];

        for(int i=0; i<str.length();i++){
            int val = str.charAt(i);
            if(charset[val]){
                return false;
            }
            charset[val]=true;
        }
        return true;
    }
}
