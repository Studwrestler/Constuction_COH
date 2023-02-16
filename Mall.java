/**
 * This is the Mall class that inherits from Business that allows you to create
 * a Mall building
 * 
 * @author Chase Hall
 * @version 2-16-23 Project 1 CS131
 */
public class Mall extends Business {
	private int numRentedUnits; // used to know how many units are rented
	private double medianUnitSize; // used to tell the median size of a unit
	private int numParkingSpaces; // used to tell how many parking spaces there are

	/**
	 * Allows you to create a Mall without any data
	 */
	public Mall() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0;
		this.occupancyGroup = "";
		this.subGroup = "";
		this.numRentableUnits = 0;
		this.numRentedUnits = 0;
		this.medianUnitSize = 0;
		this.numParkingSpaces = 0;
	}// end constructor

	/**
	 * Allows you to create a Mall with some data
	 * 
	 * @param projectName     used to name project through calling method
	 * @param completeAddress used to give address through calling method
	 * @param totalSquareFeet used to set the area through calling method
	 * @param occupancyGroup  used to set the occupancy group through calling method
	 * @param subGroup        used to set the subgroup through calling method
	 */

	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numRentableUnits = 0;
		this.numRentedUnits = 0;
		this.medianUnitSize = 0;
		this.numParkingSpaces = 0;
	}// end constructor

	/**
	 * Draw will eventually be used to draw to object to the screen
	 */
	public void draw() {
		System.out.println("Drawing code for a mall");

	}// end draw

	/**
	 * Display data is used to display all the data of a certain Mall
	 */

	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("         Mall").append(System.lineSeparator());
		sb.append("-----------------------").append(System.lineSeparator());
		sb.append("Project Name: " + projectName).append(System.lineSeparator());
		sb.append("Address: " + completeAddress).append(System.lineSeparator());
		sb.append("Square Feet: " + totalSquareFeet).append(System.lineSeparator());
		sb.append("Occupancy Group: " + occupancyGroup).append(System.lineSeparator());
		sb.append("Occupancy Subgroup: " + subGroup).append(System.lineSeparator());
		sb.append("Number of Rentable Units: " + numRentableUnits).append(System.lineSeparator());
		sb.append("Number of Rented Units: " + numRentedUnits).append(System.lineSeparator());
		sb.append("Median size of Unit: " + medianUnitSize).append(System.lineSeparator());
		sb.append("Number of Parking Spaces: " + numParkingSpaces);

		String Data = sb.toString();
		return Data;
	}// end displayData

	/**
	 * Outputs the number of rented units
	 * 
	 * @return the number of rented units
	 */

	public int getNumRentedUnits() {
		return numRentedUnits;
	}// end getNumRentedUnits

	/**
	 * Allows you to set the number of rented units
	 * 
	 * @param numRentedUnits allows you to set it through calling method
	 */

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}// end setNumRentedUnits

	/**
	 * Outputs the median unit size
	 * 
	 * @return the median unit size
	 */

	public double getMedianUnitSize() {
		return medianUnitSize;
	}// end getMedianUnitSize

	/**
	 * Allows you to set the median unit size
	 * 
	 * @param medianUnitSize allows you to set it through calling method
	 */

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}// end setMedianUnitSize

	/**
	 * Outputs the number of parking spaces
	 * 
	 * @return the number of parking spaces
	 */

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}// end getNumParkingSpaces

	/**
	 * Allows you to set the number of parking spaces
	 * 
	 * @param numParkingSpaces allows you to set it through calling method
	 */

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}// end setNumParkingSpaces

	/**
	 * Does the same thing as display data
	 */

	public String toString() {
		return displayData();
	}// end toString
}// end class