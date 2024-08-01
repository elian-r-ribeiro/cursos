package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        
        Aluno s1 = new Aluno("Ana", 7.8);
        Aluno s2 = new Aluno("Bia", 5.8);
        Aluno s3 = new Aluno("Daniel", 9.8);
        Aluno s4 = new Aluno("Gui", 6.8);
        Aluno s5 = new Aluno("Rebeca", 7.1);
        Aluno s6 = new Aluno("Pedro", 8.8);
        List<Aluno> students = Arrays.asList(s1, s2, s3, s4, s5, s6);

        students.stream().filter(Utilitarios.checkIfStudentIsApproved)
        .map(Utilitarios.congratsApproved).forEach(Utilitarios.println);
    }
}
