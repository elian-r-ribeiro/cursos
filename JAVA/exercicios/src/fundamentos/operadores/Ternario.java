package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 7;
		
		String resultadoFinal = passouPorMedia ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim." : "não.";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
