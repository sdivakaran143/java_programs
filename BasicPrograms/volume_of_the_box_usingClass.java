import java.util.Scanner;
class box{
    double width;
    double height;
    double depth;
    box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double volume(){
        return width*height*depth;
    }
}
public class volume_of_the_box_usingClass {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Width of the Box : ");
        double width=in.nextDouble();

        System.out.print("Enter the Height of the Box : ");
        double height=in.nextDouble();

        System.out.print("Enter the Depth of the Box : ");
        double depth=in.nextDouble();

         box obj=new box(width,height,depth);
        System.out.println("\nvolume is : "+obj.volume());
    }
}
