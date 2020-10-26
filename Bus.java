import java.util.*;
import java.io.*;
public class Bus {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(new File("bus.dat"));
		Stack<String> sta = new Stack<>();
		ArrayList<String> list = new ArrayList<>();
		int count =1;
		while(scan.hasNext()) {
			String[] arr = scan.nextLine().split(" ");
			if(!arr[0].equals("END")) {
				if(arr[0].equals("ON")) {
					for(int i = 1; i< arr.length; i++) {
						sta.push(arr[i]);
						count +=1;
					}
				}
				else if(arr[0].equals("OFF")) {
					for(int i = 1; i<arr.length; i++) {
						while(!sta.peek().equals(arr[i])) {
							list.add(sta.pop());
							
						}
						sta.pop();
						count+=1;
						for(String s: list) {
							sta.push(s);
							count +=1;
						}
					}
				}
			}
		}
		System.out.println(count);

	}

}
