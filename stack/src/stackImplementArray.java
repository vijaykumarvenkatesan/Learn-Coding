public class stackImplementArray {
    int[] stack;
    int top;
    stackImplementArray(){
            stack = new int[10];
            top =-1;
    }

    public void push(int val){
        if(top > 10) System.out.println("The stack reached the limit");
        else{
            top++;
            stack[top] = val;
        }
    }

    public int top(){
        if(top == -1) {
            throw new RuntimeException("The stack is empty");
        }
        else {
            return stack[top];
        }
    }

    public int size(){
        return top+1;
    }
    public int pop(){
        if(top == -1) throw new RuntimeException("The stack is empty");
        else{
            top--;
            return stack[top+1];
        }
    }

    public static void main(String[] args) {
        stackImplementArray st = new stackImplementArray();
        st.push(10);
        System.out.println(st.pop());
        st.pop();
    }
}
