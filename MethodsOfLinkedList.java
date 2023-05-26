package CollectionOfVinod;

import java.util.ArrayList;
import java.util.LinkedList;

public class MethodsOfLinkedList extends ExampleOnArrayList {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("vinod");
        ll.add(23);
        ll.add(true);
        ll.add(45);
        System.out.println(ll);
        ArrayList al=new ArrayList();
        for(int i=10;i>0;i--){
            al.add(i);
        }ll.add(2,al);
        System.out.println(ll);
        //1.addFirst(Object obj)
        ll.addFirst("MANGI");
        System.out.println(ll);
        //2.addLast(Object obj)
        ll.addLast("VINOD");
        System.out.println(ll);
        //3.getFirst();
        System.out.println(ll.getFirst());
        //4.getLast()
        System.out.println(ll.getLast());
        //5.removeFirst()
        System.out.println(ll.removeFirst());
        System.out.println(ll);
        //6.removeLast()
        System.out.println(ll.removeLast());
        System.out.println(ll);
        System.out.println(ll.listIterator(3));
    }
}
