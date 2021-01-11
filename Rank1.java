import java.util.*;

import org.omg.Messaging.SyncScopeHelper;

import java.io.*;
public class Rank1 {

	double gpa;
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	String fn;
	String ln;
	static List<Rank1> list = new ArrayList();
	public Rank1(double gpa, String fn, String ln) {
		super();
		this.gpa = gpa;
		this.fn = fn;
		this.ln = ln;
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("rank.dat"));
		while (scan.hasNextLine()) {
			String[] arr = scan.nextLine().split("[,/]");
			//System.out.println(Arrays.toString(arr));
			double accum = 0;
			for(int i = 0; i<arr.length-2; i++)
				accum+=Integer.parseInt(arr[i]);
			list.add(new Rank1(accum/(arr.length-2), arr[arr.length-1], arr[arr.length-2]));
			
			
		}
		Comparator<Rank1> comp = Comparator.comparingDouble(Rank1::getGpa).reversed().
				thenComparing(Rank1::getLn).thenComparing(Rank1::getLn);
		list.sort(comp);
		for(Rank1 obj: list) {
			System.out.printf("%.3f - (%s,%s)\n",obj.gpa,obj.fn,obj.ln);
		}
		
	}

}
