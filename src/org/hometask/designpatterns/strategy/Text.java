package org.hometask.designpatterns.strategy;

public class Text implements ShareStrategy{

	@Override
	public void share() {
		System.out.println("Texting the photo");
	}
}
