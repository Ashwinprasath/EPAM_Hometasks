package org.hometask.designpatterns.strategy;

public class SocialMedia implements ShareStrategy {

	@Override
	public void share() {
		System.out.println("Sharing the photo on social media");
	}
}
