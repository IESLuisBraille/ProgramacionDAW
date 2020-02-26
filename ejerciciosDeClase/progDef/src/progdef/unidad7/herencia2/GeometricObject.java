package progdef.unidad7.herencia2;

import java.util.Date;

public class GeometricObject {
	// attributes (fields)
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// no-arg constructor
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	// args constructor
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return a string representation of object */
	@Override
	public String toString() {
		return "Created on " + dateCreated + " | Color: " + color + " | Filled: " + filled;
	}

	// getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
}