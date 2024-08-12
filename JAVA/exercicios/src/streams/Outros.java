package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno s1 = new Aluno("Ana", 7.1);
        Aluno s2 = new Aluno("Luna", 6.1);
        Aluno s3 = new Aluno("Gui", 8.1);
        Aluno s4 = new Aluno("Gabi", 10);
        Aluno s5 = new Aluno("Ana", 7.1);
        Aluno s6 = new Aluno("Pedro", 6.1);
        Aluno s7 = new Aluno("Gui", 8.1);
        Aluno s8 = new Aluno("Maria", 10);
        List<Aluno> studentsList = 
        		Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);
        
        System.out.println("distinct...");
        studentsList.stream()
        .distinct()
        .forEach(System.out::println);
        
        System.out.println("\nSkip/Limit");
        studentsList.stream()
        .distinct()
        .skip(2)
        .limit(2)
        .forEach(System.out::println);
        
        System.out.println("\ntakeWhile");
        studentsList.stream()
        .distinct()
        .takeWhile(a -> a.grade >= 7)
        .forEach(System.out::println);
	}
}
