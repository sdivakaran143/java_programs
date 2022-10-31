import java.util.*;
public class hash_table {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        Hashtable<Integer,String> ht =new Hashtable<Integer,String >();
        ht.put(1, "jhon");
        ht.put(5, "Mithun");
        ht.put(33, "Mithun");
        ht.put(11, "Meera");
        ht.put(2, "Regina");
        ht.put(22, "Sarathy");
        ht.remove(2);
        System.out.println(ht);
    }
}
 