class teacher{
    void work(){
        System.out.println("teaching is my process");
    }
}
class student extends teacher{
    public void work(){
        super.work();
        System.out.println("leaning is my process");
    }
}
public class superKeyWord {
  public static void main(String[] args) {
    student std =new student();
    std.work();
  }
    
}
