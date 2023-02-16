/**
 * This is the Application object that will launch our application
 * 
 * @author Chase Hall
 * @version 2-16-23 Project 1 CS131
 */
public class Application {
	/**
	 * Default
	 */
	Application() {

	}

	/**
	 * Main loop of application
	 * 
	 * @param args arguments of main method
	 */
	public static void main(String[] args) {
		Building b1 = new Building();
		Building b2 = new Building("Mall of America", "405 Main Street, Minneapolis Minnesota, 55111", 80000,
				"Buisness", "B1");
		Business b3 = new Business();
		Business b4 = new Business("Mall of America", "405 Main Street, Minneapolis Minnesota, 55111", 80000,
				"Buisness", "B1");
		Mall m1 = new Mall();
		Mall m2 = new Mall("Mall of America", "405 Main Street, Minneapolis, Minnesota 55111", 80000, "Buisness", "B1");
		Residential r1 = new Residential();
		Residential r2 = new Residential("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450,
				"Residential", "R-1");
		Apartment a1 = new Apartment();
		Apartment a2 = new Apartment("Zacks Apartment", "278 South Road, Louisville,Kentucky 40201 ", 1400,
				"Residential", "R-3");
		SingleFamilyHome s1 = new SingleFamilyHome();
		SingleFamilyHome s2 = new SingleFamilyHome("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450,
				"Residential", "R-1");

		b1.setProjectName("Mall of Europe");
		b1.setCompleteAddress("169 Main Street, London, England E1");
		b1.setTotalSquareFeet(69000);
		b1.setOccupancyGroup("Business");
		b1.setSubGroup("B1");
		System.out.println(b1.getProjectName());
		System.out.println(b1.getCompleteAddress());
		System.out.println(b1.getTotalSquareFeet());
		System.out.println(b1.getOccupancyGroup());
		System.out.println(b1.getSubGroup());
		b1.draw();
		System.out.println(b1.toString());

		System.out.println("                       ");

		b3.setProjectName("Mall of Europe");
		b3.setCompleteAddress("169 Main Street, London, England E1");
		b3.setTotalSquareFeet(69000);
		b3.setOccupancyGroup("Business");
		b3.setSubGroup("B1");
		b3.setNumRentableUnits(300);
		System.out.println(b3.getProjectName());
		System.out.println(b3.getCompleteAddress());
		System.out.println(b3.getTotalSquareFeet());
		System.out.println(b3.getOccupancyGroup());
		System.out.println(b3.getSubGroup());
		System.out.println(b3.getNumRentableUnits());
		b3.draw();
		System.out.println(b3.toString());

		System.out.println("                       ");

		m1.setProjectName("Mall of Europe");
		m1.setCompleteAddress("169 Main Street, London, England E1");
		m1.setTotalSquareFeet(69000);
		m1.setOccupancyGroup("Business");
		m1.setSubGroup("B1");
		m1.setNumRentableUnits(300);
		m1.setMedianUnitSize(1400);
		m1.setNumParkingSpaces(2500);
		m1.setNumRentedUnits(250);
		System.out.println(m1.getProjectName());
		System.out.println(m1.getCompleteAddress());
		System.out.println(m1.getTotalSquareFeet());
		System.out.println(m1.getOccupancyGroup());
		System.out.println(m1.getSubGroup());
		System.out.println(m1.getNumRentableUnits());
		System.out.println(m1.getMedianUnitSize());
		System.out.println(m1.getNumParkingSpaces());
		System.out.println(m1.getNumRentedUnits());
		m1.draw();
		System.out.println(m1.toString());

		System.out.println("                       ");

		r1.setProjectName("Coles House");
		r1.setCompleteAddress("420 Chester Street, Louisville,Kentucky 40201");
		r1.setTotalSquareFeet(2000);
		r1.setOccupancyGroup("Residential");
		r1.setSubGroup("R-1");
		r1.setLaundryRoom(true);
		r1.setNumBathrooms(2);
		r1.setNumBedrooms(3);
		System.out.println(r1.getProjectName());
		System.out.println(r1.getCompleteAddress());
		System.out.println(r1.getTotalSquareFeet());
		System.out.println(r1.getOccupancyGroup());
		System.out.println(r1.getSubGroup());
		System.out.println(r1.isLaundryRoom());
		System.out.println(r1.getNumBathrooms());
		System.out.println(r1.getNumBedrooms());
		r1.draw();
		System.out.println(r1.toString());

		System.out.println("                       ");

		a1.setProjectName("Mikes Apartment");
		a1.setCompleteAddress("361 Main Street, Louisville,Kentucky 40201");
		a1.setTotalSquareFeet(1400);
		a1.setOccupancyGroup("Residential");
		a1.setSubGroup("R-3");
		a1.setNumBathrooms(2);
		a1.setNumBedrooms(2);
		a1.setLaundryRoom(true);
		a1.setAvgUnitSize(1200);
		a1.setNumRentableUnits(250);
		a1.setParkingAvailable(true);
		System.out.println(a1.getProjectName());
		System.out.println(a1.getCompleteAddress());
		System.out.println(a1.getTotalSquareFeet());
		System.out.println(a1.getOccupancyGroup());
		System.out.println(a1.getSubGroup());
		System.out.println(a1.getNumBathrooms());
		System.out.println(a1.getNumBedrooms());
		System.out.println(a1.isLaundryRoom());
		System.out.println(a1.getAvgUnitSize());
		System.out.println(a1.getNumRentableUnits());
		System.out.println(a1.isParkingAvailable());
		a1.draw();
		System.out.println(a1.toString());

		System.out.println("                       ");

		s1.setProjectName("Coles House");
		s1.setCompleteAddress("420 Chester Street, Louisville,Kentucky 40201");
		s1.setTotalSquareFeet(2000);
		s1.setOccupancyGroup("Residential");
		s1.setSubGroup("R-1");
		s1.setLaundryRoom(false);
		s1.setNumBathrooms(2);
		s1.setNumBedrooms(4);
		s1.setGarage(true);
		System.out.println(s1.getProjectName());
		System.out.println(s1.getCompleteAddress());
		System.out.println(s1.getTotalSquareFeet());
		System.out.println(s1.getOccupancyGroup());
		System.out.println(s1.getSubGroup());
		System.out.println(s1.isLaundryRoom());
		System.out.println(s1.getNumBathrooms());
		System.out.println(s1.getNumBedrooms());
		System.out.println(s1.isGarage());
		s1.draw();
		System.out.println(s1.toString());

		System.out.println("                       ");

		System.out.println(b1.displayData());
		System.out.println("                       ");
		System.out.println(m1.displayData());
		System.out.println("                       ");
		System.out.println(a1.displayData());
		System.out.println("                       ");
		System.out.println(s1.displayData());

	}// end main

}// end class
