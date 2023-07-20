package DataStucture;
import java.util.*;
public class singly_circular_linkedlist {
    static Scanner in=new Scanner(System.in);
    static Node head;
    static Node tail;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=head;
            return;
        }
        tail.next=newnode;
        newnode.next=head;
        head=newnode;
    }
    public static void addlast(int data){
        Node newnode =new Node(data);
        if(head ==null){
            head=newnode; 
        }
        else{
            newnode.next=tail.next;
            tail.next=newnode;
            tail=newnode;   
        }
    }
    public static void printlist(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node curnode =head;
            do{
                System.out.print("->"+curnode.data);
                curnode=curnode.next;
            }while(curnode!=head);
            // System.out.print("->"+curnode.data);
            
        }
    }
    public static void main(String[] args) {
        addfirst(0);
        addfirst(1);
        addfirst(2);
        addfirst(3);
        addfirst(4);
        addlast(-1);
        addlast(-2);
        addlast(-3);
        addlast(-4);
        printlist();
    }
}
