import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Permutations {
	public static int factorial(int len) {
		int out = len;
		while (len > 1) {
			len--;
			out = out * len;
		}
		return out;

	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("permutations.dat"));
		int baseCount = scan.nextInt();
		scan.nextLine();
		while (baseCount-- > 0) {
			char[] input = scan.nextLine().trim().toCharArray();
			int numerator = factorial(input.length);
			Map<Character, Integer> map = new HashMap();
			for (char c : input) {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else
					map.put(c, map.get(c) + 1);
			}
			int denominator = 1;
			for (Entry<Character, Integer> ent : map.entrySet()) {
				denominator = factorial(ent.getValue()) * denominator;
			}
			System.out.println(numerator / denominator);
		}

	}

}
