package Linked_List.Circular_Linked_List.insertion;
import java.util.Scanner;

class Node3
{
    Node3 next;int d;
    Node3(int data)
    {
        d=data;
        next=null;
    }

}


class insertion {
    /*Node3 insert(Node3 head, int x) {
              Naive Solution
        //make a node for x
        Node3 temp = new Node3(x);

        if (head == null) {
            temp.next=temp;
            return temp;
        } else {
            Node3 curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;

            return temp;
        }
        */

        // optimised solution-> insert after first node and then swap data of first and second
        /*
        Example
        input list= 10->20->30
        x=15
        10->15->20->30  inserted after 10
        now swap first and second nodes data
        15->10->20->30
         */
        Node3 insert(Node3 head, int x)
        {
            //making a node for our data to be inserted
        Node3 temp=new Node3(x);
        if(head==null)
        {
            temp.next=temp;
            return temp;
        }
        else
        {
            temp.next=head.next;
            head.next=temp;


            //swap data of temp and temp
            int t=head.d;
            head.d=temp.d;
            temp.d=t;
        }
return head;
        }

    void print(Node3 head) {
        if (head == null) {
            return;
        }
        //explicitly printed head
        System.out.print(head.d + " ");

        for (Node3 i = head.next; i != head; i = i.next) {
            System.out.print(i.d + " "); //printing rest data other than head.
        }
    }
}

    public class insert_begin {
        public static void main(String[] args) {
            Node3 head = new Node3(10);
            head.next = new Node3(20);
            head.next.next = new Node3(30);
            head.next.next.next = new Node3(40);

            head.next.next.next.next = head;

            System.out.println("enter data to be inserted");
            Scanner ob = new Scanner(System.in);
            int x = ob.nextInt();


            insertion obj = new insertion();
            head=obj.insert(head, x);

            obj.print(head);
        }
    }

