public class stackUsingLL {

    private class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data = data;
            next = null;
        }
    }
    StackNode top;
    int size;
    stackUsingLL(){
        top = null;
        size =0;
    }
    public void push(int val){
        StackNode node = new StackNode(val);
        node.next = top;
        top = node;
        size++;
    }

    public int pop(){
        if(top == null) throw new RuntimeException("The queue is empty");
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }
    public int size(){
        return size;
    }
    public int top(){
        if(top == null) throw new RuntimeException("The stack is empty");
        return top.data;
    }
}
