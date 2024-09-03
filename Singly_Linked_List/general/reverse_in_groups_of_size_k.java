package Linked_List.Singly_Linked_List.general;

import java.util.Scanner;

class Node12
{
    int data;
    Node12 next;
    Node12(int x)
    {
      data=x;
      next=null;
    }
}
class solutionn
{
    Node12 answer(Node12 head, int k)
    {
        //recursive solution
        /*Node12 curr=head, next=null,prev=null;
        int count=0;
        while(curr!=null && count<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null)
        {
            Node12 rest_head=answer(next,k);
            head.next=rest_head;
        }
        return prev;
        */

         //iterative solution
        Node12 curr=head,prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node12 first=curr,prev=null;
            int count=0;
            while(curr!=null&&count<k){
                Node12 next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(isFirstPass){head=prev;isFirstPass=false;}
            else{prevFirst.next=prev;}
            prevFirst=first;
        }
        return head;

    }
}



public class reverse_in_groups_of_size_k {
    public static void main(String[] args) {
        Node12 head = new Node12(10);
        head.next = new Node12(20);
        head.next.next = new Node12(30);
        head.next.next.next = new Node12(40);
        head.next.next.next.next = new Node12(50);
        head.next.next.next.next.next=new Node12(60);
        solutionn obj=new solutionn();


        System.out.println("enter k");
        Scanner ob=new Scanner(System.in);
        int k=ob.nextInt();

        obj.answer(head,k);
    }
}
