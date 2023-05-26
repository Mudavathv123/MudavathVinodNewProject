
import java.util.Scanner;
public class RemoveDuplicateElementAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int sizeOfArray=sc.nextInt();
       int[] arr=new int[sizeOfArray];
       for(int i=0;i<sizeOfArray;i++) {
    	   arr[i]=sc.nextInt();
       }
       int j=0;
       for(int i=0;i<sizeOfArray-1;i++) {
    	   if(arr[i]!=arr[i+1]) {
    		   arr[j++]=arr[i];
    	   }
       }
       arr[j++]=arr[sizeOfArray-1];
      for(int i=0;i<j;i++) {
    	  System.out.print(arr[i] +" ");
      }
	}

}
