public class Main_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 12, 1, 9, 10, 6, 3, 8};
        MergeSort.mergeSort(arr, 0, arr.length-1);
        MergeSort.printArray(arr);
    }
}

