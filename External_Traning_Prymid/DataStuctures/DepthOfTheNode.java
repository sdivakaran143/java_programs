import java.util.Scanner;

public class DepthOfTheNode {
    static Scanner in = new Scanner(System.in);
    Node root;
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
    public int add(int data){
        Node newnode=new Node(data);
        int count=0;
        if(root==null){
            root=newnode;
        }else{
            Node temp=root;
            while(true){
                count++;
                if(temp.data>newnode.data){
                    if(temp.left==null){
                        temp.left=newnode;
                        break;
                    }
                    temp=temp.left;
                }else{
                    if(temp.right==null){
                        temp.right=newnode;
                        break;
                    }
                temp=temp.right;
                }
            }
        }
        return count;
    }
     public static void main(String[] args) {
        int n=in.nextInt();
        while(n-->0){
            DepthOfTheNode tree=new DepthOfTheNode();
            int x=in.nextInt();
            while(x-->0){
                System.out.print(tree.add(in.nextInt())+" ");
            }
            System.out.println();
       }
    }
}
