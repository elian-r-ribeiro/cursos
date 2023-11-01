package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro", "De Lara", -30);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1);

		p1.setAge(35);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1);

		p1.setAge(400);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1);
	}
}
