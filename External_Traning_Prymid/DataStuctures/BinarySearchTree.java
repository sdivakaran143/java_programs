import java.util.*;
public class BinarySearchTree {
    static Scanner in =new Scanner(System.in);
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public void add(int data){
        Node newnode=new Node(data);
        if(root==null){
            root=newnode;
        }else{
            Node temp=root;
            while(true){
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
    }
    public void preOrderTraversal(Node tempnode){
        if(tempnode!=null){
            System.out.print(tempnode.data+" ");
            preOrderTraversal(tempnode.left);
            preOrderTraversal(tempnode.right);
        }
    }
    public void InOrderTraversal(Node tempnode){
        if(tempnode!=null){
            InOrderTraversal(tempnode.left);
            System.out.print(tempnode.data+" ");
            InOrderTraversal(tempnode.right);
        }
    }
    public void PostOrderTraversal(Node tempnode){
        if(tempnode!=null){
            PostOrderTraversal(tempnode.left);
            PostOrderTraversal(tempnode.right);
            System.out.print(tempnode.data+" ");
        }
    }
    public static void main(String[] args) {
        int s=in.nextInt();
        while(s-->0){
            BinarySearchTree tree=new BinarySearchTree();
            int n=in.nextInt();
            while (n-->0) {
                int a =in.nextInt();
                tree.add(a);
            }
            tree.preOrderTraversal(tree.root);
            System.out.println();
            tree.InOrderTraversal(tree.root);
            System.out.println();
            tree.PostOrderTraversal(tree.root);
            System.out.println("\n");
        }
    }
}
