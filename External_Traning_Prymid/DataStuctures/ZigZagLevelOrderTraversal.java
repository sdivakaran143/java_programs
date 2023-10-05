import java.util.*;

public class ZigZagLevelOrderTraversal {
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
    void ZigZagTraverse(){
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        Deque<Node> dq=new ArrayDeque<>();
        boolean flag=true;
        dq.addFirst(root);
        while(!dq.isEmpty()){
            ArrayList<Integer> li =new ArrayList<>();
            if(flag){
                int n=dq.size();
                for (int i = 0; i < n; i++) {
                    Node temp=dq.removeFirst();
                    if(temp.right!=null){
                        dq.addLast(temp.right);
                    }
                    if(temp.left!=null){
                        dq.addLast(temp.left);
                    }
                    li.add(temp.data);
                }
                flag=false;
            }else{
                int n=dq.size();
                for (int i = 0; i <n; i++) {
                    Node temp=dq.removeLast();
                    if(temp.left!=null){
                        dq.addFirst(temp.left);
                    }
                    if(temp.right!=null){
                        dq.addFirst(temp.right);
                    }
                    li.add(temp.data);
                }
                flag=true;
            }
            al.add(li);
        }
        Collections.reverse(al);
        for(ArrayList<Integer> list: al){
            for(int i: list){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
     public static void main(String[] args) {
        int n=in.nextInt();
        ZigZagLevelOrderTraversal tree=new ZigZagLevelOrderTraversal();
        while(n-->0){
            tree.root=null;
            int x=in.nextInt();
            while(x-->0){
                tree.add(in.nextInt());
            }
            tree.ZigZagTraverse();
       }
    }
}
