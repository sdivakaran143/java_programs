class patient{
    String name;
    Double weight;
    Double height;
    patient(String name,Double height,Double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    public void ibm(int limit){
        Double ibmrange=weight/(height*height);
        if(ibmrange>=25)
        System.out.println(ibmrange+"\t"+name);
    }
}
class patients {
    static patient objarr[]=new patient[10];
   static public void letcreate(){
        objarr[0] =new patient("harish", 1.8, 50.00);
        objarr[1] =new patient("hari", 2.8, 60.00);
        objarr[2] =new patient("kumar", 3.8, 70.00);
        objarr[3] =new patient("naveen", 1.8, 90.00);
        objarr[4] =new patient("marveen", 1.8, 90.58);
        objarr[5] =new patient("kums", 1.8, 100d);
        objarr[6] =new patient("ravi", 2.2, 92d);    
        objarr[7] =new patient("mugin",1.5, 68d);    
        objarr[8] =new patient("ravuthar", 1.2, 79d);    
        objarr[9] =new patient("nazim", 2.02, 120d);    
    }
    static public void letcall(){
        for (int i = 0; i <10; i++) {
            objarr[i].ibm(25);
        }
    }
}
public class health_Maintance_patient extends patients {
 public static void main(String[] args) {
    letcreate();
    letcall();
 }  
}
