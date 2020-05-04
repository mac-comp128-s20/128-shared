package jackson.priorityQueue;

public class MyPriorityQueue {

    public class Node<T extends Comparable<T>>
    {
        public T data;
        private Node<T> next;
        private Node<T> previous;

        public T getData(){return data;}
        public Node<T> getNext() {return next;}
        public Node<T> getPrevious() {return previous; }
        public void setNext(Node<T> node) {next = node;}
        public void setPrevious(Node<T> node) {previous = node;}
    }

    public class Priority_Queue<T extends Comparable<T>>
    {
        private Node<T> head;

        public void offer(T item) {}
        public T poll( ) {
           //find lowest priority item
            Node<T> current = head;
            Node<T> lowest = head;

            while(current != null) {
                if (current.getData().compareTo(lowest.getData()) < 0){
                    lowest = current;
                }
                current = current.getNext();
            }

           //remove it from the linked list of nodes
            if (lowest != null){
                Node<T> prev = lowest.getPrevious();
                if(prev != null){
                    prev.setNext(lowest.getNext());
                }
                Node<T> next = lowest.getNext();
                if (next != null){
                    next.setPrevious(lowest.getPrevious());
                }
                if (lowest == head){
                    head = next;
                }
                return lowest.getData();
            }
            return null;

           // return
        }

    }
}
