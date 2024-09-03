package Linked_List.Singly_Linked_List.general;


import java.util.Scanner;

class Node10
{
    int data;Node10 next;
    Node10(int x)
    {
        data=x;
        next=null;
    }
}
/*
class naive
{
    Node10 solution(Node10 head)
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(Node10 curr=head;curr!=null;curr=curr.next)
        {
            arr.add(curr.data);
        }
        for(Node10 curr=head;curr!=null;curr=curr.next)
        {
            curr.data=arr.remove(arr.size()-1);
        }
        return head;
        }
}
*/
/*
class optimised
{
    Node10 solution(Node10 head)
    {
        Node10 curr=head;
        Node10 prev=null;
        while(curr!=null)
        {
            Node10 next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
/*

*/
/*
//reversing recursively method 1
class naive
{
    Node10 solution(Node10 head)
    {
         if(head==null || head.next==null) {
             return head;
         }
         Node10 rest_head=solution(head.next);
         Node10 rest_tail=head.next;
         rest_tail.next=head;
         head.next=null;
         return rest_head;

    }
}
*/
//reversing recursively method 2
class naive
{
    Node10 solution(Node10 curr, Node10 prev)
    {
         if(curr==null)
         {
            return prev;
         }
         Node10 next=curr.next;
         curr.next=prev;
         return solution(next,curr);
         }
}
public class reverse {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        Node10 head=new Node10(10);
        head.next=new Node10(20);
        head.next.next=new Node10(30);
        head.next.next.next=new Node10(40);


       // naive obj=new naive();
       // optimised obj=new optimised();

        naive obj=new naive();
        Node10 curr=obj.solution(head,null);
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
