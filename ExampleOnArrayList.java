package CollectionOfVinod;

import java.util.*;

public class ExampleOnArrayList {
    public static void main(String[] args) {
        //List is child interface of Collection and the Implements classes are
        //1.ArrayList,2.LinkedList,3.Vector,4.Stack
        //Methods of ArrayList Class
        MethodsOfArrayList al=new MethodsOfArrayList();
        al.methodsOfArrayList();
    }
}class MethodsOfArrayList {
    public void methodsOfArrayList() {
        ArrayList arrayList = new ArrayList();
        //1.add(int index,Object) ,2.addAll(int index,Collection c) ,3.remove(int index), 4.indexOf(Object obj),
        //5.lastIndexOf(object obj), 6.get(int index), 7.listIterator(), 8.set(int index,Object obj)
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        System.out.println(arrayList);
        //2.addAll(int index,Collection)
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        arrayList.add(2, al);
        System.out.println(arrayList);
        //3.remove(int index)
        arrayList.remove(3);
        System.out.println(arrayList);
//        System.out.println(arrayList.remove(2));
        //4.indexOf(Object obj)
        System.out.println(arrayList.indexOf(60));
        //5.lastIndexOf(Object obj)
        System.out.println(arrayList.lastIndexOf(60));
        //6.get(int Index)
        System.out.println(arrayList.get(2));
        //7.listIterator(int Index)
        System.out.println(arrayList.listIterator(3).next());
        //8.set(int index,Object onj)
        arrayList.add(2, "vinod");
        arrayList.set(4, "rahul");
        System.out.println(arrayList);
        List l = Collections.synchronizedList(arrayList);
        System.out.println(l);

    }
}
