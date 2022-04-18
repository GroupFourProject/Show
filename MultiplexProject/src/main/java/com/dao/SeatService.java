package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Seat;
import com.model.Show;
@Service
public class SeatService {
	@Autowired
	SeatDAO seatDAOimpl;
public void add(Seat s1) {
	seatDAOimpl.addSeat(s1);
}

public Seat findSeat(int id) {
	return seatDAOimpl.find(id);
}

public List<Seat> findAllSeats(){
	return seatDAOimpl.findAll();
}

public boolean update(Seat s) {
	return seatDAOimpl.updateSeat(s);
}

public boolean delete(int id) {
	return seatDAOimpl.deleteSeat( id);
}
}
