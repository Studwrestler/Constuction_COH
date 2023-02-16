/**
 * This is the Business class that inherits from Building that allows you to
 * create a Business building
 * 
 * @author Chase Hall
 * @version 2-16-23 Project 1 CS131
 */
public class Business extends Building {
	protected int numRentableUnits;// used for the number of rentable units

	/**
	 * Allows you to create a Business without any data
	 */

	public Business() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0;
		this.occupancyGroup = "";
		this.subGroup = "";
		this.numRentableUnits = 0;

	}// end constructor

	/**
	 * Allows you to create a Business with some data
	 * 
	 * @param projectName     used to name project through calling method
	 * @param completeAddress used to give address through calling method
	 * @param totalSquareFeet used to set the area through calling method
	 * @param occupancyGroup  used to set the occupancy group through calling method
	 * @param subGroup        used to set the subgroup through calling method
	 */

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numRentableUnits = 0;
	}// end constructor

	/**
	 * Outputs the number of rentable units
	 * 
	 * @return the number of rentable units
	 */

	public int getNumRentableUnits() {
		return numRentableUnits;
	}// end getNumRentableUnits

	/**
	 * Allows you to set the number of rentable units
	 * 
	 * @param numRentableUnits allows you to set it through the calling method
	 */

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}// end setNumRentableUnits

	/**
	 * to String is used to display all the data of a certain Business
	 */

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("       Business").append(System.lineSeparator());
		sb.append("------------------------").append(System.lineSeparator());
		sb.append("Project Name: " + projectName).append(System.lineSeparator());
		sb.append("Address: " + completeAddress).append(System.lineSeparator());
		sb.append("Square Feet: " + totalSquareFeet).append(System.lineSeparator());
		sb.append("Occupancy Group: " + occupancyGroup).append(System.lineSeparator());
		sb.append("Occupancy Subgroup: " + subGroup);
		sb.append("Number of Rentable Units: " + numRentableUnits);
		String Data = sb.toString();
		return Data;
	}// end toString

}// end class
