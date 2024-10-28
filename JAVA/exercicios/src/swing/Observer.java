package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observer {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Observador");
		JButton button = new JButton("Clicar!");
		
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(600, 200);
		window.setLocationRelativeTo(null); // Centralizar na tela do computador
		window.setLayout(new FlowLayout());
		window.add(button);
		window.setVisible(true);
		
		button.addActionListener(e -> {
			System.out.println("Botão clicado!");
		});
	}
}
