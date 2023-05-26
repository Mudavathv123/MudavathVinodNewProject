import java.util.Arrays;
import java.util.Scanner;
public class PrintArrayInSortedOrder {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray=sc.nextInt();
		int[] arr=new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i +" ");
		}
	}
}
