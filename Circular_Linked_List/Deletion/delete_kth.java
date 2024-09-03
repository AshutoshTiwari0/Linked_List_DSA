package Linked_List.Circular_Linked_List.Deletion;

import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;
    Node3 prev;

    Node3(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

class delete_kth_circular {
    Node3 del_kth(Node3 head, int k) {
        if (head == null) {
            return head;
        }
        if (k == 1) {
            return del_head(head);
        }

        Node3 curr = head;
        int count = 1;
        while (count < k - 1 && curr.next != head) {
            curr = curr.next;
            count++;
        }

        if (curr.next == head) {
            // If k is greater than the number of nodes, do nothing or handle as needed
            System.out.println("k is greater than the number of nodes.");
            return head;
        }

        Node3 nextNode = curr.next.next;
        curr.next = nextNode;
        if (nextNode != head) {
            nextNode.prev = curr;
        }

        return head;
    }

    Node3 del_head(Node3 head) {
        if (head == null || head.next == head) {
            return null;
        }

        head.data = head.next.data;
        head.next = head.next.next;
        head.next.prev = head; // Correctly set the prev reference

        return head;
    }

    void print(Node3 head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node3 curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);
    }
}

public class delete_kth {
    public static void main(String[] args) {
        Node3 head = new Node3(10);
        head.next = new Node3(20);
        head.next.next = new Node3(30);
        head.next.next.next = new Node3(40);

        // making it circular
        head.next.next.next.next = head;
        head.prev = head.next.next.next; // Correctly set the prev reference for the first node
        head.next.prev = head;
        head.next.next.prev = head.next;
        head.next.next.next.prev = head.next.next;

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter value of K");
        int k = ob.nextInt();
        delete_kth_circular obj = new delete_kth_circular();
        head = obj.del_kth(head, k);

        obj.print(head);
    }
}
