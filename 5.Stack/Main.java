public class Main {
    public static void main(String[] args) {
        String[] testExpressions = {
            "()", // Balanced
            "([])", // Balanced
            "{[()]}", // Balanced
            "([)]", // Not balanced
            "((()", // Not balanced
            ")", // Not balanced
            "{" // Not balanced
        };

        for (String expression : testExpressions) {
            boolean result = Exercise.isBalanced(expression);
            System.out.println("Expression: " + expression + " is " + (result ? "Balanced" : "Not Balanced"));
        }
    }
}
