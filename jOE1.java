import java.io.*;
import java.util.*;

public class jOE1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("joe.dat"));
		while (scan.hasNextLine()) {
			ArrayList<String> list = new ArrayList();
			Set<String> set = new TreeSet();
			String str = scan.nextLine().toUpperCase();
			str = str.replaceAll("\\p{Punct}", "");
			// System.out.println(str);
			String[] arr = str.split(" ");
			for (String s : arr)
				set.add(s);
			for (String s : set)
				list.add(s);
			list.sort((a, b) -> a.length() - b.length());
			list.forEach(a -> System.out.print(a + " "));
			System.out.println();

		}

	}

}
