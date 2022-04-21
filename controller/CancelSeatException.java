package com.controller;

import com.model.Seat;
import com.model.Show;

public class CancelSeatException extends RuntimeException{
	private static int id;
	private Object bookingID;
	public CancelSeatException(Seat s1)
	{
		Seat s=new Seat();
		this.bookingID=bookingID;
	}
	@Override
	public String toString() {
		return "Cancellation can be done";
	}
}
