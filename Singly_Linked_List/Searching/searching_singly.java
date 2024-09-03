package Linked_List.Singly_Linked_List.Searching;
import java.util.*;
class Node9
{
    Node9 next;
    int data;
    Node9(int x)
    {
        data=x;
        next=null;
    }
}
class searching
{
    /*
    //iterative solution
    void search(int x, Node9 head)
    {
        int pos=1;
        Node9 curr=head;
        while(curr!=null) {
            if (curr.data == x) {
                System.out.println("found at position "+pos);
                return;
            } else {
                curr = curr.next;
                pos++;
            }
        }
        System.out.println("not found");
    }
    */

     // Recursive Solution
     void search(int x, Node9 head) {
         if (head == null) {
             System.out.println("not found");
             return;
         }
         if (head.data == x) {
             System.out.println("found");
         } else {
             head = head.next;
             search(x, head);
         }
     }
}


public class searching_singly {
    public static void main(String[] args) {
       Node9 obj1=new Node9(10);
       Node9 obj2=new Node9(5);
       Node9 obj3=new Node9(20);
       Node9 obj4=new Node9(15);
       Node9 obj5=new Node9(120);
       Node9 obj6=new Node9(115);

       obj1.next=obj2;
       obj2.next=obj3;
       obj3.next=obj4;
       obj4.next=obj5;
       obj5.next=obj6;


       Scanner ob=new Scanner(System.in);
       System.out.println("enter search number");
       int search=ob.nextInt();
       searching obj=new searching();
       obj.search(search, obj1);
    }
}
