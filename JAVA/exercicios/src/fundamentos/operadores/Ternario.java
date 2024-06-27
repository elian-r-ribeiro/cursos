package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;
		String resultadoFinal = passouPorMedia ? 
				"aprovado." : "em recuperação.";
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("O aluno está " + resultadoFinal);
		System.out.println("Tem desconto? " + resultado);
	}
}
