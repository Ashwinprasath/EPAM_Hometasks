package org.hometask.designpatterns.decorator;

public class MobilePage extends WebPage{

	int myRank;
	
	@Override
	public int calculateRank() {
		return 2;
	}

	public  String getDescription() {
        return "Mobile webpage";
    }
}
