public class Main_TreeNode {
    public static void main(String[] args) {
        NodeTree drinks = new NodeTree("Drinks");
        NodeTree hot = new NodeTree("hot");
        NodeTree cold = new NodeTree("cold");
        NodeTree tea = new NodeTree("tea");
        NodeTree coffee = new NodeTree("coffee");
        NodeTree juice = new NodeTree("orange");
        NodeTree soda = new NodeTree("cola");

        drinks.addChild(hot);
        drinks.addChild(cold);
        drinks.addChild(tea);
        drinks.addChild(coffee);
        drinks.addChild(juice);
        drinks.addChild(soda);
        System.out.println(drinks.print(0));
    }
}
