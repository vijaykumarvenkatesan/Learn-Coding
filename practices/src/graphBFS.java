import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graphBFS {
    int vertex;
    List<List<Integer>> ll;
    graphBFS(int v){
        this.vertex = v;
        ll =new ArrayList<>();
        for(int i =0; i<v;i++){
            ll.add(new ArrayList<>());
        }
    }
    void addEdge(int i, int j){
        ll.get(i).add(j);
        ll.get(j).add(i);
    }
    void bfs(int start){
        boolean[] visted = new boolean[vertex];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visted[start] = true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            System.out.print(curr+" ");
            for(int neigh:ll.get(curr)){
                if(!visted[neigh]){
                    queue.add(neigh);
                    visted[neigh] =true;
                }
            }
        }

    }

    public static void main(String[] args) {
        graphBFS a = new graphBFS(7);
        a.addEdge(0,1);
        a.addEdge(1,2);
        a.addEdge(1,3);
        a.addEdge(1,4);
        a.addEdge(2,5);
        a.addEdge(2,6);
        a.bfs(0);
    }
}
