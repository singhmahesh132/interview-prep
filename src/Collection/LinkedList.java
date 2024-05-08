package src.Collection;

public class LinkedList {

    public Node head;
    public static class Node{
        public int number;
        public Node nextNode;
    }

    public void add(int number){
        Node newNode = new Node();
        newNode.number = number;
        if(head == null){
            head = newNode;
        }else{
            Node node = head;
            while(node.nextNode != null){
                node = node.nextNode;
            }
            node.nextNode = newNode;
        }
    }

    public void remove(int index){
        Node node = head;
        if(node != null) {
            if (index == 0) {
                head = node.nextNode;
            } else {
                while (index != 1) {
                    node = node.nextNode;
                    index--;
                }
                if(node!=null)
                    node.nextNode = node.nextNode.nextNode;
                else
                    System.out.println("ArrayIndexOutOfBoundsException");
            }
        } else {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    public void printList(){
        if(head!=null){
            Node node = head;
            while(node != null){
                System.out.println(node.number);
                node = node.nextNode;
            }
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.remove(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.printList();
        list.remove(4);
        list.add(5);
        list.printList();
    }
}
