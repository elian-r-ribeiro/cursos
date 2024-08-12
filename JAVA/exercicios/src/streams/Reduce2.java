package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

    public static void main(String[] args) {
        
        Aluno s1 = new Aluno("Ana", 7.1);
        Aluno s2 = new Aluno("Luna", 6.1);
        Aluno s3 = new Aluno("Gui", 8.1);
        Aluno s4 = new Aluno("Gabi", 10);
        Predicate<Aluno> approved = a -> a.grade >= 7;
        Function<Aluno, Double> onlyGrade = a -> a.grade;
        BinaryOperator<Double> add = (a, b) -> a + b;
        List<Aluno> studentsList = Arrays.asList(s1, s2, s3, s4);

        studentsList.stream()
        .filter(approved)
        .map(onlyGrade)
        .reduce(add)
        .ifPresent(System.out::println);
    }
}
