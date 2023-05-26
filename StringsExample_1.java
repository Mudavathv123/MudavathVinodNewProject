import java.util.Scanner;
public class StringsExample_1 {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   int[] sample= {10,20,30,40,50,60,70,80,90,100};
	   int sum=0;
	   for(int i=2;i<sample.length;i++) {
		   boolean isPrime=true;
		   if(sample[i]%i==0) {
			   isPrime=false;
		   }
		   if(isPrime==true) {
			   sum+=sample[i];
			   System.out.print(sample[i] +" ");		   }
	   }
	   System.out.print(sum);
	   
   }
}
