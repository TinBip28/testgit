package sortstrategy;

public class SelectionSort implements ISort {
    @Override
    public int sort(int[] data) {
        int swapCount = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
}
