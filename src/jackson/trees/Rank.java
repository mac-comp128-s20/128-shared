package jackson.trees;

public class Rank {

//    public int rank(K key){
//        return rank(key, root);
//    }
//
//    private int rank(K key, Node localRoot){
//        int cmp = key.compareTo(localRoot.data);
//        if (localRoot == null) {
//            return 0;
//        }
//        if (cmp < 0){
//            return rank(key, localRoot.left);
//        }
//        else if (cmp > 0){
//            return 1 + localRoot.left.size + rank(localRoot.right);
//        }
//        else {
//            return localRoot.left.size;
//        }
//    }
}
