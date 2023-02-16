/**
 * This is the Apartment class that inherits from Residential that allows you to
 * create a apartment
 * 
 * @author Chase Hall
 * @version 2-16-23 Project 1 CS131
 */
public class Apartment extends Residential {
	private int numRentableUnits;// used to know how many rentable units there
	private double avgUnitSize;// used to tell the average size of a unit
	private boolean parkingAvailable;// used to know if there is parking available

	/**
	 * Allows you to create a apartment without any data
	 */

	public Apartment() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0;
		this.occupancyGroup = "";
		this.subGroup = "";
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
		this.numRentableUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = false;
	}// end constructor

	/**
	 * Allows you to create a apartment with some data
	 * 
	 * @param projectName     used to name project through calling method
	 * @param completeAddress used to give address through calling method
	 * @param totalSquareFeet used to set the area through calling method
	 * @param occupancyGroup  used to set the occupancy group through calling method
	 * @param subGroup        used to set the subgroup through calling method
	 */

	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
		this.numRentableUnits = 0;
		this.avgUnitSize = 0;
		this.parkingAvailable = false;
	}// end constructor

	/**
	 * Draw will eventually be used to draw to object to the screen
	 */

	public void draw() {
		System.out.println("Drawing code for a apartment");

	}// end draw

	/**
	 * Display data is used to display all the data of a certain apartment
	 */

	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("       Apartment").append(System.lineSeparator());
		sb.append("------------------------").append(System.lineSeparator());
		sb.append("Project Name: " + projectName).append(System.lineSeparator());
		sb.append("Address: " + completeAddress).append(System.lineSeparator());
		sb.append("Square Feet: " + totalSquareFeet).append(System.lineSeparator());
		sb.append("Occupancy Group: " + occupancyGroup).append(System.lineSeparator());
		sb.append("Occupancy Subgroup: " + subGroup).append(System.lineSeparator());
		sb.append("Number of Bedrooms: " + numBedrooms).append(System.lineSeparator());
		sb.append("Number of Bathrooms: " + numBathrooms).append(System.lineSeparator());
		sb.append("Laundry Room: " + laundryRoom).append(System.lineSeparator());
		sb.append("Number of Rentable Units: " + numRentableUnits).append(System.lineSeparator());
		sb.append("Average Unit Size: " + avgUnitSize).append(System.lineSeparator());
		sb.append("Parking Available: " + parkingAvailable);

		String Data = sb.toString();
		return Data;
	}// end displayData

	/**
	 * Outputs the amount of rentable units
	 * 
	 * @return number of rentable units
	 */

	public int getNumRentableUnits() {
		return numRentableUnits;
	}// end getNumRentableUnits

	/**
	 * Allows you to set the number of rentable units
	 * 
	 * @param numRentableUnits allows you to set it through calling method
	 */

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}// end setNumRentableUnits

	/**
	 * Outputs the size of the unit
	 * 
	 * @return average unit size
	 */

	public double getAvgUnitSize() {
		return avgUnitSize;
	}// end getAvgUnitSize

	/**
	 * Allows you to set the average size of the apartments
	 * 
	 * @param avgUnitSize allows you to set it through calling method
	 */

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}// end setAvgUnitSize

	/**
	 * Outputs if there is parking or not
	 * 
	 * @return true or false if there is parking available
	 */

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}// end isParkingAvalible

	/**
	 * Allows you to set if there is parking available
	 * 
	 * @param parkingAvailable allows you to set true or false through calling
	 *                         method
	 */

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	/**
	 * Does the same thing as display data
	 */

	public String toString() {
		return displayData();
	}// end toString

}// end class
