package CollectionOfVinod;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class MethodsOfLinkedHashSet {
    public static void main(String[] args) {
       // LinkedHashSet  it Only contains Collection Interface By Implemented ,It does not have its own Methods
        LinkedHashSet<Integer> lh=new LinkedHashSet();
        for(int i=9;i>0;i--){
            lh.add(i);
        }
        LinkedHashSet<Integer> lh1=new LinkedHashSet<>();
        int[] arr={55,44,66,55,11,12,66,88,66,44,55};
        for(int i:arr){
            lh1.add(i);
        }
        //Duplicate Elements are not allowed And Insertion order is preserved
        //LinkedHashSet is the best choice to develop cache based Application ,
        // where Duplicates are not Allowed  and insertion order must be preserved
        System.out.println(lh1);
        lh.addAll(lh1);
        System.out.println(lh);
        lh.remove(7);
        System.out.println(lh);
        System.out.println(lh.contains(8));
    }
}
