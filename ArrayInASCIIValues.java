import java.util.Scanner;
public class ArrayInASCIIValues {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray=sc.nextInt();
		int[] arr=new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			arr[i]=sc.next().charAt(0);
		}
		for(int i:arr) {
			System.out.println(i );
		}
	}
}
