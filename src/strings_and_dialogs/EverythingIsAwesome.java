package strings_and_dialogs;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	
	public static void main(String[] args) {
		
		String thing1 = JOptionPane.showInputDialog("type something");
		
		JOptionPane.showMessageDialog(null, thing1 + " is awesome!");
		
	}

}
