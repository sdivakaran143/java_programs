import java.util.*;

public class Main {

  public static void main(String args[]) {

  Scanner t1 = new Scanner(System.in);

  int tst = t1.nextInt();

  for(int i1=0;i1<tst;i1++){

    int s = t1.nextInt();

    int ar[]= new int[s];

    for(int i=0;i<s;i++){

      ar[i]=t1.nextInt();

    }

    String str1= "Accepted";

    String str2="Rejected";

    int cnt=0;

    for(int i=0;i<ar.length;i++){

      for(int j=i+1;j<ar.length;j++){    

        if(ar[i]+ar[j]==2000){     

          cnt=1;

          break;

        }

      }

    }

     

     

    if(cnt==1){

      System.out.println(str1);

    }

    else{

      System.out.println(str2);

    }

  }

  }

}