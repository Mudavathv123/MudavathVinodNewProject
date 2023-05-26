import java.util.Scanner;
public class MaximumAndMinimumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int sizeOfArray=sc.nextInt();
      int[] arr=new int[sizeOfArray];
      for(int i=0;i<sizeOfArray;i++) {
    	  arr[i]=sc.nextInt();
      }
      int max=arr[0],min=arr[0];
      for(int i:arr) {
    	  max=(max>i)?max:i;
    	  min=(min<i)?min:i;
      }
      System.out.println("The Maximum is : "+max +" and  The Minimum is " +min );
	}

}
