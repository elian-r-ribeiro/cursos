package oo.encapsulamento;

public class Pessoa {

	private String name;
	private String surname;
	private int age;

	public Pessoa(String name, String surname, int age) {
		setName(name);
		setSurname(surname);
		setAge(age);
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
			return;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getFullName() {
		return this.name + " " + this.surname;
	}

	@Override
	public String toString() {
		return "Olá, eu sou o " + getFullName() + " e tenho " + age + " anos";
	}
}
