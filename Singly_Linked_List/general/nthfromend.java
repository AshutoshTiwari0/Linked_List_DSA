package Linked_List.Singly_Linked_List.general;
import java.util.Scanner;

class Node9
{
    int data;Node9 next;
    Node9(int x)
    {
        next=null;
        data=x;
    }
}

class solution
{
    void nthend(Node9 head, int n)
    {
        /*
        //method 1 get whole length
        //nth node from end= (length-n+1)
        Node9 curr=head;
        int c=0;
        while(curr!=null)
        {
            c++;
            curr=curr.next;
        }
        int k=0;
        Node9 newcurr=head;
        while(k!=(c-n))
        {
           newcurr=newcurr.next;
           k++;
        }
        return newcurr.data;
        */

        //method2

        if(head==null)
        {
            return;
        }
        Node9 first=head;
    for(int i=0;i<n;i++)
    {
    if(first==null)
    {
        return;
    }
    first=first.next;
}
Node9 second=head;
    while(first!=null)
    {
        second=second.next;
        first=first.next;
    }
        System.out.println(second.data);
    }
}
public class nthfromend {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=ob.nextInt();

        Node9 head=new Node9(10);
        head.next=new Node9(20);
        head.next.next=new Node9(30);
        head.next.next.next=new Node9(40);
        head.next.next.next.next=new Node9(50);

        solution obj=new solution();
        obj.nthend(head,n);


    }
}
