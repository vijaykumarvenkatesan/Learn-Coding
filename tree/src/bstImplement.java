class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        left = right = null;
        this.data = data;
    }
}
public class bstImplement {
    static int sum =0;
    static Node insert(Node root, int val){
        if(root == null) return new Node(val);

        else if(root.data == val) return root;
        else if(root.data > val){
            root.left = insert(root.left, val);
        }
        else root.right = insert(root.right, val);
        return root;
    }
    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static boolean targetSum(Node root, int target){
        if(root ==null) return false;
        int newSum = target - root.data;
        if(root.left == null && root.right == null ){
            return newSum == 0;
        }
        return targetSum(root.left,newSum) || targetSum(root.right,newSum);
    }
    static boolean checkMirror(Node root){
        return false;
    }

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 10);
        root = insert(root, 9);
        root = insert(root, 8);
        root = insert(root, 12);
        root = insert(root, 24);
//        root = insert(root, 12);
//        root = insert(root, 12);
//        root = insert(root, 10);
//        inorder(root);
        System.out.print(targetSum(root,27));
    }
}
