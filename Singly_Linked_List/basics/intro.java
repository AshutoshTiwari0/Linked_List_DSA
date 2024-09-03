package Linked_List.Singly_Linked_List.basics;

class Node1
{
    int data;
    Node1 next;
    Node1(int x)
    {
        data=x;
        next=null;
    }
}
public class intro {
    public static void main(String[] args) {
    Node1 head=new Node1(10);
    Node1 temp1=new Node1(20);
    Node1 temp2= new Node1(30);

    head.next=temp1;
    temp1.next=temp2;
    }
}
