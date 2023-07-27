class Solution {
    public static String convert(String s, int n) {
        if(n==1){
            return s;
        }
        boolean k=true;
        String[] arr=new String[n];
        int j=0;
        System.out.println(n);
        for(int m=0;m<n;m++)
            arr[m]="";

        for(int i=0;i<n;){
            arr[i]+=s.charAt(j);
            if(k)
                i++;
            else
                i--;
                
            if(i==-1){
                k=true;
                i+=2;
            }
            if(i==n){
                k=false;
                i-=2;
            }
            j++;
        }
        String Output="";
        for(String str:arr){
            Output+=str;
        }
        return Output;
    }
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
        
    }
}