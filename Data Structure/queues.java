
public class queues {
    static int size = 5;
    static int[] arr =new int[size];
    static int front=-1;static int rear=0;

    public static void enqueue(int num){
        if(isfull()){
            System.out.println("queue is full...");
        }
        else{
            arr[++front]=num;
            rear++;
        }
    }
    public static boolean isfull(){
        if(rear==size){
        return true;}
        else{ return false;}
    }
    public static void display() {
        for (int i=0 ;i<rear;i++) {
            System.out.println(arr[i]);
        }
    }



public static void main(String[] args) {
    enqueue(10);
    enqueue(12);
    display();
}
    
}