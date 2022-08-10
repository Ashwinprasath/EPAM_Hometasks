package org.hometask.oops;

public interface Pizza {

	public int standardBasePrice = 300;
	public int softBasePrice = 400;
	public int tomatosPrice = 50;
	public int cornPrice = 80;
	public int mushroomPrice = 100;

	public int pizzaPrice(boolean tomatos, boolean corn, boolean mushroom);

}
