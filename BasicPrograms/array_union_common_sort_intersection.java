import java.util.*;

public class array_union_common_sort_intersection {
    public static void main(String[] args) {
        int arr1[]={ 12 , 45 , 62,  98 , 5 , 28};
        int arr2[]={ 98 , 23 , 12 ,145};
        ArrayList<Integer> common =new ArrayList<Integer>();
        ArrayList<Integer> intersection =new ArrayList<Integer>();
        HashSet<Integer> union =new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){common.add(arr1[i]);}
                union.add(arr1[i]);union.add(arr2[j]);
                if(arr1[i]==arr2[j]){break;}
                else if(j==arr2.length-1){intersection.add(arr1[i]);}
            }
        }
        System.out.print("Common       : "+common);
        System.out.print("\nUnion        : "+union);
        ArrayList<Integer> unionsort =new ArrayList<Integer>(union);
        Collections.sort(unionsort);
        System.out.print("\nSorted Union : "+unionsort);
        System.out.print("\nIntersection : "+intersection);


    }
}
