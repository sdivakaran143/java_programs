import java.util.*;
import java.util.LinkedList;

public class LevelOrderTraversal {
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
    void levelOrderTraversal(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            for (int i = 0; i < n; i++) {
                Node temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        int n=in.nextInt();
        LevelOrderTraversal tree=new LevelOrderTraversal();
        while(n-->0){
            tree.root=null;
            int x=in.nextInt();
            while(x-->0){
                tree.add(in.nextInt());
            }
            tree.levelOrderTraversal();
       }
    }
}
