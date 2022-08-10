package org.hometask.java8.consumer_supplier;

import java.util.function.Supplier;

public class Random_OTP {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 5);
			}
			return otp;
		};
		System.out.println(s.get());
	}
}
