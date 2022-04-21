package com.controller;

import com.model.Seat;
import com.model.Show;

public class BookSeatException extends RuntimeException {
private static int id;
private Object bookingID;
public BookSeatException(Seat s1)
{
	Seat s=new Seat();
	this.bookingID=bookingID;
}
@Override
public String toString() {
	return "Booking cannot be done";
}

}
