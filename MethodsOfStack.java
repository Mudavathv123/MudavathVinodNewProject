package CollectionOfVinod;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MethodsOfStack {
    public static void main(String[] args) {
        //Methods of  stack class which is extends from vector class and its Own some methods
        //1.push(Object obj),2.pop(),3.peek(),4.empty(),5.search(Object obj)
        List stack=new Stack();
        String[] str={"BMW","Benz","RoseRoyal","KIA","VitaraBirza"};
        for(String str1:str){
            stack.add(str1);
        }
        System.out.println(stack);
        //1.push(Object obj)
        Stack stack1=new Stack();
        for(String str1:str){
            stack1.push(str1);
        }
        System.out.println(stack1);
        stack.add(stack1);
        System.out.println(stack);
        //2.pop() Method of Stack class
        stack.remove(2);
        stack1.pop();
        // pop method is remove the element from the stack which is top of the stack
        System.out.println(stack);
        //3.peek() Method of Stack class
        //A peek() method is Check the Element which Element is top of the stack without pop
        System.out.println(stack1.peek());
        //4.empty() Method
        System.out.println(stack.isEmpty());  //The Collection Interface Having isEmpty() Method but
        System.out.println(stack1.empty());  //Stack class having its Own Method i.e empty() method
        //5.search() method of Stack class
        System.out.println(stack1.search("RoseRoyal")); //the search() method is return offset
       stack1.add("RahulKorra");
        System.out.println(stack1);
        stack1.remove("BMW");
        System.out.println(stack1);
        System.out.println(stack1.listIterator(4).nextIndex());
        Object[] arr1=stack1.toArray();
        for (Object o:arr1){

            System.out.println(o);
        }

    }
}
