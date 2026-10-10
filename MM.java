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
       Node currNode = head;
       int index = 0;

       while(currNode != null) {
        if(currNode.data == data) {
            System.out.println("Index of" + data + "is" + index);
            return;
        }
        currNode = currNode.next;
        index++;
       }
       System.out.println(data + "not" + "found");
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
        list.printIndex(7);

    } 
}