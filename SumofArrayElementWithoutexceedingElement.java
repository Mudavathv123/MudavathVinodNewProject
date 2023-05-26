import java.util.Scanner;
public class SumofArrayElementWithoutexceedingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[] arr=new int[size];
       for(int i=0;i<size;i++) {
    	   arr[i]=sc.nextInt();
       }
       int sum=0;
       for(int i:arr) {
    	   if(i==6) {
    		   continue;
    	   }else {
    		   sum+=i;
    	   }
       }
       System.out.println(sum);
	}

}
