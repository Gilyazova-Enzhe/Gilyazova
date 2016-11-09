import java.util.Scanner;
import java.util.ArrayList;

public class Diary {
	public static void main (String[] args) {
		ArrayList<Event> listEvent = new ArrayList<Event>(); 
		Scanner sc = new Scanner(System.in);
		String event;
		String date;
		while (sc.hasNextLine()) { 
			String command = sc.nextLine();
			switch (command) { //проверка введенных данных
				case "add event": 
					event = sc.nextLine();
					date = sc.nextLine();
					listEvent.add(new Event(event, date));
					break;
				case "print list": 
					for (int i = 0; i < listEvent.size(); i++) {
						Event eventObj = listEvent.get(i); 
						System.out.println(eventObj.toString());
					}
			}
		}
		
	}
}