import java.util.Arrays;
public class Largest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int second_max=0;
		int arr[]= {25,14,56,15,3656,77,18,20,40};//declaration and initialization
		Arrays.sort(arr); // sort an array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[arr.length-1]) // after sorting check array length-1
			{
				second_max=arr[i];// assigning  value of second maximum number 
				
			}
		}
		System.out.println("The second maximum number is:"+second_max);//print value of second maximum number
		
		}
	}
