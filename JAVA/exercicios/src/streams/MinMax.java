package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno s1 = new Aluno("Ana", 7.1);
        Aluno s2 = new Aluno("Luna", 6.1);
        Aluno s3 = new Aluno("Gui", 8.1);
        Aluno s4 = new Aluno("Gabi", 10);
        List<Aluno> studentsList = Arrays.asList(s1, s2, s3, s4);
        Comparator<Aluno> bestGrade = (student1, student2) -> {
        	if(student1.grade > student2.grade) return 1;
        	if(student1.grade < student2.grade) return -1;
        	return 0;
        };
        
        System.out.println(studentsList.stream().max(bestGrade).get());
        System.out.println(studentsList.stream().min(bestGrade).get());
	}
}
