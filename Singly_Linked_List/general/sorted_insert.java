package Linked_List.Singly_Linked_List.general;


import java.util.Scanner;

class Node8
{
    int data;Node8 next;
    Node8(int x)
    {
        data=x;
        next=null;
    }
}
class insertionn
{
    Node8 insert(int x, Node8 head)
    {
           Node8 temp=new Node8(x);
           Node8 curr=head;
           if(head==null)
           {
               return temp;
           }
           if(x<head.data)
           {
               temp.next=head;
               return temp;
           }
           while(curr.next!=null && curr.next.data<x)
           {
               curr=curr.next;
           }

           temp.next=curr.next;
           curr.next=temp;
           return head;
    }

    void printlist(Node8 head)
    {
        Node8 curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

}



public class sorted_insert {
    public static void main(String[] args) {
        /*
        example-> input=10,20,30,40,50
        x=25
        output=10,20,25,30,40,50
         */
        Node8 head=new Node8(10);
        head.next=new Node8(20);
        head.next.next=new Node8(30);
        head.next.next.next=new Node8(40);
        head.next.next.next.next=new Node8(60);
        head.next.next.next.next.next=new Node8(70);



        System.out.println("enter data to be inserted");
        Scanner ob=new Scanner(System.in);
        int insert=ob.nextInt();

        insertionn obj=new insertionn();
        head=obj.insert(insert,head);

        obj.printlist(head);



    }
}
