package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void user(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if(aluno.name == null || aluno.name.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.grade < 0 || aluno.grade > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
