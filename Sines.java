import java.io.*;
import java.util.*;
public class Sines {

	//start 12:34
	//22 mins
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(new File("sines.dat"));
		
		int numLoop = scan.nextInt();
		scan.nextLine();
		
		while(numLoop-- > 0) {
			String[] arr = scan.nextLine().split(" ");
			double[] arr2 = new double[arr.length];
			
			arr2[0] = Double.parseDouble(arr[0]);
			arr2[1] = Math.toRadians(Double.parseDouble(arr[1]));
			arr2[2] = Math.toRadians(Double.parseDouble(arr[2]));
			
			System.out.printf("%.1f",arr2[0]/Math.sin(arr2[1])*Math.sin(arr2[2]));
			System.out.println();
			
		}

	}

}
