import java.net.Authenticator.RequestorType;
import java.rmi.server.RemoteStub;
import java.util.*;

import javax.print.DocFlavor.READER;
public class linkedlist {
    static Scanner in=new Scanner(System.in);
   public node head;
    public static class node{
      int data;
      node next;
      public node(int data)
      {
        this.data=data;
        this.next=null;
      }
    }
    public void addfirst(int data){
       node newnode=new node(data);
       if(head==null){
            head=newnode;
            return;
       }
       newnode.next=head;
       head=newnode;
    }
    public void addlast(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;
        }
        curnode.next=newnode;
     }
    public void print(){
        node curnode=head;
        while(curnode!=null){
            System.out.print(curnode.data+" -> ");
            curnode=curnode.next;
        }
        System.out.print("Null");
    }
    public void addMiddle(int data){
        node newnode=new node(data);
        System.out.print("ENter the position to insert the node : ");
        int pos =in.nextInt();
        if(head==null){
             System.out.println("Head is empty....");
             return;
         }
        if(pos==1){
            addfirst(data);
            return;
        }
        int count=1;
        node curnode=head;
        try{while(count<pos-1){
            curnode=curnode.next;
            count++;
        }}catch(Exception e){System.out.println("Invalid index...");return;}
        node subnode =curnode.next;
        curnode.next=newnode;
        newnode.next=subnode;
    }
    public void deletelast(){
        
        if(head==null){
            System.out.print("\tList is Empty....");
            return;
        }
        node curnode=head;
        node delnode=head;
        while(curnode.next!=null){
            delnode=curnode;
            curnode=curnode.next;
        }
        delnode.next=null;
    }
    public void deletefirst(){
        if(head==null){
            System.out.print("\tList is Empty....");
            return;
        }
        node curnode=head;
        node subnode=curnode.next;
        head=subnode;
    }
    public void deleteMiddle(){
        if(head==null){
            System.out.print("\tList is Empty....");
            return;
        }
        System.out.print("\nEnter the position to delete : ");
        int pos =in.nextInt();
        if(pos==1){
            deletefirst();return;
        }
        int count=1;
        node curnode=head;
        while (count<pos-1) {
            curnode=curnode.next;    
            count++;
        }
        node delnode=curnode.next;
        curnode.next=delnode.next;
    }
    public void search(){
        if(head==null){
            System.out.print("\tList is Empty....");
            return;
        }
        node curnode=head;
        System.out.print("Enter the value to search : ");
        int val=in.nextInt();
        int position=1;

        while(curnode.next!=null){
            if(val==curnode.data){
                System.out.println("the value "+val+" found at Position "+position );return;
            }position++;
            curnode=curnode.next;
        }
        if(val==curnode.data){
            System.out.println("the value "+val+" found at Position "+(position+1));return;
        }
        System.out.println("The value "+val+" is not Found on thr list");
    }   
    public void modifyval(int data){
        System.out.print("Enter the position to modify  : ");
        int pos=in.nextInt();
        node curnode=head;
        int count =1;
        while(curnode.next!=null){
           if(count==pos){
            curnode.data=data;
            return;
           }
           curnode=curnode.next;
           count++;
        }
        if(count==pos){
            curnode.data=data;
            return;
        }
        System.out.println("Invalid Positiion....");
       
    } 

    public static void main(String[] args) {
        linkedlist li=new linkedlist();
       while(true){
       System.out.print("\n1.ADD FIRST\n2.ADD LAST\n3.ADD MIDDLE\n4.DELETE FIRST\n5.DELETE LAST\n6.DELETE MIDLE\n7.DELETE SEARCH\n8.MODIFY VALUE\n9.DISPLAY THE LIST\nEnter option : ");
       int choice =in.nextInt();
       switch (choice) {
        case 1:
            li.addfirst(1);break;
        case 2:
            li.addlast(0);break;
        case 3:
            li.addMiddle(2);break;
        case 4:
            li.deletefirst();break;
        case 5:
            li.deletelast();break;
        case 6:
            li.deleteMiddle();break;
        case 7:
            li.search();break;
        case 8:
            li.modifyval(10); break;
        case 9:
            li.print(); break;
        default:
            System.exit(0);
            break;
       }
       li.print();
    } 
    }
}

