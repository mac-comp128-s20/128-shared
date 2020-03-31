package treePractice;

public class TreeUsage {

    public static void main(String[] args){

        BinarySearchTree<String> bst = new BinarySearchTree<>();
        bst.add("Bret");
        bst.add("Abbey");
        bst.add("Shilad");
        bst.add("Esra");
        bst.add("Libby");

        assert(bst.contains("Susan") == false);
        assert(bst.contains("Esra") == true);


        NumberBST<Integer> intTree = new NumberBST<>();
        intTree.add(32);
        intTree.add(24);
        intTree.add(28);
        intTree.add(21);
        intTree.add(14);
        intTree.add(25);
        intTree.add(31);
        intTree.add(41);
        intTree.add(36);
        intTree.add(47);
        intTree.add(39);

        System.out.println(intTree.getClosest(29)); // should return 28!
    }
}
