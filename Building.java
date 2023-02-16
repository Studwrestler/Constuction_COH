/**
 * This is the Building class it is used as the parent class for multiple child
 * classes
 * 
 * @author Chase Hall
 * @version 2-16-23 Project 1 CS131
 */
public class Building {
	protected String projectName;// used for setting the project name
	protected String completeAddress;// used for setting the address
	protected double totalSquareFeet;// used for setting total area of building
	protected String occupancyGroup;// used for setting occupancy group
	protected String subGroup; // used for setting subgroup

	/**
	 * Allows you to create a Building without any data
	 */

	public Building() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0;
		this.occupancyGroup = "";
		this.subGroup = "";
	}// end constructor

	/**
	 * Allows you to create a Building with some data
	 * 
	 * @param projectName     used to name project through calling method
	 * @param completeAddress used to give address through calling method
	 * @param totalSquareFeet used to set the area through calling method
	 * @param occupancyGroup  used to set the occupancy group through calling method
	 * @param subGroup        used to set the subgroup through calling method
	 */

	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subGroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subGroup = subGroup;
	}// end constructor

	/**
	 * Draw will eventually be used to draw to object to the screen
	 */

	public void draw() {
		System.out.println("Drawing code for a building");

	}// end draw

	/**
	 * Display data is used to display all the data of a certain Building
	 * @return the data
	 */

	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("       Building").append(System.lineSeparator());
		sb.append("------------------------").append(System.lineSeparator());
		sb.append("Project Name: " + projectName).append(System.lineSeparator());
		sb.append("Address: " + completeAddress).append(System.lineSeparator());
		sb.append("Square Feet: " + totalSquareFeet).append(System.lineSeparator());
		sb.append("Occupancy Group: " + occupancyGroup).append(System.lineSeparator());
		sb.append("Occupancy Subgroup: " + subGroup);
		String Data = sb.toString();
		return Data;
	}// end displayData

	/**
	 * Outputs the project name
	 * 
	 * @return the project name
	 */

	public String getProjectName() {
		return projectName;
	}// end getProjectName

	/**
	 * Allows you to set the project name
	 * 
	 * @param projectName allows you to set it through calling method
	 */

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}// end setProjectName

	/**
	 * Outputs the address
	 * 
	 * @return the address
	 */

	public String getCompleteAddress() {
		return completeAddress;
	}// end getCompleteAddress

	/**
	 * Allows you to set the address
	 * 
	 * @param completeAddress allows you to set it through calling method
	 */

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}// end setCompleteAddress

	/**
	 * Outputs the total area
	 * 
	 * @return the total area
	 */

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}// end getTotalSquareFeet

	/**
	 * Allows you to set the area
	 * 
	 * @param totalSquareFeet allows you to set it through calling method
	 */

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}// end setTotalSquareFeet

	/**
	 * Outputs the occupancy group
	 * 
	 * @return the occupancy group
	 */

	public String getOccupancyGroup() {
		return occupancyGroup;
	}// end getOccupancyGroup

	/**
	 * Allows you to set the occupancy group
	 * 
	 * @param occupancyGroup allows you to set it through calling method
	 */

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}// end setOccupancyGroup

	/**
	 * Outputs the sub group
	 * 
	 * @return the sub group
	 */

	public String getSubGroup() {
		return subGroup;
	}// end getSubGroup

	/**
	 * Allows you to set the subGroup
	 * 
	 * @param subGroup allows you to set it through calling method
	 */

	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}// end setSubGroup

	/**
	 * Does the same thing as display data
	 */

	public String toString() {
		return displayData();
	}// end toString

}// end class