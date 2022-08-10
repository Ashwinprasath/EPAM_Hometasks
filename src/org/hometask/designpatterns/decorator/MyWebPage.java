package org.hometask.designpatterns.decorator;

public class MyWebPage {

	public static void main(String[] args) {
		
		DesktopWebPage db = new DesktopWebPage();
		WebPage mywebPageRank = new TaskWidget(new SearchBarWidget(db));
		System.out.println("Rank for desktop web page is" + " " + mywebPageRank.calculateRank());
		MobilePage mb = new MobilePage();
		WebPage mywebPageRank2 = new TaskWidget(new SearchBarWidget(mb));
		System.out.println("Rank for mobile page is" + " " + mywebPageRank2.calculateRank());
	}
}
