package Linked_List.Circular_Linked_List.insertion;

import java.sql.SQLOutput;
import java.util.Scanner;

class Node4
{
    Node4 next;int d;
    Node4 prev;
    Node4(int data)
    {
        d=data;
        next=null;
        prev=null;
    }

}

class insertionend {
   //time-> Theta(n)
    /* Node4 insert_end(Node4 head, int x) {
       if(head==null)
       {
           Node4 newNode = new Node4(x);
           newNode.next = newNode; // Pointing to itself to form a single-node circular list
           return newNode;
       }
        Node4 curr=head.next;
        while(curr.next!=head)
        {
           curr=curr.next;

        }
        Node4 n=new Node4(x);
        curr.next=n;
        n.next=head;


        return head;
    }
*/

    //optimised-> O(1) time
    Node4 insert_end(Node4 head, int x) {
    Node4 temp=new Node4(x);
        if(head==null)
        {
            temp.next=temp;
            return temp;
        }
        else {
            //inserted temp after head
            temp.next=head.next;
            head.next=temp;

            //swap data
            int t=temp.d;
            temp.d=head.d;
            head.d=t;

            return temp;
        }
    }



    void print(Node4 head)
    {
        if (head == null) {
            return;
        }
        //explicitly printed head
        System.out.print(head.d + " ");

        for (Node4 i = head.next; i != head; i = i.next) {
            System.out.print(i.d + " "); //printing rest data other than head.
        }
    }




}


public class insert_end {
    public static void main(String[] args) {
        Node4 head = new Node4(10);
        head.next = new Node4(20);
        head.next.next = new Node4(30);
        head.next.next.next = new Node4(40);

        head.next.next.next.next = head;

        System.out.println("enter data to be inserted at end");
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();


        insertionend obj = new insertionend();
        head=obj.insert_end(head, x);

        obj.print(head);
    }
}


