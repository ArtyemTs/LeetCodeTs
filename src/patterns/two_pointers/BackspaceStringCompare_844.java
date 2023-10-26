package patterns.two_pointers;

public class BackspaceStringCompare_844 {
    public boolean backspaceCompare(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        int si = sc.length - 1; // index for s
        int ti = tc.length - 1; // index for t

        while (si >= 0 || ti >= 0) {
            si = getOfset(sc, si);
            ti = getOfset(tc, ti);
            if (si < 0 && ti < 0) {
                return true;
            }
            if (si < 0 || ti < 0) {
                return false;
            }

            if (sc[si] != tc[ti]) {
                return false;
            }
            si--;
            ti--;
        }
        return true;
    }

    private int getOfset(char[] arr, int i) {
        int count = 0;

        while (i >= 0) {
            if (arr[i] == '#') {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                break;
            }
            i--;
        }
        return i;
    }
}
