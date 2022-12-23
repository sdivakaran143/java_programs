import java.util.*;
class student{
    static Scanner in =new Scanner(System.in);
    int reg;
    String collagename="ksrct";
    String  dept;
    
    student(int regno,String collagename,String dept){
        this.reg=regno;
        this.collagename=collagename;
        this.dept=dept;
    }
    student(int regno,String dept){
        this.reg=regno;
        this.dept=dept;
    }
    student(){
        this(2013028,"ranith", "ece");
    } 

    public void getData(){
        System.out.println("=============================\nregNo : "+reg+"\ncollagename : "+collagename+"\ndepartment : "+dept+"\n=============================");
    }
    public void setData(){
        System.out.print("enter the regnum :");
        this.reg=in.nextInt();
        in.nextLine();
        System.out.print("enter the collagename :");
        this.collagename=in.nextLine();
        System.out.print("enter the department name :");
        this.dept=in.nextLine();
    }
}
class objectAndClassBasic{

    public static void main(String[] args) {
                student obj1=new student(2013021,"ksrce","cse");        
                student obj2=new student(2013024,"IT");        
                student obj=new student();
                // obj.setData();
                obj.getData();
                //obj.reg=2013022;
                //System.out.println(obj.reg);
                obj1.getData();
                obj2.getData();
    }
}