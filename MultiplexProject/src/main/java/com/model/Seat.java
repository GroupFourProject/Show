package com.model;

import java.sql.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Seat {
private int show;
@JsonFormat(pattern="dd-MM-yyyy")
private Date date;
private boolean seatType;
private int bookingID;
private boolean canceled;
public Seat() {}
public boolean isCanceled() {
		return canceled;
	}

	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}


public int getShow() {
	return show;
}
public void setShow(int show) {
	this.show = show;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public boolean getSeatType() {
	return seatType;
}
public void setSeatType(boolean seatType) {
	this.seatType = seatType;
	
}
public int getBookingID() {
	return bookingID;
}
public void setBookingID(int bookID) {
	this.bookingID = bookID;
}
@Override
public String toString() {
	return "Seat [show=" + show + ", date=" + date + ", seatType=" + seatType + "]";
}


}
