import java.util.*;

public class stack_In_Array {
    static Scanner in = new Scanner(System.in);
    private int[] arr;
    private int capacity;
    private int top;

    stack_In_Array(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if ((capacity - 1) == top)
            System.out.println("the stack is full...");
        else
            System.out.println("added in the  stack....");
        arr[++top] = x;
    }

    public int pop() {
        if (-1 == top)
            System.out.println("the stack is empty...");
        else {
            System.out.println("removed in the  stack....");
            return arr[top--];
        }
        return 0;
    }

    public void topview() {
        if (-1 == top)
            System.out.println("the stack is empty...");
        else
            System.out.println("the top of the stack is : " + arr[top]);
    }

    public void view() {
        if (-1 == top)
            System.out.println("the stack is empty...");
        else
            System.out.println("the stack is : ");
        for (int i = top; i > -1; i--) {
            System.out.println("\t" + arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the Stack : ");
        int size = in.nextInt();
        stack_In_Array Stack = new stack_In_Array(size);
        while (true) {
            System.out.print(
                    "\nEnter 1 to push on stack\nEnter 2 to pop on the stack\nEnter 3 to know top of the Stack\nEnter 4 to view the stack\nEnter any key to exit\nEnter the value:  ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\neneter the value to push in the stack : ");
                    int x = in.nextInt();
                    Stack.push(x);
                    break;
                case 2:
                    Stack.pop();
                    break;
                case 3:
                    Stack.topview();
                    break;
                case 4:
                    Stack.view();
                    break;
                default:
                    System.out.println("Exited....");
                    System.exit(0);
            }

        }

    }

}