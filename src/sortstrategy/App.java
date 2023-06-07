package sortstrategy;

import java.util.Arrays;
import java.util.Random;

public class App {
    private static final Random random = new Random();

    private static int[] randomIntArray() {
        int[] data = new int[5];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(5, 19);
        }
        return data;
    }

    private static String arrayToString(int[] data) {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        SortStrategy sortStrategy = new SortStrategy();
        ISort bubbleSort = new BubbleSort();
        sortStrategy.setSortee(bubbleSort);
        int[] data = randomIntArray();
        int[] copyData = Arrays.copyOf(data,data.length);
        System.out.print("Before sorting: " + arrayToString(copyData));
        int count = sortStrategy.sort(copyData);
        System.out.println("\nAfter sorting: " + arrayToString(copyData));
        System.out.println("Number of swapping: " + count);

        copyData = Arrays.copyOf(data,data.length);
        ISort insertionSort = new InsertionSort();
        sortStrategy.setSortee(insertionSort);
        System.out.print("Before sorting: " + arrayToString(copyData));
        count = sortStrategy.sort(copyData);
        System.out.println("\nAfter sorting: " + arrayToString(copyData));
        System.out.println("Number of swapping: " + count);

        copyData = Arrays.copyOf(data,data.length);
        ISort selectionSort = new SelectionSort();
        sortStrategy.setSortee(selectionSort);
        System.out.print("Before sorting: " + arrayToString(copyData));
        count = sortStrategy.sort(copyData);
        System.out.println("\nAfter sorting: " + arrayToString(copyData));
        System.out.println("Number of swapping: " + count);
    }
}
