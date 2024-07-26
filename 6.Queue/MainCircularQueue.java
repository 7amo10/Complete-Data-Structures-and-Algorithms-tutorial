public class MainCircularQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        boolean result = queue.isEmpty();
        System.out.println(result);
        queue.enQueue(1);
        queue.enQueue(7);
        queue.enQueue(4);
        queue.enQueue(10);
        queue.enQueue(9);
        int res = queue.deQueue();
        System.out.println(res);
        int res_pek = queue.peek();
        System.out.println(res_pek);
        boolean result_full = queue.isFull();
        System.out.println(result_full);
        queue.deleteQueue(); 
    }
}
