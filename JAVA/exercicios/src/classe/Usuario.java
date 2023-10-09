package classe;

public class Usuario {
	String name;
	String email;

	public boolean equals(Object object) {
		Usuario other = (Usuario) object;

		if (object instanceof Usuario) {
			boolean nameIsEquals = other.name.equals(this.name);
			boolean emailIsEquals = other.email.equals(this.email);
			return nameIsEquals && emailIsEquals;
		} else {
			return false;
		}
	}
}
