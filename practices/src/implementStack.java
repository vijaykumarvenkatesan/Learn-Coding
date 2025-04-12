public class implementStack {
    public static void main(String[] args) {
        ImpleStack stack = new ImpleStack();
        System.out.println(stack.isEmpty());
    }
}
class ImpleStack{
    int[] arr = new int[10000];
    int top = -1;

    public void push (int x){
        top++;
        arr[top] = x;
    }

    public String pop(){
        if(top >=0){
        int x = arr[top];
        top--;
        return x+"";}
        else{
            System.out.println("Stack is empty");
        }
        return "";
    }

    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        if(top == -1) return true;
        else return false;
    }

    public int size(){
        return top +1;
    }

}