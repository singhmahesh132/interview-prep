package src.Collection;

public class BinarySearchTree {
    public class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insertValue(int value){
        root = insertValueInNewNode(root,value);
    }

   private Node insertValueInNewNode(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.value < value){
            insertValueInNewNode(root.left, value);
        }
        if (root.value > value) {
            insertValueInNewNode(root.right, value);
        }
        return root;
    }

    public void inOrderTraversal(Node root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.println(root.value);
            inOrderTraversal(root.right);
        }
    }
}
