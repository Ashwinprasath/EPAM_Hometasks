package org.hometask.designpatterns.decorator;

public class TaskWidget extends AddWidget {

	WebPage myWebpage;

	public TaskWidget(WebPage webpage){
        this.myWebpage = webpage;
    }
	
	@Override
	public int calculateRank() {
		return myWebpage.calculateRank() + 1;
	}

}
