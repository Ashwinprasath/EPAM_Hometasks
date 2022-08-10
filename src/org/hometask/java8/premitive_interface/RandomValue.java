package org.hometask.java8.premitive_interface;

import java.util.function.IntSupplier;

public class RandomValue {

	public static void main(String[] args) throws Exception {
		IntSupplier ints = () -> {
			
			return (int) (Math.random() * 5000);
		};
		System.out.println(ints.get());
	}

}
