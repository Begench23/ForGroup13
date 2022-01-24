package misha;

public class String1 {
    public static void main(String[] args) {
        String str = "World";

        String res = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            char chr = str.charAt(i);
            res += chr;
        }
        System.out.println(res);
    }
}
