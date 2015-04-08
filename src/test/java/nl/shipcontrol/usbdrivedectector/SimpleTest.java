package nl.shipcontrol.usbdrivedectector;

import nl.shipcontrol.usbdrivedectector.events.IUSBDriveListener;
import nl.shipcontrol.usbdrivedectector.events.USBStorageEvent;

/**
 *
 * @author samuelcampos
 */
public class SimpleTest implements IUSBDriveListener{
    public static void main(String[] args) {
		USBDeviceDetectorManager driveDetector = new USBDeviceDetectorManager();

		for (USBStorageDevice rmDevice : driveDetector.getRemovableDevices()) {

			System.out.println(rmDevice);
		}
        
        SimpleTest sTest = new SimpleTest();
        
        driveDetector.addDriveListener(sTest);
	}
    
    private SimpleTest () {
        
    }

    @Override
    public void usbDriveEvent(USBStorageEvent event) {
        System.out.println(event);
    }
}
