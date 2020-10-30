import java.io.*;
import java.util.*;

public class Josefa {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(new File("josefa.dat"));
		int count = scan.nextInt();
		while(count-- >0) {
			scan.nextLine();
			int input = scan.nextInt();
			String output = Integer.toBinaryString(input);
			while(output.length()!=8) {
				if(output.length()>8) {
					output = output.substring(1);
				}
				else if(output.length()<8) {
					output = "0"+ output;
				}
			}
			System.out.println(input+" = "+output);
		}
	}

}
