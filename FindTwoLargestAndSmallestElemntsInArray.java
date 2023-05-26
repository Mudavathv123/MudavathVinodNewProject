import java.util.Scanner;
import java.util.Arrays;
public class FindTwoLargestAndSmallestElemntsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int sizeOfArray=sc.nextInt();
        int[] arr=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++) {
        	arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("The two Smallest Element in an Array are :" );
        for(int i=0;i<2;i++) {
        		System.out.print(arr[i] +" ");
        	
        }System.out.println("");
        System.out.print("The two Largest Element in an Array are :"); 
        for(int i=arr.length-1;i>=arr.length-2;i--) {
        		System.out.print(arr[i] +" ");
        }
	}

}
