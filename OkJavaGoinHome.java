import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import javax.swing.JOptionPane;
import org.opentutorials.iot.DimmingLights;
public class OkJavaGoinHome {

	public static void main(String[] args) {
		String id = args[0];
		String bright = args[1];
//		String id = JOptionPane.showInputDialog("Enter a ID");
//		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		// TODO Auto-generated method stub
		//Elevator call
//		org.opentutorials.iot.Elevator myElevator = new org.openturtorials.iot.Elevator("JAVA APT507");
		Elevator myElevator = new Elevator("id");
		myElevator.callForUp(1);
		//Security off
		Security mySecurity =new Security("id");
		mySecurity.off();
		//Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id+ " / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		}

}
