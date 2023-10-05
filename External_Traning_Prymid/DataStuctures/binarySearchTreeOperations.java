import java.util.*;
public class binarySearchTreeOperations
{
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }
    Node Insert(Node temp,int data){
        if(temp == null)
            return new Node(data);
        else if(temp.data > data)
            temp.left = Insert(temp.left,data);
        else if(temp.data < data)
            temp.right = Insert(temp.right,data);
        return temp;
    }
    int Min_value(Node temp){
        int min = temp.data;
        while(temp != null){
            if(temp.data < min)
                min = temp.data;
            
            temp = temp.left;
        }
        return min;
    }
    Node Delete(Node temp,int data){
        if(temp == null)
            return temp;
        else if(temp.data > data)
            temp.left = Delete(temp.left,data);
        else if(temp.data < data)
            temp.right = Delete(temp.right,data);
        else{
            if(temp.left == null)
                return temp.right;
            else if(temp.right == null)
                return temp.left;
            else{
                temp.data = Min_value(temp.right);
                temp.right = Delete(temp.right,temp.data);
            }
        }
        return temp;
    }
    boolean Search(Node temp,int data){
        if(temp == null)
            return false;
        else if(temp.data > data)
            return Search(temp.left,data);
        else if(temp.data < data)
            return Search(temp.right,data);
        else
            return true;
    }
    void Pre_Order_Traversal(Node temp){
        if(temp != null){
            System.out.print(temp.data + " ");
            Pre_Order_Traversal(temp.left);
            Pre_Order_Traversal(temp.right);
        }
    }
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		binarySearchTreeOperations tree = new binarySearchTreeOperations();
		int t = sc.nextInt(),q,n,x,i;
		for(i=1 ; i<=t ; i++){
		    tree.root = null;
		    System.out.println("Case #"+i+":");
		    q = sc.nextInt();
		    while(q-- > 0){
		        n = sc.nextInt();
		        if(n==1){
		            x = sc.nextInt();
		            tree.root = tree.Insert(tree.root,x);
		        }
		        else if(n==2){
		            x = sc.nextInt();
		            tree.root = tree.Delete(tree.root,x);
		        }
		        else if(n==3){
		            x = sc.nextInt();
		            boolean flag = tree.Search(tree.root,x);
		            if(flag)
		                System.out.println("Yes");
		            else
		                System.out.println("No");
		        }
		        else{
		            tree.Pre_Order_Traversal(tree.root);
		            System.out.println();
		        }
		    }
		}
	}
}