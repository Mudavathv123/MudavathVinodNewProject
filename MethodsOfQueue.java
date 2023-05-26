package CollectionOfVinod;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MethodsOfQueue {
    public static void main(String[] args) {

        Queue<Integer> queue=new PriorityQueue<>();
        queue.offer(20);
        queue.offer(10);
        queue.offer(30);
        queue.offer(500);
        queue.offer(85);
        queue.offer(85);
        queue.offer(418);
        System.out.println(queue);
        //1.poll() Method is return null (If Queue empty) other return first
        System.out.println(queue.poll());
        System.out.println(queue);
        //2.remove() Method its return NullSuchElement(if Queue is Empty) otherwise Boolean
        System.out.println(queue.remove(20));
        System.out.println(queue);
        System.out.println(queue.peek());
        //3.element() method
        System.out.println(queue.element());
        System.out.println(queue);
        PriorityQueue<Integer> pq=new PriorityQueue<>(15,new MyComparator2());
        pq.addAll(queue);
        System.out.println(pq);
    }
}
class MyComparator2 implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer i1=(Integer) obj1;
        Integer i2=(Integer) obj2;
        return -i1.compareTo(i2);
    }
}
