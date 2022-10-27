public class linklist {
     Node head;
     private int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        head.next=head;
        head=newnode;
    }
    public void addlast(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curnode=head;
        while(curnode.next!=null){
            curnode=curnode.next;
        }
        curnode.next=newnode;
    }
    public void print(){
        if(head==null){
            System.out.println("List is Empty.....");
        }
        Node curnode=head;
        while(curnode.next!=null){
            System.out.print(curnode.data+"--->");
            curnode=curnode.next;
        }
        System.out.println("NUll ... .");
    }
    public static void main(String[] args) {
        linklist list=new linklist();
        list.addfirst(1);
        list.addlast(2);        
        list.addfirst(3);
        list.print();
    }
}
