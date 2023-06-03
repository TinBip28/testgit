package sortstrategy;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int count = 0;
        for (int i = 1; i < data.length; ++i) {
            int key = data[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
            count++;
        }
        return count;
    }
}
