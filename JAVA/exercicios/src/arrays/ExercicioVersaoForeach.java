package arrays;

public class ExercicioVersaoForeach {

	public static void main(String[] args) {

		double[] studentAGrades = new double[4];
		double finalStudentAGrade = 0;

		studentAGrades[0] = 7.9;
		studentAGrades[1] = 8;
		studentAGrades[2] = 6.7;
		studentAGrades[3] = 9.7;

		for (double studentAGrade : studentAGrades) {
			finalStudentAGrade += studentAGrade;
			System.out.print("[" + studentAGrade + "]");
		}

		System.out.println("\n" + finalStudentAGrade / studentAGrades.length);

		double storagedGrade = 5.9;
		double[] studentBGrades = { 6.9, 8.9, storagedGrade, 10 };
		double finalStudentBGrade = 0;

		for (double studentBGrade : studentBGrades) {
			System.out.print("[" + studentBGrade + "]");
			finalStudentBGrade += studentBGrade;
		}

		System.out.println("\n" + finalStudentBGrade / studentBGrades.length);
	}
}
