import java.io.*;
import java.util.*;

public class Emmanuel {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("emmanuel.dat"));
		int count = scan.nextInt();
		scan.nextLine();
		while (count-- > 0) {

			String[] arr = scan.nextLine().trim().split("[\\{\\}\\,]");
			int[] arr1 = new int[arr.length - 1];
			for (int i = 0; i < arr1.length; i++) {
				if (!arr.equals("")) {
					arr1[i] = Integer.parseInt(arr[i + 1]);
				}
			}
			HashMap<Integer, Integer> map = new HashMap<>();
			int out = 0;
			int max = 1;
			int times=0;
			
			for (int s : arr1) {
				if (map.putIfAbsent(s, 1) != null) {
					int count1 = map.get(s) + 1;
					map.put(s, count1);
					if (count1 > max) {
						max = count1;
						out = s;
						times++;
					}
				}
			}
			if(arr1.length==1) {
				out = arr1[0];
			}
			times++;
			System.out.println(out+" appeared "+times+" time(s)");
		}
	}

}
