package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

	//I Just Did Their Last Names Since This is a Zoom Class	
	// 1. Save something remarkable about each person in a variable.
 String daniel = "His last name is Suh!";
 String ian = "His last name is Saam!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
 String enterName = JOptionPane.showInputDialog("Enter a name:");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
 if(enterName.equalsIgnoreCase("ian")) {
	 JOptionPane.showMessageDialog(null, ian);
 } else {
	 if(enterName.equalsIgnoreCase("daniel")) {
		 JOptionPane.showMessageDialog(null, daniel);
	 } else {
		 JOptionPane.showMessageDialog(null, "Unknown Person.");
	 }
 }
	}
}

