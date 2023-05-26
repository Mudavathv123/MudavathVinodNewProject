package CollectionOfVinod;

import java.util.ArrayList;
import java.util.TreeSet;

public class MethodsOfSortedSet {
    public static void main(String[] args) {
        //SortedSet is a child interface of Set
        //If we Want to represent group of individual Objects according
        // to some sorting Order  and Duplicate Are not Allowed then we use the SortedSet
        //It contains some Specific Methods
        //1.first(),2.last(),3.headSet(Object obj),4.tailSet(Object obj),
        // 5.subSet(from Object,toObject),6.comparator()
        TreeSet<Integer> ts=new TreeSet<>();
        int[] arr={9,8,7,6,5,4,3,2,1};
        for(int i:arr){
            ts.add(i);
        }
        ArrayList<Integer> al=new ArrayList<>();
        int [] arr1={99,88,77,66,55,44,66,55,44,33,22,11};
        for(int i:arr1){
            al.add(i);
        }
        ts.addAll(al);
        System.out.println(ts);
        //1.first()
        System.out.println(ts.first());
        //2.last()
        System.out.println(ts.last());
        //3.headSet()
        System.out.println(ts.headSet(5));
        //4.tailSet()
        System.out.println(ts.tailSet(5));
        //5.subSet()
        System.out.println(ts.subSet(2,8));

    }
}
