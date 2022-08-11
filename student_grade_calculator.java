import java.util.*;

class grade{
    int regno,sem;
    String name,s1,s2,s3,s4,s5,s6;
    static Double sgpa;
    grade(int regno,String name,String s1,String s2,String s3,String s4,String s5,String s6,int sem){
            this.regno=regno;
            this.name=name;
            this.s1=s1;
            this.s2=s2;
            this.s3=s3;
            this.s4=s4;
            this.s5=s5;
            this.s6=s6;
    }
    public void calculate(){
       s1=""+(grademark(s1)*4);
       s2=""+(grademark(s2)*4);
       s3=""+(grademark(s3)*4);
       s4=""+(grademark(s4)*3);
       s5=""+(grademark(s5)*3);
       s6=""+(grademark(s6)*3);
    } 
    public void result(){
        sgpa=(Double.parseDouble(s1)+Double.parseDouble(s2)+Double.parseDouble(s3)+Double.parseDouble(s4)+Double.parseDouble(s5)+Double.parseDouble(s6)+10+10+9)/24;
        System.out.print("SGPA : "+sgpa);
    }
    public int grademark(String s){
        if("O".equals(s)){
            return 10;
        }else if("A+".equals(s)){
            return 9;
        }else if("A".equals(s)){
            return 8;
        }else if("B+".equals(s)){
            return 7;
        }else if("B".equals(s)){
            return 6;
        }
        return 0;
     }

}


public class student_grade_calculator {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the  regNo : ");
            int regno=in.nextInt();
            in.nextLine();
        System.out.print("Enter the  NaME : ");
            String name=in.nextLine();
        System.out.print("Enter the  Sem : ");
            int sem=in.nextInt();
            in.nextLine();
            System.out.print("Enter the grade for PDM : ");
            String s1=in.nextLine().toUpperCase();
            System.out.print("Enter the grade for TOC : ");
            String s2=in.nextLine().toUpperCase();
            System.out.print("Enter the grade for DAA : ");
            String s3=in.nextLine().toUpperCase();
            System.out.print("Enter the grade for MM : ");
            String s4=in.nextLine().toUpperCase();
            System.out.print("Enter the grade for JP : ");
            String s5=in.nextLine().toUpperCase();
            System.out.print("Enter the grade for DBMS : ");
            String s6=in.nextLine().toUpperCase();
            grade obj=new grade(regno,name, s1, s2, s3, s4, s5, s6,sem);
            obj.calculate();
            obj.result();
            
    }
}
