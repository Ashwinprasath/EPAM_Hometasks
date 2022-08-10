package org.hometask.designpatterns.decorator;

public class SearchBarWidget extends AddWidget {

	WebPage myWebpage;

	public SearchBarWidget(WebPage webpage){
        this.myWebpage = webpage;
    }

	@Override
	public int calculateRank() {
		return myWebpage.calculateRank() + 1;
	}

}
