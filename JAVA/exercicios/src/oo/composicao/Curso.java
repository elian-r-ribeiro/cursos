package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String name;
	final List<Aluno> students = new ArrayList<>();
	
	Curso(String name){
		this.name = name;
	}
	
	void addStudent(Aluno student) {
		this.students.add(student);
		student.courses.add(this);
	}
}
