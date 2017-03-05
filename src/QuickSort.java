/**
 * Created by chenwenping on 17/3/5.
 */
public class QuickSort {
    /**
     * @param array
     */
    public static void quickSort(int[] array) {
        if (array != null) {
            quickSort(array, 0, array.length - 1);
        }
    }

    /**
     * @param array
     * @param start
     * @param end
     */
    private static void quickSort(int[] array, int start, int end) {
        if (start >= end || array == null) {
            return;
        }

        int p = partition1(array, start, end);
        quickSort(array, start, p - 1);
        quickSort(array, p + 1, end);
    }

    /**
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partition1(int[] array, int start, int end) {
        int frist = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (array[i] < frist && i < end) {
                i ++;
            }

            while (frist < array[j] && j > start) {
                j --;
            }

            if (i < j) {
                array[i] = array[i] ^ array[j];
                array[j] = array[i] ^ array[j];
                array[i] = array[i] ^ array[j];

            }

        }

        if (j != start) {

            array[j] = array[start] ^ array[j];
            array[start] = array[start] ^ array[j];
            array[j] = array[start] ^ array[j];
        }
        return j;
    }

    /**
     * @param array
     * @param start
     * @param end
     * @return
     */
    private static int partition2(int[] array, int start, int end) {
        int last = array[end];
        int i = start - 1;

        for (int j = start; j < end - 1; j ++) {
            if (array[j] <= last) {
                i ++;
                if (i != j) {
                    array[i] = array[i]^array[j];
                    array[j] = array[i]^array[j];
                    array[i] = array[i]^array[j];
                }
            }
        }

        if((i+1) != end){
            array[i+1] = array[i+1]^array[end];
            array[end] = array[i+1]^array[end];
            array[i+1] = array[i+1]^array[end];
        }
        return i+1;
    }

}
