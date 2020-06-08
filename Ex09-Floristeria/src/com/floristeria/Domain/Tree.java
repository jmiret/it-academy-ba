package com.floristeria.Domain;

public class Tree extends Product {

	private double alcada;

	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tree(String nom, double preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}
	
	public Tree(String nom, double preu, double alcada) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
		this.alcada = alcada;
	}

	public double getAlcada() {
		return alcada;
	}

	public void setAlcada(double alcada) {
		this.alcada = alcada;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(alcada);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Tree other = (Tree) obj;
		if (Double.doubleToLongBits(alcada) != Double.doubleToLongBits(other.alcada))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Arbre [" + super.toString() + "alcada=" + alcada + "]";
	}
	
}
