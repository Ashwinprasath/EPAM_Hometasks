package org.hometask.oops;

public class PizzaSelection {

	public static void main(String[] args) {
		
		Customer c= new Customer();
		
		 c.pizzaDeliveryOrder("StandardBase",false,false,true);
	     c.pizzaDeliveryOrder("StandardBase",true,false,true);
	     c.pizzaDeliveryOrder("StandardBase",true,true,true);
	     c.pizzaDeliveryOrder("StandardBase",true,false,false);
	     c.pizzaDeliveryOrder("StandardBase",false,false,false);
	        
	        
	     c.pizzaDeliveryOrder("SoftBase",false,false,true);
	     c.pizzaDeliveryOrder("SoftBase",true,false,true);
	     c.pizzaDeliveryOrder("SoftBase",true,true,true);
	     c.pizzaDeliveryOrder("SoftBase",true,false,false);
	     c.pizzaDeliveryOrder("SoftBase",false,false,false);

	}

}
