import java.io.*;
import java.util.*;

public class Json {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(new File("json.dat"));
		int count = scan.nextInt();
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		scan.nextLine();

		while (count-- > 0) {

			String save = "";
			String[] temp = scan.nextLine().trim().split("[\\.\\)\\(]");

			if (!temp[0].equals("print")) {
				if (!map.containsKey(temp[0])) {
					map.put(temp[0], new ArrayList<String>());
					map.get(temp[0]).add(temp[1]);
				} else {
					map.get(temp[0]).add(temp[1]);
				}
			} else {
				ArrayList<String> list = map.get(temp[1]);
				String out = "{";
				for (int i = 0; i < list.size(); i++) {
					out = out + list.get(i).replace("=", ":") + ", ";
				}
				out = out.substring(0, out.length() - 2);
				out = out + "}";
				System.out.println(out);
			}
		}
	}

}
