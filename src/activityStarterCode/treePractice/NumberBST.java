package treePractice;

/**
 * Represents a binary search tree of number objects. This enforces the constraint that we can subtract objects
 * to determine the closes value that exists in the tree to a target.
 * @param <E>
 */
public class NumberBST<E extends Number & Comparable<E>> extends BinarySearchTree<E> {

    /**
     * Returs the closest value to data that exists in the tree.
     * @param data target to search for.
     * @return data if it exists in the tree, or the next closest value that actually exists.
     */
    public E getClosest(E data) {
        return getClosestRecursive(root, data, null, null);
    }

    /**
     * Recursive call to explore the current local root node of the current subtree.
     * @param localRoot root node for the current subtree
     * @param target we are searching for
     * @param lowerBound the closest value that is lower than the target that we have found so far
     * @param upperBound the closest value that is greater than the target that we have found so far
     * @return closest value
     */
    private E getClosestRecursive(Node<E> localRoot, E target, E lowerBound, E upperBound){
        //TODO: Implement me
        return localRoot; // this is wrong!
    }
}
