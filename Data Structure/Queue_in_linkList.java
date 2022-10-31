import java.util.*;
public class Queue_in_linkList {
    static Scanner in =new Scanner(System.in);
    public static Node head;
    class Node {
        int data;
        Node next;
        Node(int data ){
            this.data=data;
            this.next=null;
     }   
    }
    public void enqeue(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void dequeue(){
            if(head==null){
                System.out.print("\tList is Empty....");
                return;
            }
            Node curnode=head;
            Node delnode=head;
            while(curnode.next!=null){
                delnode=curnode;
                curnode=curnode.next;
            }
            delnode.next=null;
            System.out.println("dequeued...");
        }
    public void display(){
        if(head==null){
            System.out.println("\n\tQueue is empty To Display...");return;
        }
        Node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+" -> ");
            curnode=curnode.next;
        }
    }
    public static void main(String[] args) {
        Queue_in_linkList Qll=new Queue_in_linkList();
        while(true){
            System.out.print("1.Enqueue\n2.Dequeue\n3.Display\nEnter your Choice :");
            int choice =in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("enter the data to push : ");
                    int data=in.nextInt();
                    Qll.enqeue(data);
                    break;
                case 2:
                    Qll.dequeue();
                    break;
                case 3:
                    Qll.display();
                    break;
                default:
                System.out.println("Program Exited...");
                System.exit(0);
           }
        }
    }
}
