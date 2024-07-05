package classe;

public class Usuario {

	String name;
	String email;
	
	public boolean equals(Object obj) {
		
		Usuario other = (Usuario) obj;
		boolean isNameEquals = other.name.equals(this.name);
		boolean isEmailEquals = other.email.equals(this.email);
		
		return isNameEquals && isEmailEquals;
	}
}
