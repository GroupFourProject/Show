package com.controller;

import com.model.Seat;
import com.model.Show;

public class CancelSeatException extends RuntimeException{
	private static int id;
	private Object canceled;
	public CancelSeatException(Show s1)
	{
		Seat s=new Seat();
		this.canceled=canceled;
	}
	@Override
	public String toString() {
		return "Booking cannot be done";
	}
}
