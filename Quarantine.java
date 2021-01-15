import java.util.Arrays;

public class Quarantine {
	public static String[][] generateDays(String[][] arr){
		int count = 49;
		int index = 0;
		while(count>0) {
			arr[0][index] = "Monday";
			count--;
			index++;
			arr[0][index] = "Tuesday";
			count--;
			index++;
			arr[0][index] = "Wednesday";
			count--;
			index++;
			arr[0][index] = "Thursday";
			count--;
			index++;
			arr[0][index] = "Friday";
			count--;
			index++;
			arr[0][index] = "Saturday";
			count--;
			index++;
			arr[0][index] = "Sunday";
			count--;
			index++;
		}
		return arr;
	}
	public static String[][] infectionDay(String[][]arr, String day){
		Arrays.fill(arr[1], " ");
		if(day.equals("Monday")) {
			arr[1][0] = "I";
		}
		if(day.equals("Tuesday")) {
			arr[1][1] = "I";
		}
		if(day.equals("Wednesday")) {
			arr[1][2] = "I";
		}
		if(day.equals("Thursday")) {
			arr[1][3] = "I";
		}
		if(day.equals("Friday")) {
			arr[1][4] = "I";
		}
		if(day.equals("Saturday")) {
			arr[1][5] = "I";
		}
		if(day.equals("Sunday")) {
			arr[1][6] = "I";
		}
		return arr;
	}
	public static String[][] testDay(String[][]arr, String day){
		for(int i = 0; i<arr[0].length; i++) {
			if(day.equals(arr[0][i])&& !arr[1][i].equals(" ")) {
				arr[1][i] += "T";
			}
			else if(day.equals(arr[0][i])&& arr[1][i].equals(" ")) {
				arr[1][i] = "T";
			}
		}
		return arr;
	}
	public static String[][] run(String[][]arr){
		return arr;
	}
	public static void main(String[] args) {
		String[][] arr = new String[2][49];
		arr = generateDays(arr);
		System.out.println(Arrays.toString(arr[0]));
		arr = infectionDay(arr,"Monday");
		arr = testDay(arr, "Tuesday");
		System.out.println(Arrays.toString(arr[1]));
	}

}
