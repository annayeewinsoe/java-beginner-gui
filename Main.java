import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//name
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Name: " + name);
		// age
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "Age: " + age);
		// height
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
		JOptionPane.showMessageDialog(null, "Height: " + height + " cm");
	}

}
