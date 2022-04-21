package com.controller;

public class FindSeatException extends RuntimeException {
	public FindSeatException() {
		super("Seat is not found");
	}
	@Override
	public String toString() {
		return "Seat is not found";

	}
}
