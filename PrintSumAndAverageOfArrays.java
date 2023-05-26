import java.util.Scanner;
public class PrintSumAndAverageOfArrays {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray=sc.nextInt();
		int[] arr=new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("The sum Of All array Element in an Array is : " +sum);
		System.out.println("The Average of Array Elemnets is : " +sum/arr.length);
	}
}
