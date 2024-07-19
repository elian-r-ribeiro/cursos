package oo.emcapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", 30);
		
		System.out.println(p1.toString());
		
		p1.setName("Pedro");
		p1.setAge(40);
		
		System.out.println(p1.toString());
	}
}
