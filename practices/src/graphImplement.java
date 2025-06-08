import java.util.*;

public class graphImplement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        amm a = new amm(v);
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
class AM{
    int vertex;
   static int[][] matrix;
    AM(int v){
        this.vertex = v;
        matrix = new int[v][v];
    }
   static void addEdge(int i, int j){
        matrix[i][j] = 1;
        matrix[j][i] = 1;
     }
     static void removeEdge(int i, int j){
        matrix[i][j] = 0;
        matrix[j][i] = 0;
     }
     static void print(){
         for (int[] ints : matrix) {
             for (int j = 0; j < matrix.length; j++) {
                 System.out.print(ints[j] + " ");
             }
             System.out.println();
         }
     }

}