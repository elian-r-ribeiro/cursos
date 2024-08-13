package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			generateError1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			generateError2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	// Não checada ou não verificada
	static void generateError1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}
	
	// Checada ou verificada
	static void generateError2() throws Exception {
		throw new Exception("Ocorreu um erro #02");
	}
}
