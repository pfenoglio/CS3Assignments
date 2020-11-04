import java.io.*;
import java.util.*;
public class Steganography {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("steganography.dat"));
		int count = scan.nextInt();
		scan.nextLine();
		while(count-->0) {
			String[] arr = scan.nextLine().split("");
			for(int i = 0; i<arr.length; i+=2) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
	}

}
