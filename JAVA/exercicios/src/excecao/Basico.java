package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno s1 = null;
		
		try{
			printStudent(s1);
		} catch (Exception e) {
			System.err.println("Ocorreu um erro no "
					+ "momento de imprimir o nome do aluno");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.err.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	public static void printStudent(Aluno student) {
		System.out.println(student.name);
	}
}
