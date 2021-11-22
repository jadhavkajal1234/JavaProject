package com.app.code11;

public class MissingGradeException extends Exception {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MissingGradeException(int id) {
		this.id = id;
	}
}
