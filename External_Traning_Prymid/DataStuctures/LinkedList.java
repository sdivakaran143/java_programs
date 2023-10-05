import java.util.*;
public class LinkedList {
    static Scanner in =new Scanner(System.in);
    Node Head; 
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void addfirst(int data){
        Node newnode=new Node(data);
        if(Head==null){
            Head=newnode;
            return;
        }
        newnode.next=Head;
        Head=newnode;
    }
    public void addLast(int data){
        Node newnode=new Node(data);
        if(Head==null){
            Head=newnode;
            return;
        }
        Node curnode =Head;
        while(curnode.next!=null)
            curnode=curnode.next;

        curnode.next=newnode;
    }
    public void removeFirst(){
        if(Head==null){
            System.out.println("List Empty");
            return;
        }else if(Head.next==null){
            Head=null;
        }else
            Head=Head.next;
        System.out.print("Successfully removed");
    }
    public void removeLast(){
        Node curnode =Head;
        if(Head==null){
            System.out.println("List Empty");
            return;
        }else if(curnode.next==null){
            Head=null;
        }else{
            while(curnode.next.next!=null)
                curnode=curnode.next;
            curnode.next=null;
        }
        System.out.print("Successfully removed");
    }
    public void print(){
        Node curnode=Head;
        while(curnode!=null){
            System.out.print(curnode.data+" -> ");
            curnode=curnode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LinkedList li =new LinkedList();
        while(true){
            System.out.println("\n1 > InsertFirst\n2 > InsertLast\n3 > removeFirst  \n4 > removeLast   \n9 > Print\n0 > exit\n");
            int i =in.nextInt();
            switch(i){
                case 1:
                    System.out.print("enter the value to be insertFirst: ");
                    li.addfirst(in.nextInt());
                    break;
                case 2:
                    System.out.print("enter the value to be insertlast: ");
                    li.addLast(in.nextInt());
                    break;
                case 3:
                    li.removeFirst();
                    break;
                case 4:
                    li.removeLast();
                    break;
                case 9:
                    li.print();
                    break;                        
                case 0:
                    System.exit(0);
                    break;
            }

        }
    }
}
