import java.io.*;
import java.util.*;

public class covid {

	/* 
	thinking about the original question, since infected kids don't become contagious or appear positive on the tests on day 1, I assumed it was best to 
	have the school test on Tuesday because it's most likely that kids are out on the weekends and have a higher chance of infection
	thus catching the most cases possible
	
	regardless of what I think however, I want to see what I can do with objects in addition to arrays 
	my intention is to probably make it easier to edit and slap on extra parameters and data as things develop
	
	
	INFO DUMP: 
	- Testing once week (Results take 24 hours to return)
	- Assume students wont go home if they are infected as they are probably asymptomatic or not sick enough
	- Test results only show positive if they've been infected for 2 days
	- If positive, Quarantine for 10 days (assume they're cured after 10 days)
	
	
	*/
	
	static int daysInfected;
	static String status;  //  (blank), INF, T, C , CT, Q
	static String [] day = new String[7];		// Mon, Tues, Wed, Thur, Fri, Sat, Sun
	static String [][] calendar = new String[2][7]; 
	
	public covid(int daysInfected, String status) {
		super();
		this.daysInfected = daysInfected;
		this.status = status;
		
		
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wednesday";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";		
	
		
	}

	
	
	public static void main(String[] args) throws NullPointerException{
		
		Scanner scan = new Scanner(System.in);
		// choose day to infect and test
		System.out.println("Please type in which day to test kids.");
		String testday = scan.nextLine();
		System.out.println("Please type in which day to infect guinea pig.");
		String infectDay = scan.nextLine();
		System.out.println("testday: " + testday);
		System.out.println("infectDay: " + infectDay);
		
		
		
		
		int daysLeft = 14;
		covid GuineaPig = new covid(daysInfected, status);
		while(daysLeft-- > 0) {
			int k = 0;
			for(int i = 0; i < calendar.length; i++) {
				
				if(!(calendar[k][i] != null)) {
					if(day[i].equals(infectDay) || (daysInfected > 0 && status != "Q")) {  //this addresses a contagious kid
						++daysInfected;
						if(daysInfected == 1)
							status = "INF";
						status = "C";
					}
					
					if(day[i].equals(testday)) {  //tests kids; quarantines if contagious ONLY
						status += "T";
						if(status.equals("CT")) {
							status = "Q";
						}
						
					}
					calendar[0][i] = status;
				}
				else {
					k++;
				}
				
			}
		
		
			
		
		}
		
		for(int i = 0; i < calendar.length; i++) {
			for(int j = 0; j < calendar[i].length; j++) {
				if(calendar[i][j].equals(null))
					calendar[i][j] = "blank";
				System.out.print(calendar[i][j] + " ");
			}
			
		}

		
	}

}
