public class Main_Exercizes {
    public static void main(String[] args) {
        Stack_All stack = new Stack_All(10);
        stack.push(5);
        stack.push(10);
        stack.push(7);
        stack.push(3);
        stack.pop();
        // System.out.println(stack.getPeakValue());  // Outputs: 10
    }
}
