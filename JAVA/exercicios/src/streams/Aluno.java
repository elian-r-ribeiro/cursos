package streams;

import java.util.Objects;

public class Aluno {

    final String name;
    final double grade;
    final boolean goodBehavior;

    public Aluno (String name, double grade) {
        this(name, grade, true);
    }

    public Aluno (String name, double grade, boolean goodBehavior) {
        this.name = name;
        this.grade = grade;
        this.goodBehavior = goodBehavior;
    }
    
    @Override
    public String toString() {
    	return this.name + " tem nota " + this.grade;
    }

	@Override
	public int hashCode() {
		return Objects.hash(goodBehavior, grade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return goodBehavior == other.goodBehavior
				&& Double.doubleToLongBits(grade) == Double.doubleToLongBits(other.grade)
				&& Objects.equals(name, other.name);
	}
    
    
}
