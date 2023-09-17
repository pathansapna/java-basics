package Method_OOPs_Collections;

public class CountVowelsInString {
    public static void main(String[] args) {
        String s = "hello";
        countVowels(s);
    }

    private static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = Character.toLowerCase(s.charAt(i));
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                count++;

            }
        }
        return count;
    }
}
