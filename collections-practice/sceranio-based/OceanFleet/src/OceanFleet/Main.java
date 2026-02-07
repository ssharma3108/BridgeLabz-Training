package OceanFleet;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	
	VesselUtil vesselUtil=new VesselUtil();
	
	System.out.println("Enter the number of vessels to be added -: ");
	int n=scanner.nextInt();
	scanner.nextLine();
	
	for(int i=1;i<=n;i++) {
	String input=scanner.nextLine();
	
	
	String [] dataStrings=input.split(":");
	
	String idString=dataStrings[0];
	String nameString=dataStrings[1];
	double average=Double.parseDouble(dataStrings[2]);
	String vType=dataStrings[3];
	
	vesselUtil.addVesselPerformance(new Vessel(idString, nameString, average, vType));
	}
	
	System.out.println("Enter the vessel id to check -: ");
	String idString=scanner.next();
	
	vesselUtil.getVesselById(idString);
	
	
	System.err.println("High performance vessels are -: ");
	vesselUtil.getHighPerformanceVessels();
	
	
	
	
}
}
