package OceanFleet;

import java.util.List;

public class VesselUtil {
private List<Vessel> vesselList;

public VesselUtil() {
	this.vesselList=vesselList;
}

//add vessel
public void addVesselPerformance(Vessel vessel) {
	vesselList.add(vessel);
	System.out.println("Data Added Successfully !!!!!!!!");
}

//search by id 
public Vessel getVesselById(String vesselId) {
    for (Vessel v : vesselList) {
        if (v.getVesselId().equals(vesselId)) {
            return v;
        }
    }
    return null;
}


//get highest performance
public List<Vessel> getHighPerformanceVessels() {
	double max=Integer.MIN_VALUE;
	
	
	//getting the max 
	for (Vessel vessel : vesselList) {
		if(vessel.getAverageSpeed()>max) {
			max=vessel.getAverageSpeed();
		}
	}
	
	
	//now print it 
	for (Vessel vessel : vesselList) {
		if(vessel.getAverageSpeed()==max) {
			return vesselList;
		}
	}
	
	return null;	
}

}
