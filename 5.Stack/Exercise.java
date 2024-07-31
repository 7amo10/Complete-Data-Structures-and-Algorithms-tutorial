/*
 ! Balanced Parentheses Checker
 * Balanced Parentheses Checker
 * Given an expression string, write a Java program to check whether the parentheses in the expression are balanced or not. 
 * The types of parentheses to consider are curly {}, square [], and round ().
 * Hint: Using stacks for parsing and balancing symbols. 
 */
import java.util.Stack;

public class Exercise {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //*=> Time Complexity is: O(N) And Space Complexity is: O(N)

}
