
package Linked_List.Doubly_Linked_List.insertion;
import java.util.Scanner;
class Node3
{
    int data;
    Node3 prev;
    Node3 next;
    Node3(int d)
    {
        data=d;
        prev=null;
        next=null;
    }

}
class Insertion_end {
    Node3 insert_end(Node3 head, int data) {
        Node3 temp = new Node3(data);
        if(head==null)
        {
            return temp;
        }
        Node3 curr=head;
            while(curr.next!=null)
            {
                curr=curr.next;

            }
            curr.next=temp;
            temp.prev=curr;
            return head;
    }
}

public class insert_at_end {
    public static void main(String[] args) {
        Node3 head = new Node3(5);
        Node3 temp1 = new Node3(10);
        Node3 temp2 = new Node3(20);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        Insertion_end obj = new Insertion_end();

        Scanner ob = new Scanner(System.in);
        int value = ob.nextInt();

        head = obj.insert_end(head, value);


        printList(head);
    }

    static void printList(Node3 head) {
        Node3 curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;

        }
    }
}

