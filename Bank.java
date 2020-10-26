import java.io.*;
import java.util.*;
public class Bank {

	public static void main(String[] args) throws IOException{
		
		Scanner scan = new Scanner(new File("bank.dat"));
		int count = scan.nextInt();
		scan.nextLine();
		
		while(count-->0) {
			int sum = 0;
			String[] input = scan.nextLine().split("\\D+");
			ArrayList<Integer> numList= new ArrayList<>();
			if(input.length>1) {
			for(int i = 0; i<input.length; i++) {
				if(input[i].matches("\\d+")) {
				numList.add(Integer.parseInt(input[i]));
				}
			}
			for(Integer Int: numList) {
				System.out.print(Int+" ");
				sum+=Int;
			}
			System.out.println();
			System.out.println(sum);
			}
			else {
				System.out.println("-");
				System.out.println("0");
			}
		}
	}

}
