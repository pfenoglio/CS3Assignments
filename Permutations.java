import java.io.*;
import java.util.*;

public class Permutations {

	public  static int factorial(int n) 
    { 
        if (n == 0 || n == 1) 
          return 1; 
        
          
        return n*factorial(n-1); 
    }
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(new File("permutations.dat"));
		
		int numCases = scan.nextInt();
		scan.nextLine();
		
		while(numCases-- > 0) {
			
			String str = scan.nextLine();
			int length = str.length();
			String[] arr = str.split("");
			ArrayList<String> set = new ArrayList<String>();
			
			for(int i = 0; i < arr.length; i++) {
				set.add(arr[i]);
			}
			
			Collections.sort(set);
			
			for (int i = 0; i < set.size(); i++) {
				arr[i] = set.get(i);
			}
			int count = 0;
			
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i].equals(arr[i+1])) {
					count++;
				}
			}
			;
			
			int ans = factorial(length)/(factorial(length-(count+1)));
			if (count == 0) {
				ans = factorial(ans);
			}
			System.out.println(ans);
		
			
			
		}
		

	}

}
