import java.util.Scanner;
public class SearchingGivenElementAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int sizeOfArray=sc.nextInt();
       int[] arr=new int[sizeOfArray];
       for(int i=0;i<sizeOfArray;i++) {
    	     arr[i]=sc.nextInt();
       }
       int searchElement=sc.nextInt();
      for(int i=0;i<sizeOfArray;i++){
    	  if(arr[i]==searchElement) {
    		  System.out.println(i);
    	  }else {
    		  System.out.println(-1);
    	  }
      }
	}

}
