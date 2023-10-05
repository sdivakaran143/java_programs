import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int q=sc.nextInt();
long sum[]=new long[n+1];
   for(int i=1;i<sum.length;i++){
      long num=sc.nextLong();
      sum[i]=sum[i-1]+num;
   }
   for(int j=0;j<q;j++){
   int l=sc.nextInt(),r=sc.nextInt();
   long ans=sum[r]-sum[l-1];
   System.out.println(ans);
   }
}
}  
