package sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int count = 0;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < data.length - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < data.length; j++)
                if (data[j] < data[minIdx])
                    minIdx = j;

            // Swap the found minimum element with the first
            // element
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
            count++;
        }
        return count;
    }
}
