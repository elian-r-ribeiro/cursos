package classe;

public class Data {

	int day;
	int month;
	int year;
	
	Data(int firstDay, int firstMonth, int firstYear) {
		day = firstDay;
		month = firstMonth;
		year = firstYear;
	}
	
	Data(){
		day = 01;
		month = 01;
		year = 1970;
	}
	
	String getFullDate() {
		return String.format("%d/%d/%d", day, month, year);
	}
}
