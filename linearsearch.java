public class LinearSearchLinkedList {

    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public static int linearSearch(Node head, int key) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; 

    
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int key = 30;
        int result = linearSearch(head, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the list");
        }
    }
}