/**
 * Created by Huy Vu on 4/10/2017.
 */
public class SinglyList<T> {
    private SinglyListNode<T> firstNode;
    private SinglyListNode<T> lastNode;

    public SinglyList(){
        firstNode=null;
        lastNode= null;
    }

    public boolean isEmpty(){
        return (firstNode == null);
    }
    public void insertAtFront(T object){
        if(isEmpty()){
            firstNode=lastNode=new SinglyListNode<T>(object);
        }else{
            firstNode=new SinglyListNode<T>(object, firstNode);
        }
    }
    public void insertAtBack(T object){
        if(isEmpty()){
            firstNode=lastNode=new SinglyListNode<T>(object);
        }else{
            SinglyListNode<T> newNode = new SinglyListNode<T>(object, null);
            lastNode.setNextNode(newNode);
            lastNode=newNode;
        }
    }
    public T removeFromFront() throws RuntimeException{

        if(isEmpty()){
            throw new RuntimeException();
        }else {
            T first = firstNode.getData();
            if(firstNode == lastNode){
                firstNode=lastNode=null;
            }
            firstNode=firstNode.getNextNode();
            return first;
        }

    }
    public T removeFromBack() throws RuntimeException{

        if(isEmpty()){
            throw new RuntimeException();
        }else {
            T last = lastNode.getData();
            if(firstNode==lastNode){
                firstNode=lastNode=null;
            }
            SinglyListNode<T> current = firstNode;
            while (current.getNextNode()!=lastNode){
                current=current.getNextNode();
            }
            lastNode=current;
            lastNode.setNextNode(null);
            return last;
        }

    }

}
