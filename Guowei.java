import java.io.*;
import java.util.*;
public class Guowei {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(new File("guowei.dat"));
		int count = scan.nextInt();
		scan.nextLine();
		while(count-- > 0) {
			int times = scan.nextInt();
			int max =40;
			scan.nextLine();
			String str = scan.nextLine()+" ";
			String[] arr = str.split("");
			int index = 0;
			String temp;
			times = times%arr.length;
			while(times-->0) {
				
				temp = arr[index];
				for(int i = 0; i <arr.length-1; i++) {
					arr[i]= arr[i+1];
				}
				
				arr[arr.length-1] = temp;
				
			}
			for(int i = 0; i<max; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}

	}

}
