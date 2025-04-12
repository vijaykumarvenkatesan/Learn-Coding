public class LinkedList {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    LinkedList(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }

    }

    public void display(){
        Node temp = head;
        while(temp!= null ){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPosistion(int pos, int val){

        if(pos == 0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i =1; i<pos;i++){
            temp = temp.next;
            if(temp == null){
                throw new IllegalArgumentException("Invalid pos "+pos);
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

}
