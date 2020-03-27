package daily.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Logs {
	String id;
	String logs;

	Logs(String id, String logs) {
		this.id = id;
		this.logs = logs;
	}
}

public class ReOrderLogs {

	public String[] reorderLogFiles(String[] logs) {

		String result[] = new String[logs.length];
		ArrayList<Logs> character = new ArrayList<Logs>();
		ArrayList<String> digit = new ArrayList<String>();

		for (String str : logs) {

			int index = str.indexOf(" ");

			String id = str.substring(0, index);
			String log = str.substring(index + 1);

			if (  Character.isDigit(log.charAt(0))) {
				digit.add(str);
			} else {
				character.add(new Logs(id, log));
			}
		} 
		
		Collections.sort(character,new Comparator<Logs>() {

			@Override
			public int compare(Logs o1, Logs o2) {
				// TODO Auto-generated method stub 
				
				if(o1.logs.compareTo(o2.logs)==0) { 
					return o1.id.compareTo(o2.id);
				}
				
				return o1.logs.compareTo(o2.logs);
			}
			
		});
		
		int i = 0;

		for (Logs log : character) {

			result[i++] = log.id + " " + log.logs;
		}

		for (String s : digit) {
			result[i++] = s;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReOrderLogs R = new ReOrderLogs();

		String logs[] = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };
        String out[]=R.reorderLogFiles(logs); 
        
       for(String ss :out) { 
    	   System.out.println(ss); 
       }
        
		

	}

}
