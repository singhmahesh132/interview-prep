package Collection;

public class BinaryTree {
    Node root;
    public static class Node{
        int number;
        Node right;
        Node left;
    }

    public void add(int number){
        if(this.root == null){
            Node newNode = new Node();
            newNode.number = number;
            this.root = newNode;
        }else {
            Node node = this.root;
            while (true) {
                if (number < node.number) {
                    if (node.left != null)
                        node = node.left;
                    else
                        break;
                }
                else if (number > node.number) {
                    if (node.right != null)
                        node = node.right;
                    else
                        break;
                }
                else {
                    return;
                }
            }
            Node newNode = new Node();
            newNode.number = number;
            if(newNode.number < node.number) {
                node.left = newNode;
            } else{
                node.right = newNode;
            }
        }

    }


    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(1);
        tree.add(3);
    }
}
