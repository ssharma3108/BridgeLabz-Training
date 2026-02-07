package OceanFleet;

public class Vessel {
	//variables 
String vesselId;
String vesselName;
double averageSpeed;
String vesselType;

//constructor
Vessel(String vesselId, String vesselName,double averageSpeed,String vesselType) {
	this.vesselId=vesselId;
	this.vesselName=vesselName;
	this.averageSpeed=averageSpeed;
	this.vesselType=vesselType;
}

//make getter and setter
public double getAverageSpeed() {
	return averageSpeed;
}
public String getVesselId() {
	return vesselId;
}
public String getVesselName() {
	return vesselName;
}
public String getVesselType() {
	return vesselType;
}

}
