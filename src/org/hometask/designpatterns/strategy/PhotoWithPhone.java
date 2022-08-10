package org.hometask.designpatterns.strategy;

import java.util.Scanner;

public class PhotoWithPhone {

	public static void main(String[] args) {

		PhoneCameraApp cameraApp = new CameraPlusApp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Share with text (t), email (e), or social media (s)?");
		String share = scanner.next();
		scanner.close();

		if (share.equalsIgnoreCase("t")) {
			cameraApp.setShareStrategy(new Text());
		} else if (share.equalsIgnoreCase("e")) {
			cameraApp.setShareStrategy(new Email());
		} else if (share.equalsIgnoreCase("s")) {
			cameraApp.setShareStrategy(new SocialMedia());
		} else {
			cameraApp.setShareStrategy(new Text());
		}
		
		cameraApp.take();
		cameraApp.edit();
		cameraApp.save();
		cameraApp.share();
	}
}
