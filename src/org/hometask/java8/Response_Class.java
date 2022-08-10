package org.hometask.java8;

public class Response_Class {

	int status_code;
	String response_type;

	public Response_Class(int status_code, String response_type) {
		this.status_code = status_code;
		this.response_type = response_type;
	}

	public String toString() {
		return status_code + " :" + response_type;
	}
}
