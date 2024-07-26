public class MainQueueLinkedList {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
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
        queue.deleteQueue(); 
    }
}
