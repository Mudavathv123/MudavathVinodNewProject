package my2022ProjectOnJava;
	
	import java.util.*;
	import java.lang.*;
	import java.io.*;
	public class SampleExample{
		
		static BufferedReader br;
	    static PrintWriter ot;
	    public static void main(String[] args) throws IOException{
	        
	        br = new BufferedReader(new InputStreamReader(System.in));
	        ot = new PrintWriter(System.out);

	        int t = Integer.parseInt(br.readLine());

	        while(t-->0){
	            
	            String s[] = br.readLine().trim().split(" ");
	     
}
}
	}
	    class Solution
	    {
	        //Function to find a continuous sub-array which adds up to a given number.
	        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
	        {
	            // Your code here
	            ArrayList<Integer> al=new ArrayList<>();
	            int sum=0;
	            
	            for(int i=0;i<n;i++){
	                int sum2=0;
	                sum+=arr[i];
	                for(int j=1;j<n;j++){
	                    sum2+=arr[j];
	                    if(sum+sum2==s){
	                        al.add(i);
	                        al.add(j);
	                    }
	                }
	            }
	            return al;
	        }
	    }