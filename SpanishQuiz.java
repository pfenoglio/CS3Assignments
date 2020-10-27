import java.io.*;
import java.util.*;
public class SpanishQuiz {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(new File("spanishquiz.dat"));
		Map<String, String> myMap = new HashMap<String, String>() {{
	        put("Mexico D.F.", "Mexico");
	        put("Guatemala", "Guatemala");
	        put("Tegucigalpa","Honduras");  
	        put("San Salvador","El Salvador");
	        put("Managua","Nicaragua");
	        put("San Jose","Cosa Rica");
	        put("Panema","Panema");
	        put("Caracas","Venezuela");
	        put("Bogota","Colombia");
	        put("Quito","Ecuador");
	        put("Lima","Peru");
	        put("La Paz","Bolivia");
	        put("Asuncion","Paraguay");
	        put("Santiago","Chile");
	        put("Buenos Aires","Argentina");
	        put("Montevideo","Uruguay");
	        put("Brasilia","Brazil");
	    }};
	    Map<String, String> myMap2 = new HashMap<String, String>() {{
	        put("Mexico","Mexico D.F.");
	        put( "Guatemala","Guatemala");
	        put("Honduras","Tegucigalpa");  
	        put("El Salvador","San Salvador");
	        put("Nicaragua","Managua");
	        put("Cosa Rica","San Jose");
	        put("Panema","Panema");
	        put("Venezuela","Caracas");
	        put("Colombia","Bogota");
	        put("Ecuador","Quito");
	        put("Peru","Lima");
	        put("Bolivia","La Paz");
	        put("Paraguay","Asuncion");
	        put("Chile","Santiago");
	        put("Argentina","Buenos Aires");
	        put("Uruguay","Montevideo");
	        put("Brazil","Brasilia");
	    }};
	    int count = scan.nextInt();
	    scan.nextLine();
	    while(count-->0) {
	    	String[] input = scan.nextLine().replaceAll("[^a-zA-Z ]", "").trim().split("\\s+");
	    	if(!input[0].equals("What")) {
	    		String out = myMap.get(input[0]);
	    		System.out.println(input[0]+" is the capital city of "+out+".");
	    	}
	    	else if(!input[input.length-1].equals("country")) {
	    		String out = myMap2.get(input[input.length-1]);
	    		System.out.println(out+" is the capital city of "+input[input.length-1]+".");
	    	}
	    }
	}

}
