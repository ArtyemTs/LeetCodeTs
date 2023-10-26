package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String st = String.valueOf(x);
//        char[] charArray = st.toCharArray();
//        boolean result;
//        for (int i = 0; i < charArray.length / 2; i++) {
//            if (charArray.length > 1) {
//                if (charArray[i] != charArray[charArray.length - 1 - i]) {
//                    return false;
//                }
//            }
//        }
//        return true;
        if(x < 0 || x % 10 == 0) {
            return false;
        }
        int reversed = 0;
        int temp = x;

        while(reversed < x) {
            reversed *= 10;
            reversed += x % 10;
            x /= 10;
        }
        return (reversed == x) || (x == reversed/10);
    }
}
