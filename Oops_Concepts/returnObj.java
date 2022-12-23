class news{
    int a,b,c;
}
class returnObj {

    public static news re(){
        news obj =new news();
            obj.a=10;
            obj.b=20;
            obj.c=40;
        return obj; 
    }
    public static void main(String[] args) {
        //as usuall like ( news cpyobj=new news )
        news cpyobj=re();
        System.out.println(cpyobj.a);
        System.out.println(cpyobj.b); 
        System.out.println(cpyobj.c); 
    }
} 
