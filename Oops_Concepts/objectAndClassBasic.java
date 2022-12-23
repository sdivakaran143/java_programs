import java.util.*;
class student{
    static {
        System.out.println("slaveClass static Method execute.... ");
    }
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
        System.out.println("main method");
        student obj1=new student(2013021,"ksrce","cse");        
                student obj2=new student(2013024,"IT");        
                student obj=new student();
                // obj.setData();
                //obj.reg=2013022;
                //System.out.println(obj.reg);
                obj1.getData();
                obj2.getData();
                obj.getData();
            }
            /* Note(Important):
                 in java Jvm automatically loads the static method initially before main method execution.....
                If we use it in the outside the main class. It will Call When the object is created
                It can't use it in inner class */
            static {
                    System.out.println("MainClass static Method execute.... ");
            }
}
/*
1)why main method is always static ?????
    answer: because static main helps the JVM to identify the main method 
    and JVM consider the static main as a initial entry point...
2)
*/