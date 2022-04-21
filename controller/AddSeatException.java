package com.controller;

public class AddSeatException extends RuntimeException{
	public AddSeatException()

	{
		super("Seat is not available to add");
				}
	@Override
	public String toString() {
		return"Seat is not available to add";

	}

}
