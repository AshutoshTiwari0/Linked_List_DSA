package Linked_List.Singly_Linked_List.loops;

import java.util.HashSet;

class Node
{   int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }

}
class hashingmethod
{
    boolean implementation(Node head)
    {
        HashSet<Node> lookup=new HashSet<Node>();
        for(Node curr=head;curr!=null; curr=curr.next)
        {
            if(lookup.contains(curr))
            {
                return true;
            }
            else
            {
                lookup.add(curr);
            }
        }
        return false;
    }
}
public class method1 {
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);


        head.next.next.next.next=head.next.next;

        hashingmethod obj=new hashingmethod();
        boolean ans=obj.implementation(head);
        System.out.println(ans);
    }
}
