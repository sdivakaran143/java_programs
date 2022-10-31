
public class queues_in_Array {
    static int size = 5;
    static int[] arr =new int[size];
    static int front=0;static int rear=-1;

    public static void enqueue(int num){
        if(isfull()){
            System.out.println("queue is full...");
        }
        else{
            if(rear==size-1){
                arr[--front]=num;
            }else{
            arr[++rear]=num;
            }
        }
    }

    public static void dequeue(){
        if(isempty()){
            System.out.println("queue is  EMPTY...");
        }
        else{
            front++;
        }
    }
    public static boolean isfull(){
        if(rear==size){
        return true;}
        else{ return false;}
    }

    public static boolean isempty(){
        if(rear==-1){
        return true;}
        else{ return false;}
    }

    public static void display() {
        System.out.print(arr[rear]+"\n");
        System.out.print(arr[front]+"\t");
    }

public static void main(String[] args) {
    enqueue(12);
    enqueue(72);
    enqueue(2);
    enqueue(27);
    enqueue(5);
    dequeue();
    dequeue();
    dequeue();
    enqueue(55);
    enqueue(566);

    display();

    // enqueue(10);
    // enqueue(10);
}
    
}

