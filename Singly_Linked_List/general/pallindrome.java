package Linked_List.Singly_Linked_List.general;

import java.util.ArrayDeque;
import java.util.Deque;

class Node14
{
    char data;
    Node14 next;
    Node14(char x)
    {
     data=x;
     next=null;
    }
}

class answer
{
    static Node14 reverseList(Node14 head){
        if(head==null||head.next==null)return head;
        Node14 rest_head=reverseList(head.next);
        Node14 rest_tail=head.next;
        rest_tail.next=head;
        head.next=null;
        return rest_head;
    }

    boolean implementation(Node14 head)
    {
        /* Method 1
        Deque<Character> stack=new ArrayDeque<>();

        for(Node14 curr=head;curr!=null;curr=curr.next)
        {
            stack.push(curr.data);
        }
        for(Node14 curr=head;curr!=null;curr=curr.next)
        {
            if(stack.pop()!=curr.data)
            {
                return false;
            }
        }
        return true;
        */
        //Method 2
        /*
        Find middle node
        Reverse node after middle
        compare first half and second half
         */
        if(head==null)
        {
            return true;
        }
        Node14 slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node14 rev=reverseList(slow.next);
        Node14 curr=head;
        while(rev!=null)
        {
            if(rev.data!=curr.data)
            {
                return false;
            }
            rev=rev.next;
            curr=curr.next;
        }
return true;

    }
}

public class pallindrome {
    public static void main(String[] args) {
      Node14 head=new Node14('R');
      head.next=new Node14('A');
      head.next.next=new Node14('D');
      head.next.next.next=new Node14('A');
      head.next.next.next.next=new Node14('R');

      answer obj=new answer();
      boolean ans=obj.implementation(head);
        System.out.println(ans);

    }
}
