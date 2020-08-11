package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String birthday = JOptionPane.showInputDialog("What is your birthday? Example: 05/30");
		if(birthday.equalsIgnoreCase("08/11")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Well then Have have Very Merry UnBirthday!");
		}

}
}
