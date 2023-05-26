package CollectionOfVinod;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={99,88,77,66,55,44,33,22,11};
        ArrayList<Integer> al=new ArrayList<>();
       for(int i:arr){
           al.add(i);
       }
        System.out.println(al);
       //1.remove() method
        al.remove(1);
        System.out.println(al);
        //2.set() method
        al.set(1,0);
        System.out.println(al);
        //3.get() method
        System.out.println(al.get(5));
        //4.indexOf()
        System.out.println(al.indexOf(66));
        //5.lastIndexOf()
        System.out.println(al.lastIndexOf(66));
        //6.contains() methods
        System.out.println(al.contains(55));
        System.out.println(al.contains(2));
        //7.size()
        System.out.println(al.size());
        //9.addAll()
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=5;i>0;i--){
            al2.add(i);
        }
        System.out.println(al2);
        al.addAll(al2);
        System.out.println(al);
        //10.isEmpty()
        System.out.println(al.isEmpty());
        //11.containsAll()
        System.out.println(al.containsAll(al2));
        System.out.println(al2.containsAll(al));
        //12.toArray() method
        Object[] obj=al.toArray();
        for (Object o:obj){
            System.out.print(o +" ");
        }
        System.out.println(" ");
        int max=0;
        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                if(al.get(i)>al.get(j)){
                    max=(max>al.get(i))?max:al.get(i);
                }else {
                    max=(max>al.get(j)?max:al.get(j));
                }
            }
        }
        System.out.println(max);
        System.out.println(" ");
        //13.removeAll()
        al.removeAll(al2);
        System.out.println(al);
        //14.clear()
      al.clear();
        System.out.println(al);
    }
}
