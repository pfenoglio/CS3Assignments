
import java.io.*;
import java.util.*;

public class EvilKing {
	public static int recur(ArrayList<Integer> list, boolean flag) {
		if(list.size()==1) {
			return list.get(0);
		}
		else {
			if(flag == true) {
				list.remove(0);
			}
			if(list.size()%2==0) {
				for(int i =0; i<list.size()-1;i++) {
					list.remove(i+1);
				}
				return recur(list, false);
			}
			else {
				
				for(int i =0; i<list.size()-1;i++) {
					list.remove(i+1);
				}
				return recur(list, true);
			}
		}
		
	}
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(new File("evilking.dat"));
		int count = scan.nextInt();
		while(count-->0) {
			scan.nextLine();
			int prisoners = scan.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(prisoners-->0) {
				list.add(prisoners);
			}
			Collections.sort(list);
			System.out.println("He who lives is: "+recur(list, false));
		}

	}

}
