package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	final String name;
	final ArrayList<Curso> courses = new ArrayList<>();
	
	Aluno(String name) {
		this.name = name;
	}
	
	Curso getCourseByName(String name) {
		for(Curso course: this.courses) {
			if (course.name.equalsIgnoreCase(name)) {
				return course;
			}
		}
		
		return null;
	}
	
	void addCourse(Curso course) {
		this.courses.add(course);
		course.students.add(this);
	}
	
	public String toString() {
		return name;
	}
}
