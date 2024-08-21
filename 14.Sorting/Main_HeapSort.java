public class Main_HeapSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 8, 3, 9, 4, 1, 6};
        HeapSort hs = new HeapSort(arr);
        hs.sort();
        hs.printArray();
    }
}
