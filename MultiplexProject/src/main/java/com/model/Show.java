package com.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Show {
	@Id
@GeneratedValue
private int showID;

public int getShowID() {
		return showID;
	}

	public void setShowID(int showID) {
		this.showID = showID;
	}

private int hallID;
private int movieID;
private int slotNO;
@JsonFormat(pattern="dd-MM-yyyy")
private Date fromDate;
@JsonFormat(pattern="dd-MM-yyyy")
private Date toDate;

public Show() {}

public int getHallID() {
	return hallID;
}

public void setHallID(int hallID) {
	this.hallID = hallID;
}

public int getMovieID() {
	return movieID;
}

public void setMovieID(int movieID) {
	this.movieID = movieID;
}

public int getSlotNO() {
	return slotNO;
}

public void setSlotNO(int slotNO) {
	this.slotNO = slotNO;
}

public Date getFromDate() {
	return fromDate;
}

public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}

public Date getToDate() {
	return toDate;
}

public void setToDate(Date toDate) {
	this.toDate = toDate;
}


}
