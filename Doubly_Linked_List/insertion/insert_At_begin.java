package Linked_List.Doubly_Linked_List.insertion;
import java.util.Scanner;
class Node2
{
    int data;
    Node2 prev;
    Node2 next;
    Node2(int d)
    {
        data=d;
        prev=null;
        next=null;
    }

}
class Insertion {
    Node2 insert_at_begin(Node2 head, int data) {
        Node2 temp = new Node2(data);

        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

}

    public class insert_At_begin {
        public static void main(String[] args) {
            Node2 head = new Node2(5);
            Node2 temp1 = new Node2(10);
            Node2 temp2 = new Node2(20);

            head.next = temp1;
            temp1.prev = head;
            temp1.next = temp2;
            temp2.prev = temp1;

            Insertion obj = new Insertion();

            Scanner ob = new Scanner(System.in);
            int value = ob.nextInt();

            head = obj.insert_at_begin(head, value);


            printList(head);
        }

        static void printList(Node2 head) {
            Node2 curr = head;
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;

            }
        }
    }

