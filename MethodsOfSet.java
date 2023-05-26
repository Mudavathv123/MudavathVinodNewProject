package CollectionOfVinod;

import java.util.HashSet;
import java.util.Set;

public class MethodsOfSet {
    public static void main(String[] args) {
        //HashSet is contains the Collection methods Only,It does not contain the  Own Methods
        Set hs = new HashSet();
        hs.add("vinod");
        hs.add("rahul");
        hs.add("prakash");
        hs.add("rakesh");
        hs.add("sagar");
        System.out.println(hs);
        HashSet<Integer> hs1 = new HashSet<>();
        int[] arr = {8, 8, 1, 2, 5, 44, 1,2, 88};
        for (int i : arr) {
           hs1.add(i);
        }
        //HashSet NothingBut which is Duplicate Elements are not Allowed And insertion order is Not preserved.
        System.out.println(hs1);
        hs.add(hs1);
        System.out.println(hs);
        hs1.remove(2);
        System.out.println(hs1);
        hs1.retainAll(hs);
        System.out.println(hs);
        System.out.println(hs1.add(54));
    }
}
