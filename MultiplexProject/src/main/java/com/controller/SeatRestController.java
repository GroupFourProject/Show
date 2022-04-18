package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.SeatService;
import com.dao.ShowService;
import com.model.Seat;
import com.model.Show;
@RestController
public class SeatRestController {
	@Autowired
	SeatService service;

	@GetMapping("/getSeats")
	public List<Seat> findall(){
		return service.findAllSeats();
	}

	@PostMapping("/addseat")
	public ResponseEntity<?> addShow(@RequestBody Seat seat)
	{
		service.add(seat);
		return ResponseEntity.status(HttpStatus.OK).body("Seat added successfully");}


	@PatchMapping("/updatesaet")
	public ResponseEntity<?> updateShow(@RequestBody Seat seat)
	{
		service.update(seat);
		return ResponseEntity.ok("Seat updated successfully");
	}

	@DeleteMapping("/deleteseat/{id}")
	public ResponseEntity<?> deleteS(@PathVariable int id) throws DeleteUserException {
		Seat seat=service.findSeat(id);
		if(seat==null)
		{
			throw new DeleteUserException(id);
		}
		service.delete(id);
		return ResponseEntity.ok("Seat deleted successfully");
	}

	@GetMapping("/findAll")
	public List<Seat> getAllSeat()
	{
		return service.findAllSeats();
	}
	
	
	@PostMapping("/bookseat")
	public ResponseEntity<?> bookSeat(@RequestBody Seat s)
	{
		
		int id=0;
		Seat s1=service.findSeat(id);
		
		if(s.getSeatType())
		{
			throw new BookSeatException(s1);
		}
		service.add(s1);
		return ResponseEntity.status(HttpStatus.OK).body("Seat booked successfully for "+s1.getBookingID());
	}
	
	@PostMapping("/cancelseat")
	public ResponseEntity<?> cancelSeat(@RequestBody Seat s)
	{
		int id=0;
		Seat s1=service.findSeat(id);
		
		if(s.getSeatType())
		{
			throw new BookSeatException(s1);
		}
		service.add(s1);
		return ResponseEntity.status(HttpStatus.OK).body("Seat canceled successfully for "+s1.getBookingID());
	}
}
