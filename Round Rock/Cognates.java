import java.io.*;
import java.util.*;
public class Cognates {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(new File("cognates.dat"));
		int count = scan.nextInt();
		scan.nextLine();
		while(count-->0) {
			String[] arr = scan.nextLine().split("");
			String[] arr2 = scan.nextLine().split("");
			int num = 0;
			for(int i = 0; i<arr.length; i++) {
				if(i!=0 && arr[i].equals(arr[i-1])) {
					arr[i]=" ";
				}
				for(int j = 0; j<arr2.length; j++) {
					if(num == arr2.length) {
						break;
					}
					if(arr[i].equals(arr2[j])) {
						num++;
						break;
					}
				}
			}
			System.out.println(num);
			
		}
	}

}
