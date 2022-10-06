class Node{
    int key;
    Node left;
    Node right;

    public Node(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    public void InOrderTraversal(Node root){
        if(root == null){
            return;
        }

        InOrderTraversal(root.left);

        System.out.print(root.key + " ");

        InOrderTraversal(root.right);
    }

    public void PreOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.key + " ");

        PreOrderTraversal(root.left);

        PreOrderTraversal(root.right);
    }

    public void PostOrderTraversal(Node root){
        if(root == null){
            return;
        }

        PostOrderTraversal(root.left);

        PostOrderTraversal(root.right);

        System.out.print(root.key + " ");
    }
}

public class TreeTraversals {
    public static void main(String[] args) {
        Node root = new Node(3);

        root.left = new Node(2);

        root.left.left = new Node(1);

        root.right = new Node(4);

        root.right.right = new Node(5);

        /*
        
                3
               / \
              2   4
             /     \
             1      5
        */

        BinaryTree bt = new BinaryTree();

        System.out.print("InOrderTraversal of the Binary Tree : ");

        bt.InOrderTraversal(root);

        System.out.println("");

        System.out.print("PreOrderTraversal of the Binary Tree : ");

        bt.PreOrderTraversal(root);

        System.out.println("");

        System.out.print("PostOrderTraversal of the Binary Tree : ");

        bt.PostOrderTraversal(root);

        System.out.println("");
    }
}
