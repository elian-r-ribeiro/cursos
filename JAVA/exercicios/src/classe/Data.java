package classe;

public class Data {

	int day;
	int month;
	int year;
	
	Data(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year; 
	}
	
	Data(){
		this(1, 1, 1970);
	}
	
	void printFullDate() {
		System.err.println(this.getFullDate());
	}
	
	String getFullDate() {
		final String format = "%d/%d/%d";
		return String.format(format, this.day, this.month, this.year);
	}
}
