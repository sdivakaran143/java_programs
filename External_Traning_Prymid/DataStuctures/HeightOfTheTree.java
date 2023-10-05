import java.util.Scanner;

public class HeightOfTheTree {
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
    Node add(Node temp,int data){
        if(temp==null)
            return new Node(data);
        else{
            if(temp.data>data)
            temp.left=add(temp.left,data);
            else if(temp.data<data){
                temp.right=add(temp.right,data);
            }
        }
        return temp;
    }
    int height(Node temp){
        if(temp==null)
            return -1;
        int l=height(temp.left);
        int r=height(temp.right);
        int max=(l>r)?l:r;
        return max+1;
    }
    public static void main(String[] args) {
        int n=in.nextInt();
        while(n-->0){
            HeightOfTheTree tree=new HeightOfTheTree();
            int x=in.nextInt();
            while(x-->0){
                tree.root=tree.add(tree.root,in.nextInt());
            }
            System.out.println(tree.height(tree.root));
       }
    }
}
