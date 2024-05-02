import ui.GUI;

public class Main {

	public static void main(String[] args) {

		System.out.println("demarrage de l application");
		
		javax.swing.SwingUtilities.invokeLater(GUI::new);
	}

}
