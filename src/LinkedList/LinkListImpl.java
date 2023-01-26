package LinkedList;
import java.lang.*;

public class LinkListImpl{
    static Node head;
    static private int size;

    public LinkListImpl(){
        this.size=0;
        this.head=null;
    }

    static	class Node{
       private String data;
       private Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public static void addFirst(String data){
        Node nd=new Node(data);

        if(head==null){
            head=nd;
            return ;
        }
        nd.next=head;
        head=nd;
    }

    public static void addLast(String data){
        Node nd=new Node(data);
        if(head==null){
            head=nd;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nd;
    }

    public static void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }

    public static void delFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public static void delLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        Node secLast=head;
        Node last=head.next;

        while(last.next!= null){
            last=last.next;
            secLast=secLast.next;
        }
        secLast.next=null;
    }
    public static int getSize(){
        return size;
    }
    public static void printReverse(){

        if(head==null || head.next ==null){
            return;
        }

        Node prev=head;
        Node curr=head.next;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;

            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;
    }
}