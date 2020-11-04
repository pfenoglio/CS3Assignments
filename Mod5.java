import java.io.*;
import java.util.*;
public class Mod5 {
	static Comparator<Integer> comp = (a,b)->{if(a%5 ==0 && b%5 != 0) {return 1;}if(a%5 != 0 && b%5 == 0) {return -1;}return a-b;};
	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(new File("mod5.dat"));
		int count = scan.nextInt();
		scan.nextLine();
		while(count-->0) {
			int times = scan.nextInt();
			scan.nextLine();
			String[] arr= scan.nextLine().split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(String s: arr) {
				list.add(Integer.parseInt(s));
			}
			
			Collections.sort(list, comp);
			
			for(Integer i: list) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
