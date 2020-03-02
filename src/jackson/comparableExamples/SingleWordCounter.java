package jackson.comparableExamples;

public class SingleWordCounter implements Comparable<SingleWordCounter> {
    private String word;
    private int count;

    SingleWordCounter(){}
    //inc count
    // get count

    @Override
    public int compareTo(SingleWordCounter other){
        if (this.count < other.count){
            return -1;
        }
        else if (this.count > other.count){
            return  1;
        }
        else {
            return word.compareTo(other.word);
        }
    }
}
