package oo.emcapsulamento;

public class Pessoa {

	private String name;

	private int age;
	
	public Pessoa(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		if(newAge >= 0 && newAge <= 120) {
			this.age = newAge;
		}
	}
	
	@Override
	public String toString() {
		return "Nome: " + getName() + ", Idade: " + getAge();
	}
}
