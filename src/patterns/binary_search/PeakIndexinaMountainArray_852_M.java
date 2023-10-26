package patterns.binary_search;

public class PeakIndexinaMountainArray_852_M {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int index = (left + right) / 2;
            int mid = arr[index];
            if (mid < arr[index + 1]) {
                left = index + 1;
            } else {
                right = index - 1;
            }
        }
        return left;
    }
}
