import java.io.*;
import java.util.*;

public class Bank {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(new File("bank.dat"));
		
		int N = scan.nextInt();
		scan.nextLine();
		while (N-- > 0) {
			String [] arr = scan.nextLine().split("\\D+");
			int sum = 0;
			
			if(arr.length == 0) {
				System.out.print("-");
				
			}
			
			for (int i = 0; i < arr.length; i++) {
				
				
				
				try{
					int additive = Integer.parseInt(arr[i]);
					
					System.out.print(additive + " ");
					sum += additive;
				}
				catch (NumberFormatException e) {
					
				}
				
			}//end of for loop
			System.out.println();
			if (sum != 0)
			System.out.println(sum);
			else
			System.out.println("0");
			sum = 0;
		}//end of while loop
		
		

	}

}


/*
+ 1 or more?
D - Non digit (Think about " " being inbeween spaces)

str.split("//D+");




*/