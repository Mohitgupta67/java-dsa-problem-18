public class MM {
    Node head;
    public int size;

    MM () {
        size = 0;
    }
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void printIndex(int data) {
        Node newNode = new Node(data);

        if(newNode == 7) {
            System.out.println(this.newNode);
        }
    }
    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
           
        }
        System.out.println("Null");
    }
    public static void main(String args[]) {
        MM list = new MM();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(7);
        list.addFirst(3);
        list.addFirst(8);
        list.addFirst(2);
        list.addFirst(3);
        list.printList();

    } 
}