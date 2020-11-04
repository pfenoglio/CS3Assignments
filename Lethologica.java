import java.io.*;
import java.util.*;
public class Lethologica {
//start 12:14
	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(new File("lethologica.dat"));

		int numSentences = scan.nextInt();
		scan.nextLine();
		
		while(numSentences-- > 0) {
			String [] arr = scan.nextLine().split(" ");
			String replace = scan.nextLine();
			for(int i = 0; i < arr.length; i++) {
				
				if(arr[i].equals("*.")) {
					System.out.print(replace + ".");
				}
				else if (arr[i].contains("*")) {
					System.out.print(replace + " ");
				}
				else
					System.out.print(arr[i] + " ");
				
			}
			System.out.println();
			
			
		}
	}

}
