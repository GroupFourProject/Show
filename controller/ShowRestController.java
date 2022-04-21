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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ShowService;
import com.model.Show;

@RestController
public class ShowRestController {
@Autowired
ShowService service;

@GetMapping("/getShows")
public List<Show> findall(){
	return service.findAllShows();
}

@PostMapping("/addshow")
public ResponseEntity<?> addShow(@RequestBody Show show) throws AddShowException {
	Show s1=service.findShow(show.getShowID());
	if(s1==null)
	{
		throw new AddShowException();
	}
     service.add(show);
	return ResponseEntity.status(HttpStatus.OK).body("Show added successfully");
}


@PatchMapping("/updateshow")
public ResponseEntity<?> updateShow(@RequestBody Show show) throws UpdateShowException {
	Show s1=service.findShow(show.getShowID());
	if(s1==null) {
		throw new UpdateShowException();
	}
	service.update(show);
	return ResponseEntity.ok("Show updated successfully");
}

@DeleteMapping("/deleteshow/{id}")
public ResponseEntity<?> deleteShow(@PathVariable int id) throws DeleteShowException {
	Show s1=service.findShow(id);
	if(s1==null)
	{
      throw new DeleteShowException(id);
	}
	service.delete(id);
	return ResponseEntity.ok("Show deleted successfully");
}

/*@GetMapping("/findAll")
public List<Show> getAllShow()
{
	return service.findAllShows();
}
*/
@GetMapping("/findAll")
public ResponseEntity<?> findShow(@PathVariable Show show) throws FindShowException {
	Show s1=service.findShow(show.getShowID());
	if(s1==null)
	{
		throw new FindShowException();
	}
	service.findAllShows();
	return ResponseEntity.ok("Show is available"); 
}
}
