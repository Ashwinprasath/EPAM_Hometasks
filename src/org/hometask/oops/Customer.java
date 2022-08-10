package org.hometask.oops;

public class Customer {

	public void pizzaDeliveryOrder(String pizzaType, boolean tomatos, boolean corn, boolean mushroom) {
		if (pizzaType.equalsIgnoreCase("StandardBase")) {
			Pizza pizza = new StandardBase();
			System.out.println("Customer's ordered pizza is : " + pizzaType + " & Price for the same is : "
					+ pizza.pizzaPrice(tomatos, corn, mushroom));
		} else if (pizzaType.equalsIgnoreCase("SoftBase")) {
			Pizza pizza = new SoftBase();
			System.out.println("Customer's ordered pizza is : " + pizzaType + " & Price for the same is : "
					+ pizza.pizzaPrice(tomatos, corn, mushroom));
		} else
			System.out.println("Invalid PizzaType");
	}
}
