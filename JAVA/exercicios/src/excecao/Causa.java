package excecao;

public class Causa {

	public static void main(String[] args) {
		
		try {
			methodA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		methodA(null);
	}
	
	static void methodA(Aluno student) {
		try {
			methodB(student);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	static void methodB(Aluno student) {
		if(student == null) {
			throw new NullPointerException("Aluno está nulo!");
		}
		
		System.out.println(student.name);
	}
}
