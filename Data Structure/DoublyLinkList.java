import java.util.*;
public class DoublyLinkList {
    static Scanner in =new Scanner(System.in);
    public Node head;
    class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;return;
        }
        newnode.right=head;
        head.left=newnode;
        head=newnode;
    }
    
   
    public void addlast(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;return;
        }
        Node curnode=head;
        while(curnode.right!=null){
          curnode=curnode.right;
        }
        curnode.right=newnode;
        newnode.left=curnode;
    }
    
    public void print(){
        if(head==null){
            System.out.print("List is Empty....");return;
        }
        Node curnode=head;
        System.out.print("Null -> ");
        while(curnode!=null){
            System.out.print(curnode.data+" -> ");
            curnode=curnode.right;
        } 
        System.out.print(" Null");
    }
    public void deletelast(){
        if(head==null){
            System.out.print("List is Empty....");return;
        }
        Node curNode=head;
        while(curNode.right.right!=null){
            curNode=curNode.right;
        }
        curNode.right=null;
    }
    public void deletefirst(){
        Node curNode=head;
        head=curNode.right;
    }

    public static void main(String[] args) {
        DoublyLinkList dll=new DoublyLinkList();
        dll.addfirst(10);
        dll.addlast(20);
        dll.addlast(30);
        dll.addfirst(55);
        dll.addlast(35);
        dll.deletefirst();
        dll.deletefirst();


        dll.print();
    }
}
