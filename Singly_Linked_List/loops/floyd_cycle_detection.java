package Linked_List.Singly_Linked_List.loops;

import java.util.HashSet;

class Node2
{   int data;
    Node2 next;
    Node2(int x)
    {
        data=x;
        next=null;
    }

}
class floydcycledetection {
    boolean implementation(Node2 head) {
        /*
        WORKING
        IT IS BASED ON SLOW FAST POINTER APPROACH
        WE INITIALISE SLOW AND FAST AS HEAD
        SLOW MOVES ONE PLACE AT A TIME AND FAST MOVES TWO PLACE AT A TIME
        IF AT ANY TIME THEY POINT TO SAME NODE THERE IS A LOOP.
         */
        Node2 fast=head,slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
                return true;
            }
        }
        return false;
    }
}
public class floyd_cycle_detection {
    public static void main(String[] args) {
        Node2 head=new Node2(10);
        head.next=new Node2(20);
        head.next.next=new Node2(30);
        head.next.next.next=new Node2(40);


        head.next.next.next.next=head.next.next;

        floydcycledetection obj=new floydcycledetection();
        boolean ans=obj.implementation(head);
        System.out.println(ans);
    } 
}












