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
	public ResponseEntity<?> addSeat(@RequestBody Seat seat)
	{
		Seat s1=service.findSeat(seat.getBookingID());
		if(s1==null)
		{
			throw new AddSeatException();
		}
		service.add(seat);
		return ResponseEntity.status(HttpStatus.OK).body("Seat added successfully");
		}

	@GetMapping("/findAllseat")
	public ResponseEntity<?> findSeat(@PathVariable Seat seat)
	{
		Seat s1=service.findSeat(seat.getBookingID());
		if(s1==null)
		{
			throw new FindShowException();
		}
		service.findAllSeats();
		return ResponseEntity.ok("Seat is available"); 
	}
	
	
	
	@PatchMapping("/updatesaet")
	public ResponseEntity<?> updateSeat(@RequestBody Seat seat)
	{
		Seat s1=service.findSeat(seat.getBookingID());
		if(s1==null) {
			throw new UpdateSeatException();
		}
		service.update(seat);
		return ResponseEntity.ok("Show updated successfully");
		
	}

	@DeleteMapping("/deleteseat/{id}")
	public ResponseEntity<?> deleteSeat(@PathVariable int id) throws DeleteSeatException {
		Seat seat=service.findSeat(id);
		if(seat==null)
		{
			throw new DeleteSeatException(id);
		}
		service.delete(id);
		return ResponseEntity.ok("Seat deleted successfully");
	}

	/*@GetMapping("/findAll")
	public List<Seat> getAllSeat()
	{
		return service.findAllSeats();
	}*/
	
	
	@PostMapping("/bookseat")
	public ResponseEntity<?> bookSeat(@RequestBody Seat s)
	{
		int bookingID;
		int id=0;
		Seat s1=service.findSeat(id);
		
		if(s1==null)
		{
			throw new BookSeatException(s1);
		}
		service.add(s1);
		return ResponseEntity.status(HttpStatus.OK).body("Seat booked successfully for "+s1.getBookingID());
	}
	
	@PostMapping("/cancelseat")
	public ResponseEntity<?> cancelSeat(@RequestBody Seat s)
	{
		int bookingID;
		int id=0;
		Seat s1=service.findSeat(id);
		
		if(s1==null)
		{
			throw new CancelSeatException(s1);
		}
		service.add(s1);
		return ResponseEntity.status(HttpStatus.OK).body("Seat canceled successfully for "+s1.getBookingID());
	}
}
