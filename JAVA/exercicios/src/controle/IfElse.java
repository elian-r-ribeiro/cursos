package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Informe o número: ");
		int number = Integer.parseInt(value);
		
		if(number % 2 == 0) {
			System.out.println("Número par!");
		}else if(number % 2 == 1){
			System.out.println("Número ímpar!");
		}
	}
}
