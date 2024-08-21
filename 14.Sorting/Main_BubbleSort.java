public class Main_BubbleSort {

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {5, 3, 8, 4, 2};
        bs.bubbleSort(arr);
        bs.printArray(arr);

    }
}