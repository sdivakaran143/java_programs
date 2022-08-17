public class decreasingarray {
    public static void main(String[] args) {
        int[] input1= {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5};
        int input2=input1.length;
        int o1=0,o2=0,c=0;
		int m=0;

		for(int i=0;i<input2-1;i++){
			if(input2==1){
				o1=0;o2=0;
				break;
			}else{

			if(input1[i]>input1[i+1]){
				if(m==0){
					o1++;
					m++;
				}
				c++;
			}
			else{
				m=0;
				if(c>o2){
					o2=c+1;
				}
				c=0;
			}
			if(o2==0&&i==input2-2||o2<(c+1)&&i==input2-2){
				o2=c+1;
				break;
			}
			if(i==input1[input2-2]&&input1[input2-2]>input1[input2-1]){
				o2++;
			}
		  }
		}
        System.out.println(o1+"  "+o2);
    }
}
