package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno s1 = new Aluno("Ana", 7.1);
        Aluno s2 = new Aluno("Luna", 6.1);
        Aluno s3 = new Aluno("Gui", 8.1);
        Aluno s4 = new Aluno("Gabi", 10);
        List<Aluno> studentsList = Arrays.asList(s1, s2, s3, s4);
        Predicate<Aluno> approved = a -> a.grade >= 7;
        
        System.out.println(studentsList.stream().allMatch(approved));
        System.out.println(studentsList.stream().anyMatch(approved));
        System.out.println(studentsList.stream().noneMatch(approved));
	}
}
