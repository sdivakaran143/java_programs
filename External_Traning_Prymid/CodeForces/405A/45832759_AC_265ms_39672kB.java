import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int arr[]=new int[a];
for(int i=0;i<a;i++)
   arr[i]=in.nextInt();

int temp=0;
for(int i=0;i<a;i++){
   for(int j=i+1;j<a;j++){
       if(arr[i]>arr[j]){
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
       }
   }
}
for(int i=0;i<a;i++){
   System.out.print(arr[i]+" ");
}
}
}