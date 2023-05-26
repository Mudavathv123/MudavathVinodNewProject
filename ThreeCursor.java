package CollectionOfVinod;

import java.util.*;

public class ThreeCursor {
    public static void main(String[] args) {
        Vector ls = new Vector();
        int[] a = {1, 5, 6, 9, 8, 3};
        for (int i : a) {
            ls.add(i);
        }
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i) +" ");
        }
        System.out.println(" ");
        //Enumeration Cursor Only applicable for Legacy class(1.0 v) and it does not contain remove method
        Enumeration e = ls.elements();
        while (e.hasMoreElements()) {
            Integer I = (Integer) e.nextElement();
            if (I % 2 == 0) {
                System.out.print(I +" ");
            }
        }
        //Iterator cursor Applicable for any collection Object,Hence it is Universal Cursor
        //By using Iterator cursor we can perform the read and remove operation
        ArrayList<Integer> al=new ArrayList<>();
        int[] arr={9,8,7,6,5,4,3};
        for(int i:arr){
            al.add(i);
        }
        System.out.println(" ");
        System.out.print(al);
        System.out.println(" ");
        Iterator itr=al.iterator();
        //Limitation of Iterator
        // 1.Forward Direction only,2.read and remove but not replace,3.Not an addition of new Object
        for(int i=0;itr.hasNext();i++){
            Integer I2=(Integer) itr.next();
            if(I2 % 2 == 0){
                System.out.print(I2 +" ");
            }else {
//                itr.remove();
            }
        }
        System.out.println(al);
        System.out.println(" ");
        Iterator itr1=ls.iterator();
        while(itr1.hasNext()){
            Integer I3=(Integer) itr1.next();
            if(I3%2!=0){
                System.out.print(I3 +" ");
            }
        }
        //ListIterator Cursor (PowerFul Cursor),Bidirectional cursor
        //Its perform 1.read,2.remove,3.replacement and 4.Addition of new Object
        ListIterator ltr=al.listIterator();
        while(ltr.hasNext()){
            Integer I4=(Integer) ltr.next();
            if(I4%2==0){
                System.out.println(I4);
            }else{
                ltr.set("Vinod");
                ltr.remove();
            }
        }
        //The Extra capability of ListIterator 1.remove(),2.set(),3.add()
        //ListIterator is only applicable for List implemented class Objects ,It is Not a Universal cursor
        ltr.add("prakash");
        System.out.println(al);
        System.out.println(ltr.nextIndex());
    }
}
