package Main;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {

		JFrame window = new JFrame("Maryville Monopoly");
		window.add(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}
}
