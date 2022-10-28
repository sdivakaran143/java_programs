
class college{
    String collegename="KSRCE";
    int fees=150000;
} 
class cse extends college{
    int fees=77000;
        public static void raid(){
            System.out.println(" 1");
        }
    
}
class it extends college{
        int fees=72000;
        public static void raid(){
            System.out.println(" 2");
        }
    
}
class ece extends it{
        int fees=super.fees;
        public static void raid(){
            System.out.println(" 3");
        }

}
public class Main  {
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
