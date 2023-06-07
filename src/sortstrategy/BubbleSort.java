package sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        int swapCount = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;

                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}
