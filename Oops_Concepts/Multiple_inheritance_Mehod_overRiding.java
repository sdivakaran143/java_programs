
class college{
    String collegename="KSRCE";
    //private int fees=150000;
} 
class cse extends college{
    int fees=77000;
        public void raid(){
            System.out.println(" 1");
        }
    
}
class it extends college{
        int fees=72000;
        public void raid(){
            System.out.println("2");
        }
    
}
class ece extends it{
        int fees=super.fees;
        public void raid(){
            System.out.println(" 3");
        }
}
public class Multiple_inheritance_Mehod_overRiding  {
 public static void main(String[] args) {
    cse obj=new cse();
        it obj1=new it();
            ece obj2=new ece();

    System.out.println(obj.collegename);
    System.out.println(obj1.collegename);
    System.out.println(obj2.collegename);
    System.out.println(obj.fees);    
    System.out.println(obj1.fees);
    System.out.println(obj2.fees);
    obj.raid();    
    obj1.raid();
    obj2.raid();
 }  
}
