import java.io.*;
import java.util.*;

public class Jsn2 {

	String name;
	List<String> list;

	public Jsn2(String name, String change) {
		super();
		this.name = name;
		list = new ArrayList();
		list.add(change);
		
	}

	static ArrayList<Jsn2> bigList = new ArrayList();

	static int find(String str) {
		for (int i = 0; i < bigList.size(); i++)
			if (bigList.get(i).name.equals(str))
				return i;
		return -1;

	}
	static void pr(String nameToFind) {
		int n = find(nameToFind);
		String str = "{";
		for(String s: bigList.get(n).list)
			str= str + s.replace('=', ':')+", ";
		str = str.substring(0,str.length()-2);
		System.out.println(str+"}");
		
	}

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("json.dat"));
		int noSets = scan.nextInt();
		scan.nextLine();
		while (noSets-- > 0) {
			String inp = scan.nextLine();
			if (inp.substring(0, 6).equals("print(")) {
				pr(inp.substring(6, inp.length() - 1));
			} else {
				int n = find(inp.substring(0, inp.indexOf('.')));
				if(n==-1)
					bigList.add(new Jsn2(inp.substring(0, inp.indexOf('.')),
							inp.substring(inp.indexOf('.')+1)));
				else
					bigList.get(n).list.add(inp.substring(inp.indexOf('.')+1));
				

			}
		}
	}

}
