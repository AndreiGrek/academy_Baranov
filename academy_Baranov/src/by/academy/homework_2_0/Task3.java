package by.academy.homework_2_0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//2. Написать RegExp который проверял бы введенную дату на соответствие патерна:
//	   a) dd/MM/yyyy
//	   b) dd-MM-yyyy 

public class Task3 {
	
	public static Pattern p1 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0]?[1-9]|1[0-2])/\\d{4}"); // для а
	public static Pattern p2 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|1[0-2])-\\d{4}"); // для b
	
	public static void main(String[] args) {
		String[] tests1 = {"50/50/9999", "00/00/00", "13/12/2020", "9/9/2020"};
		String[] tests2 = {"50-50-9999", "00-00-00", "13-12-2020", "9-9-2020"};
		
		
		
		
		
	    for (String t: tests1) {
	    	Matcher m1 = p1.matcher(t);
	    	if (m1.find()) {
	    		System.out.println(m1.group(0));
	    	} else {
	    		System.out.println("failed");
	    	}
	    }
	    
	    for (String t: tests2) {
	    	Matcher m2 = p2.matcher(t);
	    	if (m2.find()) {
	    		System.out.println(m2.group(0));
	    	} else {
	    		System.out.println("failed");
	    	}
	    }
	}
public static boolean isValiDateString(String stringDate) {
	
	 Matcher m1 = p1.matcher(stringDate);
     if (m1.find()) {
         return true;
     }
     Matcher m2 = p2.matcher(stringDate);
     if (m2.find()) {
         return true;
     }
	return false;
	
}
}

