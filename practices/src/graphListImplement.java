import java.util.*;

public class graphListImplement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        amm s = new amm(v);
        int e = in.nextInt();

        for(int i =0; i<e;i++){
            System.out.println("Enter the "+(i+1)+"Vertex");
            int x = in.nextInt();
            int y = in.nextInt();
            amm.addEdge(x,y);
        }
//        AM.addEdge(0,1);
//        AM.addEdge(0,2);
//        AM.addEdge(1,2);
//        AM.addEdge(2,3);
        amm.print();

    }
}
class amm {
    int vertex;
    static List<List<Integer>> ll;
    amm(int v){
        this.vertex = v;
        ll = new ArrayList<>();
        for(int i=0; i<v;i++){
            ll.add(new ArrayList<>());
        }
    }
    static void addEdge(int i, int j){
        ll.get(i).add((Integer)j);
        ll.get(j).add((Integer)i);

    }
    static void removeEdge(int i, int j){
        ll.get(i).remove((Integer) j);
        ll.get(j).remove((Integer) i);
    }
    static int ss =0;
    static void print(){
        for (List<Integer> i : ll) {
            System.out.print((ss++)+"th vertex's edges: ");
            for (Integer integer : i) {

                System.out.print(integer+" ");
            }
            System.out.println();
        }
    }

}