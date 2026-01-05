public class Stack <T>{
    public Node node = null;
    public int size =0;


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T data){
        var newNode = new Node<>(data);
        if (isEmpty()){
            node = newNode;
        }else{
            var curNode = node;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
        size++;

    }
}
