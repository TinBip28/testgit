package sortstrategy;

import java.util.Arrays;
import java.util.Random;

public class App {
    private static final Random random = new Random();

    private static int[] createRandomIntArray() {
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(4, 20);
        }
        return data;
    }

    private static String arrayToString(int[] data) {
        return Arrays.toString(data).replaceAll(",", "");
    }

    public static void main(String[] args) {
        int[] data = createRandomIntArray();
        SortStrategy sortStrategy = SortStrategy.getInstance();

        ISort bubbleSort = new BubbleSort();
        sortStrategy.setSortee(bubbleSort);

        int[] copyData = Arrays.copyOf(data, data.length);
        System.out.println("Using Bubble Sort ALgorithm");
        System.out.println("Before sorting: " + arrayToString(copyData));
        int swapCount = sortStrategy.sort(copyData);
        System.out.println("After sorting: " + arrayToString(copyData));
        System.out.println("Counting: " + swapCount);

        ISort selectionSort = new SelectionSort();
        sortStrategy.setSortee(selectionSort);

        copyData = Arrays.copyOf(data, data.length);
        System.out.println("Using Selection Sort ALgorithm");
        System.out.println("Before sorting: " + arrayToString(copyData));
        swapCount = sortStrategy.sort(copyData);
        System.out.println("After sorting: " + arrayToString(copyData));
        System.out.println("Counting: " + swapCount);

        ISort insertionSort = new InsertionSort();
        sortStrategy.setSortee(insertionSort);

        copyData = Arrays.copyOf(data, data.length);
        System.out.println("Using Insertion Sort ALgorithm");
        System.out.println("Before sorting: " + arrayToString(copyData));
        swapCount = sortStrategy.sort(copyData);
        System.out.println("After sorting: " + arrayToString(copyData));
        System.out.println("Counting: " + swapCount);
    }
}
