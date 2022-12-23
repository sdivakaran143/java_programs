public class identy_matrix{
    public static void main(String[] args) {
        int[][]arr={{1,0,0},{0,1,0},{0,0,1}};
        boolean res=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    continue;
                }
                else if (arr[i][j]!=0) {
                    res=false;
                    break;                
                }
            }    
        }
        System.out.println("It is identy matrix? result : "+res);
    }
}
