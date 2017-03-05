/**
 * Created by chenwenping on 17/3/5.
 */
public class BinarySearch {

    /**
     * @param array
     * @param a
     * @return
     */
    public static int binarySearch(int []array, int a) {
        int start = 0;
        int end = array.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (a > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    /**递归，时间复杂度 O(logN)
     * @param array
     * @param a
     * @param start
     * @param end
     * @return
     */
    public static int search(int []array, int a, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a == array[mid]) {
                return mid + 1;

            } else if (a < array[mid]) {
                return search(array, a, start, mid - 1);
            }  else {
                return search(array, a, mid + 1, end);
            }
        }
        return -1;
    }
}
