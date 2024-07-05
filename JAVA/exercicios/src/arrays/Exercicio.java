package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double totalGradeA = 0;
		double totalGradeB = 0;
		double[] gradesStudentA = new double[4];
		double[] gradesStudentB = {6.9, 8.9, 5.5, 10};
		
		gradesStudentA[0] = 7.9;
		gradesStudentA[1] = 8;
		gradesStudentA[2] = 6.7;
		gradesStudentA[3] = 9.7;
		
		for(int i = 0; i < gradesStudentA.length; i++) {
			totalGradeA += gradesStudentA[i];
		}
		for (int i = 0; i < gradesStudentB.length; i++) {
			totalGradeB += gradesStudentB[i];
		}
		
		System.out.println(Arrays.toString(gradesStudentA));
		System.out.println(Arrays.toString(gradesStudentB));
		System.out.println(totalGradeA / gradesStudentA.length);
		System.out.println(totalGradeB / gradesStudentB.length);
	}
}
