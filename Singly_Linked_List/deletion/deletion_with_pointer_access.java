package Linked_List.Singly_Linked_List.deletion;


class Node9
{
    int data;
    Node9 next;
    Node9(int x)
    {
        data=x;
        next=null;
    }
}

public class deletion_with_pointer_access {
    public static void main(String[] args) {
        Node9 head = new Node9(10);
        head.next = new Node9(20);
        Node9 ptr = new Node9(30);
        head.next.next = ptr;
        head.next.next.next = new Node9(40);
        head.next.next.next.next = new Node9(50);

        // Delete the node with data 30
        deletion_with_pointer_access.delete(ptr);
    }

    // Method to delete a node when only a pointer/reference to it is provided
    static void delete(Node9 ptr) {
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;
    }
}