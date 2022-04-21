package com.controller;

public class UpdateSeatException extends RuntimeException {
	public UpdateSeatException() {
		super("Seat is not available to update");
	}

	@Override
	public String toString() {
		return "Seat is not available to update";

	}
}
