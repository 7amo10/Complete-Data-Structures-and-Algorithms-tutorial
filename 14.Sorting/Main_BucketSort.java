public class Main_BucketSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 9, 5, 2, 7};
        BucketSort bs = new BucketSort(arr);
        bs.printArray();
        bs.bucketSort();
        bs.printArray();
    }
}
