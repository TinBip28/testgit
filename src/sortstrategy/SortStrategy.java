package sortstrategy;

public class SortStrategy {
    private ISort sortee;
    private static SortStrategy instance;


    public SortStrategy() {

    }

    public void setSortee(ISort sortee) {
        this.sortee = sortee;
    }

    public static SortStrategy getInstance() {
        if (instance == null) {
            instance = new SortStrategy();
        }
        return instance;
    }

    public int sort(int[] data) {
        return sortee.sort(data);
    }
}
