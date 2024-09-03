package Linked_List.Singly_Linked_List.loops;


class Node3
{
    Node3 next;
    int data;
    Node3(int x) {
        data = x;
        next = null;
    }
}
class detection_and_removal
{Node3 slow,fast;
    boolean func(Node3 head)
    {
         slow=head;fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
    void removal(Node3 head)
    {
        slow=head;
        while(slow.next!=fast.next)
        {
            slow=slow.next;
            fast=fast.next;
        }
    fast.next=null;
    }
    void print(Node3 head)
    {
        for(Node3 curr=head;curr!=null;curr=curr.next)
        {
            System.out.println(curr.data);
        }
    }
}
/*
ALGORITHM->
STEP1- DETECT LOOP USING FLOYD'S ALGORITHM.
STEP2-> AFTER DETECTION OF LOOP, MOVE SLOW TO HEAD AND FAST(WHERE EVER IT WAS WHILE FINDING THE LOOP AND MOVE BOTH THE POINTERS AT SAME SPEED ONE AT A TIME.
STEP3->AT WHICH EVER POINT SLOW AND FAST MEET THAT POINT IS THE STARTING POINT OF CYCLE.
 */
public class loop_detection_and_removal {
    public static void main(String[] args) {
        Node3 head=new Node3(10);
        head.next=new Node3(15);
        head.next.next=new Node3(5);
        head.next.next.next=new Node3(20);

        //adding a loop
        head.next.next.next=head.next;

        detection_and_removal obj=new detection_and_removal();
        boolean ans=obj.func(head);
        if(ans==true)
        {
            obj.removal(head);
        }
        obj.print(head);


    }
}
