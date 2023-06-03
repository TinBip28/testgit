package sortstrategy;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < (data.length - i); j++) {
                if (data[j - 1] > data[j]) {
                    //swap elements
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                    count++;
                }

            }
        }
        return count;
    }
}