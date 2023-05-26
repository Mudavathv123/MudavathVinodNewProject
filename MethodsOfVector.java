package CollectionOfVinod;

import java.util.ArrayList;
import java.util.Vector;

public class MethodsOfVector {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("red");
        v.add("Green");
        v.add("Black");
        v.add("Yellow");
        System.out.println(v);
        int[] arr={10,20,56,89,45,96};
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:arr){
            al.add(i);
        }
        for(int i:al){
            v.add(i);
        }
        v.add(al);
        System.out.println(v);
        v.remove(5);
        System.out.println(v);
        v.set(2,"pink");
        System.out.println(v);
    }
}
