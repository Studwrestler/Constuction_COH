/**
 * This is the SingleFamilyHome class that inherits from Residential that allows
 * you to create a single family home
 * 
 * @author Chase Hall
 * @version 2-16-23 Project 1 CS131
 */
public class SingleFamilyHome extends Residential {
	private boolean garage;// used to know if the home has a garage

	/**
	 * Allows you to create a standard home without any data
	 */

	public SingleFamilyHome() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0;
		this.occupancyGroup = "";
		this.subGroup = "";
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
		this.garage = false;
	}// end constructor

	/**
	 * Allows you to create a standard home with some data
	 * 
	 * @param projectName     used to name project through calling method
	 * @param completeAddress used to give address through calling method
	 * @param totalSquareFeet used to set the area through calling method
	 * @param occupancyGroup  used to set the occupancy group through calling method
	 * @param subGroup        used to set the subgroup through calling method
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
		this.garage = false;
	}// end constructor

	/**
	 * Draw will eventually be used to draw to object to the screen
	 */

	public void draw() {
		System.out.println("Drawing code for a single family home");

	}// end draw

	/**
	 * Display data is used to display all the data of a certain single family home
	 */

	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("    SingleFamilyHome").append(System.lineSeparator());
		sb.append("------------------------").append(System.lineSeparator());
		sb.append("Project Name: " + projectName).append(System.lineSeparator());
		sb.append("Address: " + completeAddress).append(System.lineSeparator());
		sb.append("Square Feet: " + totalSquareFeet).append(System.lineSeparator());
		sb.append("Occupancy Group: " + occupancyGroup).append(System.lineSeparator());
		sb.append("Occupancy Subgroup: " + subGroup).append(System.lineSeparator());
		sb.append("Number of Bedrooms: " + numBedrooms).append(System.lineSeparator());
		sb.append("Number of Bathrooms: " + numBathrooms).append(System.lineSeparator());
		sb.append("Laundry Room: " + laundryRoom).append(System.lineSeparator());
		sb.append("Garage: " + garage);

		String Data = sb.toString();
		return Data;
	}// end draw

	/**
	 * Asks if there is a garage
	 * 
	 * @return true or false based on whether there is a garage or not
	 */

	public boolean isGarage() {
		return garage;
	}// end isGarage

	/**
	 * Allows you to set whether there is a garage or not
	 * 
	 * @param garage used to set garage through calling method
	 */

	public void setGarage(boolean garage) {
		this.garage = garage;
	}// end setGarage

	/**
	 * Does the same thing as display data
	 */

	public String toString() {
		return displayData();
	}// end toString

}// end class
