/**
 * This is the Residential class that inherits from Building that allows you to
 * create a residential building
 * 
 * @author Chase Hall
 * @version 2-16-23 Project 1 CS131
 */
public class Residential extends Building {
	protected int numBedrooms;// used to set the number of bedrooms
	protected int numBathrooms;// used to set the number of bathrooms
	protected boolean laundryRoom;// used to know if there is a laundry room

	/**
	 * Allows you to create a Residence without any data
	 */

	public Residential() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0;
		this.occupancyGroup = "";
		this.subGroup = "";
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}// end constructor

	/**
	 * Allows you to create a Residence with some data
	 * 
	 * @param projectName     used to name project through calling method
	 * @param completeAddress used to give address through calling method
	 * @param totalSquareFeet used to set the area through calling method
	 * @param occupancyGroup  used to set the occupancy group through calling method
	 * @param subGroup        used to set the subgroup through calling method
	 */

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}// end constructor

	/**
	 * Outputs the number of bedrooms
	 * 
	 * @return the number of bedrooms
	 */

	public int getNumBedrooms() {
		return numBedrooms;
	}// end getNumBedrooms

	/**
	 * Allows you to set the number of bedrooms
	 * 
	 * @param numBedrooms allows you to set it through calling method
	 */

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}// end setNumBedrooms

	/**
	 * Outputs the number of bathrooms
	 * 
	 * @return the number of bathrooms
	 */

	public int getNumBathrooms() {
		return numBathrooms;
	}// end getNumBathrooms

	/**
	 * Allows you to set the number of bathrooms
	 * 
	 * @param numBathrooms allows you to set it through calling method
	 */

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}// end setNumBathrooms

	/**
	 * Outputs if there is a laundry room
	 * 
	 * @return true or false if there is a laundry room
	 */

	public boolean isLaundryRoom() {
		return laundryRoom;
	}// end isLaundryRoom

	/**
	 * Allows you to set if there is a laundry room
	 * 
	 * @param laundryRoom allows you to set it through calling method
	 */

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}// end setLaundryRoom

	/**
	 * to String is used to display all the data of a certain Business
	 */

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("       Residential").append(System.lineSeparator());
		sb.append("------------------------").append(System.lineSeparator());
		sb.append("Project Name: " + projectName).append(System.lineSeparator());
		sb.append("Address: " + completeAddress).append(System.lineSeparator());
		sb.append("Square Feet: " + totalSquareFeet).append(System.lineSeparator());
		sb.append("Occupancy Group: " + occupancyGroup).append(System.lineSeparator());
		sb.append("Occupancy Subgroup: " + subGroup);
		sb.append("Number of Bathrooms: " + numBathrooms);
		sb.append("Number of Bedrooms: " + numBedrooms);
		sb.append("Laundry Room: " + laundryRoom);
		String Data = sb.toString();
		return Data;
	}// end toString

}// end class
