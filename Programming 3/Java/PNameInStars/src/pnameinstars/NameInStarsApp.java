package pnameinstars;

import javax.swing.JOptionPane;

public class NameInStarsApp {

	public static void main(String[] args) {
		String userName = JOptionPane.showInputDialog("Enter your Name: ");
		
		NameInStars you = new NameInStars(userName);
		
		JOptionPane.showMessageDialog(null,you.surroundNameInStars());
	}

}
