package loops;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	
String starsign = JOptionPane.showInputDialog("what is your star sign?");	
	
if (starsign.equals("Virgo")) {
	JOptionPane.showMessageDialog(null, "Particular, logical, practical, sense of duty, critical.");
	
}
if (starsign.equals("Scorpio")){
JOptionPane.showMessageDialog(null, "Passionate, exacting, loves extremes, combative, reflective.");	
		
		
		
}
if (starsign.equals("Gemini")) {
JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.\n" + 
		"");	
	
	
}
}



}


