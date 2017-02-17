import com.sda.carinspecation.data.CarsRecord;
import com.sda.carinspection.control.DoorControl;
import com.sda.carinspection.control.InspectionProcess;
import com.sda.carinspspection.model.Inspection;
import com.sda.carinspspection.model.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		InspectionProcess inspectionProcess = new InspectionProcess();
		CarsRecord cr = new CarsRecord();
//		Vehicle v = new Vehicle();
		
		Inspection inspection = new Inspection(5000,"Breaks",false);
		DoorControl doorControl=new DoorControl();
		doorControl.doorSwitchOn();
		doorControl.doorSwitchOff();
		inspectionProcess.getNewVehicle().setLicensNumber(111222);
		inspectionProcess.getNewVehicle().setRequiredInspections(inspection);
		inspectionProcess.getNewVehicle().addInspection("Kaan", 3000, false);
		System.out.println(inspectionProcess.getNewVehicle().getRequiredInspections().size());
		System.out.println(inspectionProcess.getNewVehicle().caluculateCost());
		cr.addVehicle(111222, inspectionProcess.getNewVehicle());
		inspectionProcess.startNewInspection(111222);
		cr.addVehicle(898798797, inspectionProcess.getNewVehicle());
		inspectionProcess.startNewInspection(111222);
		inspectionProcess.printResults();
	}

}
