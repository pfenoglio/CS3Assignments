import java.io.*;
import java.util.*;

public class JSN1 {
static void pr(ArrayList<String> list) {
	String str = "{";
	for(String s: list)
		str= str + s.replace('=', ':')+", ";
	str = str.substring(0,str.length()-2);
	System.out.println(str+"}");
	
}
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("json.dat"));
		int noSets= scan.nextInt();
		scan.nextLine();
		Map<String, ArrayList<String>> map = new HashMap();
		while(noSets-->0) {
			String inp = scan.nextLine();
			//System.out.println(inp.substring(0,6));
			if(inp.substring(0,6).equals("print(")) {
				//System.out.println(map.get(inp.substring(6,inp.length()-1)));
				pr(map.get(inp.substring(6,inp.length()-1)));
			}
			else {
				map.putIfAbsent(inp.substring(0,inp.indexOf(".")),
						new ArrayList<String>());
				map.get(inp.substring(0,inp.indexOf("."))).add(inp.substring(inp.indexOf('.')+1));
				//System.out.println(map);
				
				
			}
				
				
			
			
			
		}
		

	}

}
