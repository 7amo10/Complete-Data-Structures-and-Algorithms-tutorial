public class Main_Binary_Heap {
    public static void main(String[] args) {
        Binary_Heap heap = new Binary_Heap(5);
        heap.insert(10, "Max");
        heap.insert(5, "Max");
        heap.insert(15, "Max");
        heap.insert(1, "Max");
        heap.levelOrder();
        heap.extractHeadOfBP("Max");
        heap.levelOrder();
      }
}
