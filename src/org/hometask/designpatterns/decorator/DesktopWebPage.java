package org.hometask.designpatterns.decorator;

public class DesktopWebPage extends WebPage{

	int myRank;
	
	@Override
	public int calculateRank() {
		return 3;
	}
	public String getDescription() {
		return "DeskTop webpage";
	}
}
