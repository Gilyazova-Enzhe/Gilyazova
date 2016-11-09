import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Event {
	
	String name;
	Calendar calendar = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	Event (String name, String date) {
		try{ 
			this.name = name;
			calendar.setTime(sdf.parse(date));
		} catch (ParseException e) {
			System.out.println("Write date in format: day/month/year");
		}
	}
	
	public String toString() {
		return "Event: " + name + "Date: " + sdf.format(calendar.getTime());
	}
}