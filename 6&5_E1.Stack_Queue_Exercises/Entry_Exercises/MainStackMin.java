package Entry_Exercises;

public class MainStackMin {
    public static void main(String[] args) {
        StackMin stack = new StackMin();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.pop();
        stack.pop();
        System.out.println(stack.min());
    }
}
