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
            head=newnode;
        }
        head.right=newnode;
        head=newnode;
    }
    
    public void addLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        head.right=newnode;
        head=newnode;
    }
    
    public void print(){
        Node curnode=head;
        System.out.print("Null");
        while(curnode.right!=null){
            System.out.print(curnode.data+" -> ");
            curnode=curnode.right;
        } 
    }

    public static void main(String[] args) {
        DoublyLinkList dl=new DoublyLinkList();
        dl.addfirst(10);
    }
}
