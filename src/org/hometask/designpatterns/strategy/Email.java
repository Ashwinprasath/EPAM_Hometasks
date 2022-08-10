package org.hometask.designpatterns.strategy;

public class Email implements ShareStrategy {

	@Override
	public void share() {
		System.out.println("Mailing the photo");
	}
}
