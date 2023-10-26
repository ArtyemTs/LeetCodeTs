package patterns.binary_search;

public class FindSmallestLetterGreaterThanTarget_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int rigth = letters.length - 1;

        while (left <= rigth) {
            int index = (left + rigth) / 2;
            char mid = letters[index];
            if (mid > target) {
                rigth = index - 1;
            } else {
                left = index + 1;
            }
        }
        return letters[left % letters.length];
    }
}
