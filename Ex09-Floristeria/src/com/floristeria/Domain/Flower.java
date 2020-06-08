package com.floristeria.Domain;

public class Flower extends Product {
	
	private String color;

	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flower(String nom, double preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub		
	}
	
	public Flower(String nom, double preu, String color) {
		super(nom, preu);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flor [" + super.toString() + "color=" + color + "]";
	}
	
}
