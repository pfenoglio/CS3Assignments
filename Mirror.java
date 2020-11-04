import java.io.*;
import java.util.*;
public class Mirror {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(new File("mirror.dat"));
		int count = scan.nextInt();
		scan.nextLine();
		while(count-->0) {
			for(int times = 0; times<7; times++) {
				String[] line = scan.nextLine().split("");
				for(int i=0; i<line.length; i++) {
					System.out.print(line[i]);
				}
				System.out.print("|");
				for(int i=line.length-1; i>=0; i--) {
					System.out.print(line[i]);
				}
				System.out.println();
			}
			System.out.println("***");
		}

	}

}
