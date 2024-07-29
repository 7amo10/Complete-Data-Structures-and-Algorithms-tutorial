package Entry_Exercises;
public class Main_ThreeInOne {
    public static void main(String[] args) {
        ThreeInOne newStacks = new ThreeInOne(3);
        newStacks.push(0,1);
        newStacks.push(0,2);
        newStacks.push(1,4);
        newStacks.push(1,5);
        newStacks.push(2,8);
        boolean result = newStacks.isEmpty(0);
        System.out.println(result);
        int result1 = newStacks.pop(1);
        System.out.println(result1);
        int result2 = newStacks.peek(2);
        System.out.println(result2);
    }
}
