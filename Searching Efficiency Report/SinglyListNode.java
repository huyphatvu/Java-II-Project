import java.util.Objects;

/**
 * Created by Huy Vu on 4/10/2017.
 */
public class SinglyListNode<T> {
    private T data;
    private SinglyListNode<T> nextNode;

    public SinglyListNode(T Object){
        this(Object, null);
    }
    public SinglyListNode(T Object, SinglyListNode<T>next){
        data= Object;
        nextNode = next;
    }

    public  T getData(){
        return data;
    }
    public SinglyListNode<T> getNextNode(){
        return nextNode;
    }
    public void setNextNode(SinglyListNode<T> next){
        nextNode = next;
    }

}
