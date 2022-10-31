import java.util.*;
public class Stack_in_linkedList {
    public static Node head;
    static Scanner in =new Scanner(System.in);
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            System.out.println("\n\tdata Added .... \n");
            return;
        }
        newnode.next=head;
        head=newnode;
        System.out.println("\n\tdata Added .... \n");

    }
    public void pop(){
        if(head==null){
            System.out.println("\n\tStack is Empty To pop... ");;return;
        }
        Node curnode =head;
        Node Subnode=curnode.next;
        curnode.next=null;
        head=Subnode;
        System.out.println("\n\tdata Removed .... \n");

    }
    public void display(){
        if(head==null){
            System.out.println("\n\tStack is empty To Display...");return;
        }
        Node curnode=head;
        while(curnode!=null){
            System.out.println("\t| "+curnode.data+" |");
            curnode=curnode.next;
        }
         System.out.println("\t ---");
    }
    public static void main(String[] args) {
        Stack_in_linkedList Sll=new Stack_in_linkedList();
        while(true){
        System.out.print("1.push\n2.Pop\n3.Display\nEnter your Choice :");
        int choice =in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("enter the data to push : ");
                int data=in.nextInt();
                Sll.push(data);
                break;
            case 2:
                Sll.pop();
                break;
            case 3:
                Sll.display();
            default:
            System.out.println("Program Exited...");
            System.exit(0);
        }
        }
    }

}
