package com.pizza.mine;

public class PizzaTestDrive 
{
	public static void main(String[] args) 
	{
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Sumit ordered a " + pizza.getName());

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Sumit ordered a " + pizza.getName());
	}
}
