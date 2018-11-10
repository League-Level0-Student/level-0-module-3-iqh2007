
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "September 5th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String Birthday = JOptionPane.showInputDialog("Which birthday do you want to know?");

		// 3. Print out what the user typed
		System.out.println(Birthday);

		// 4. if user asked for "mom"
		if (Birthday.equals("mom")) {
			// print mom's birthday
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
		
		else if(Birthday.equals("dad")) {	
		// print dad's birthday
		System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
		else if(Birthday.equals("mine")) {
		// print myBirthday
		System.out.println(myBirthday);							}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		
	}
}
