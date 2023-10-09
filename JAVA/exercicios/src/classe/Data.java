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

	Data() {
		this(1, 1, 1970);
	}

	String getDateInBrazilianType() {
		final String dateFormat = "%d/%d/%d";
		return String.format(dateFormat, this.day, this.month, this.year);
	}

	void printDataInBrazilianType() {
		System.out.println(this.getDateInBrazilianType());
	}

}
