

package loops;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	private static int i;

	public static void main(String[] args) {
		
		// 2. Ask the user how many shiny objects they want
		
String shiny = JOptionPane.showInputDialog(null, "How any shiny objects do you want?");
		
	int shinyobject = Integer.parseInt(shiny);	

		// 3. Play the sound that many times
		
	for(int i=0; i<shinyobject; i++) {
		
		

		// 1. Call the method below
		
		playMisterZee();	
		}

	}

	public static void playMisterZee() {
		try {
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
