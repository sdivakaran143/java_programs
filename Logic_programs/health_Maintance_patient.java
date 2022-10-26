class patient{
    String name;
    Double weight;
    Double height;
    patient(String name,Double height,Double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    public double ibm(){
        return (weight/(height*height));
    }
}

public class health_Maintance_patient {
 public static void main(String[] args) {
    patient obj =new patient("harish", 1.8, 80d);
    if(obj.ibm()>25){
        System.out.println("Over Weighted....");
    }else{
        System.out.println("Idel Weight....");
    }
 }  
}
