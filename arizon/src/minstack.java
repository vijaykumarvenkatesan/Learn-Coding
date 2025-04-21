import java.util.*;

class MinstackImp{
    Stack<Integer> mainstack;
    Stack<Integer> minStack;

     MinstackImp(){
        mainstack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x){
         mainstack.push(x);

         if(minStack.isEmpty() || minStack.peek() > x){
             minStack.push(x);
         }
    }

    public int pop(){
         if(mainstack.isEmpty()){
             System.out.println("Stack is empty");
             return Integer.MIN_VALUE;
         }
         int poped = mainstack.pop();
         if(poped == minStack.peek()){
             minStack.pop();
         }
         return poped;
    }

    public int getMin(){
         return minStack.peek();
    }
    public int top(){
         return minStack.peek();
    }
}

public class minstack {
    public static void main(String[] args) {
        MinstackImp stack = new MinstackImp();
        stack.push(5);
        assert stack.getMin()==5 :"Test case 1 failed";
        stack.push(3);
        assert stack.getMin() == 3 : "Test 2 Failed";

        // Test 3: Push greater number
        stack.push(7);
        assert stack.getMin() == 3 : "Test 3 Failed";

        // Test 4: Push new minimum
        stack.push(2);
        assert stack.getMin() == 2 : "Test 4 Failed";

        // Test 5: Pop and check min updates
        stack.pop(); // pops 2
        assert stack.getMin() == 3 : "Test 5 Failed";

        // Test 6: Pop again
        stack.pop(); // pops 7
        assert stack.top() == 3 : "Test 6 Failed";
        assert stack.getMin() == 3 : "Test 6 Failed";

        // Test 7: Push duplicate minimum
        stack.push(3);
        assert stack.getMin() == 3 : "Test 7 Failed";

        // Test 8: Pop one instance of duplicate min
        stack.pop(); // pops 3
        assert stack.getMin() == 3 : "Test 8 Failed";

        // Test 9: Pop second instance of min
        stack.pop(); // pops 3
        assert stack.getMin() == 5 : "Test 9 Failed";

        // Test 10: Pop last element
        stack.pop(); // pops 5

    }

}
