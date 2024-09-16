import java.util.HashMap;

public class TopDown {
    public static int fibMemo(int n, HashMap<Integer, Integer> memo) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, (fibMemo(n - 1, memo) + fibMemo(n - 2, memo)));
        }
        return memo.get(n);

    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        System.out.println(fibMemo(6, memo));
    }
}
