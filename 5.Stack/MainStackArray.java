public class MainStackArray {
    public static void main(String[] args) {
        Stack_Array stack = new Stack_Array(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.peek());
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
    }
}
