package CollectionOfVinod;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparable {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(new MyComparator());
        ts.add(10);
        ts.add(6);
        ts.add(15);
        ts.add(20);
        ts.add(26);
        System.out.println(ts);
        TreeSet<String> tstr=new TreeSet<>(new MyComparator1());
        tstr.add("Roja");
        tstr.add("ShabaRani");
        tstr.add("RojaKumari");
        tstr.add("Ganga Bhavani");
        tstr.add("Rammulamma");
        System.out.println(tstr);
    }
}
class MyComparator implements Comparator {
    public int compare(Object obj1,Object obj2){
        Integer I1=(Integer) obj1;
        Integer I2=(Integer) obj2;
        if(I1 <I2){
            return +1;
        }else if(I1 >I2){
            return -1;
        }else{
            return 0;
        }
    }
}
class MyComparator1 implements Comparator{
    public int compare(Object obj1,Object obj2){
        String str=obj1.toString();
        String str2=obj2.toString();
        return -str.compareTo(str2);
    }
}
