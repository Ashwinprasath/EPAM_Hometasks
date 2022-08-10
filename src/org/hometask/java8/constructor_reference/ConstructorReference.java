package org.hometask.java8.constructor_reference;

import java.util.function.BiFunction;

public class ConstructorReference {

@SuppressWarnings("unused")
public static void main(String[] args) {
		
		MyFunctionalInterface myFunction= Employee :: new;
		
		BiFunction<String, Long, Employee> f1= Employee :: new;
		BiFunction<String, Long, Employee> f2= (empName,salary) -> new Employee(empName,salary);
		
		
		System.out.println(myFunction.getEmployee("Ashwin", 300).getEmpName());
		System.out.println(myFunction.getEmployee("Ashwin Prasath", 1500).getSalary());
	}

}
