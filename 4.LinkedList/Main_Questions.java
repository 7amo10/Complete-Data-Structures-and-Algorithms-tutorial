public class Main_Questions {
    //Question 1
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.createLL(1);
        ll.insertNode(9);
        ll.insertNode(5);
        ll.insertNode(10);
        ll.insertNode(2);
        ll.traversalLL();
        Questions q = new Questions();
        //!=>1
        // q.deleteDups(ll);
        // ll.traversalLL();
        //^----------------------------------------
        //!=>2
        // Node n = q.nthToLast(ll, 2);
        // System.out.println(n.value);
        //^----------------------------------------
        //!=>3
        // LinkedListClass t = q.partition(ll, 4);
        // t.traversalLL();
        //^----------------------------------------
        //!=>4
        LinkedListClass llA = new LinkedListClass();
        llA.createLL(7);
        llA.insertNode(1);
        llA.insertNode(6);
        LinkedListClass llB = new LinkedListClass();
        llB.createLL(5);
        llB.insertNode(9);
        llB.insertNode(2);
        LinkedListClass result = q.sumLists(llA, llB);
        result.traversalLL();
        //^----------------------------------------
        //!=>5
        

    }
}
