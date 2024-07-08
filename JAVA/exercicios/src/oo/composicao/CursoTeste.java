package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno student1 = new Aluno("João");
		Aluno student2 = new Aluno("Maria");
		Aluno student3 = new Aluno("Pedro");
		Curso course1 = new Curso("Java completo");
		Curso course2 = new Curso("Web 2023");
		Curso course3 = new Curso("React Native");
		
		course1.addStudent(student1);
		course1.addStudent(student2);
		course2.addStudent(student1);
		course2.addStudent(student3);
		student1.addCourse(course3);
		student2.addCourse(course3);
		student3.addCourse(course3);
		
		for(Aluno student: course3.students) {
			System.out.println("Estou matriculado no curso "
					+ course3.name + "...");
			System.out.println("...e meu nome é " + student.name);
			System.out.println();
		}
		
		System.out.println(student1.courses.get(0).students);
		
		Curso foundCourse = student1.getCourseByName("Java Completo");
		
		if(foundCourse != null) {
			System.out.println(foundCourse.name);
			System.out.println(foundCourse.students);
		}
	}
}
