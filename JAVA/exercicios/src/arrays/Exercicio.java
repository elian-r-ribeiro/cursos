package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {

		double[] studentAGrades = new double[4];
		double finalGradeStudentA = 0;

		studentAGrades[0] = 7.9;
		studentAGrades[1] = 8;
		studentAGrades[2] = 6.7;
		studentAGrades[3] = 9.7;

		System.out.println(Arrays.toString(studentAGrades));
		System.out.println(studentAGrades[0]);
		System.out.println(studentAGrades[studentAGrades.length - 1]);

		// System.out.println(studentAGrades[4]); ERRO!

		for (int i = 0; i < studentAGrades.length; i++) {
			finalGradeStudentA += studentAGrades[i];
		}

		System.out.println(finalGradeStudentA / studentAGrades.length);

		double storagedGrade = 5.9;
		double[] studentBGrades = { 6.9, 8.9, storagedGrade, 10 };
		double finalGradeStudentB = 0;

		for (int i = 0; i < studentBGrades.length; i++) {
			finalGradeStudentB += studentBGrades[i];
		}

		System.out.println(finalGradeStudentB / studentBGrades.length);

	}
}
