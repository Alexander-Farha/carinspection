import com.sda.carinspecation.data.CarsRecord;
import com.sda.carinspection.control.DoorControl;
import com.sda.carinspection.control.InspectionProcess;
import com.sda.carinspspection.model.Vehicle;

public class Main {

	public static void main(String[] args) {
		InspectionProcess inspectionProcess = new InspectionProcess();
		inspectionProcess.startNewInspection();
		DoorControl doorControl=new DoorControl();
		doorControl.doorSwitchOn();
		doorControl.doorSwitchOff();
		CarsRecord cr = new CarsRecord();
		Vehicle v = new Vehicle();
		cr.addVehicle(111222, v);
		v.getRequiredInspections().add();
		System.out.println();
	}

}
