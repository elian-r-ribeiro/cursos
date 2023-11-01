package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String name;
	final List<Curso> courses = new ArrayList<>();

	Aluno(String name) {
		this.name = name;
	}

	void addCourse(Curso course) {
		this.courses.add(course);
		course.students.add(this);
	}

	Curso getCourseByName(String name) {
		for (Curso course : this.courses) {
			if (course.name.equalsIgnoreCase(name)) {
				return course;
			}
		}

		return null;
	}

	public String toString() {
		return name;
	}
}
