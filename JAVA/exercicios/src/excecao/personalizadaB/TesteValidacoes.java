package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -7);
			
			Validar.user(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
