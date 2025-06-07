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

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 6);
        root = insert(root, 1);
        root = insert(root, 4);
        root = insert(root, 8);
        root = insert(root, 10);
        root = insert(root, 12);
        root = insert(root, 10);
        root = insert(root, 12);
        inorder(root);
    }
}
