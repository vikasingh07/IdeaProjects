public class uniquetest {
    public static void main(String[] args) {
        if (isuniquestr("abcd")) {
            System.out.println("unique string");
        } else {
            System.out.println("not unique");
        }
    }

    public static boolean isuniquestr(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
}