
    public class queueUsingArray {
        int start;
        int end;
        int[] q;
        int size;
        int cur_size;
        queueUsingArray(){
            start = end = -1;
            size =4;
            q = new int[size];
            cur_size =0;
        }

        public void push(int val){
            if(cur_size == size) throw new RuntimeException("The queue is full");
            if(start == -1){
                start = end = 0;
            }
            else{
                end++;
            }
            q[end] = val;
            cur_size +=1;
        }
        public int pop(){
            if(cur_size == 0) throw new RuntimeException("The queue is empty");
            int el = q[start];
            if(cur_size == 1){
                start = end = -1;
            }
            else{
                start = (start+1)%size;
            }
            cur_size--;
            return el;
        }

        public int size(){
            return cur_size;
        }
        public int top(){
            if(cur_size == 0) throw new RuntimeException("The queue is empty");
            return q[start];
        }
    }
