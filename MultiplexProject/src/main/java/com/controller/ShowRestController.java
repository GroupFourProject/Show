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
public ResponseEntity<?> addShow(@RequestBody Show show)
{
	service.add(show);
	return ResponseEntity.status(HttpStatus.OK).body("Show added successfully");}


@PatchMapping("/updateshow")
public ResponseEntity<?> updateShow(@RequestBody Show show)
{
	service.update(show);
	return ResponseEntity.ok("Show updated successfully");
}

@DeleteMapping("/deleteshow/{id}")
public ResponseEntity<?> deleteShow(@PathVariable int id) throws DeleteUserException {
	Show show=service.findShow(id);
	if(show==null)
	{
		throw new DeleteUserException(id);
	}
	service.delete(id);
	return ResponseEntity.ok("Show deleted successfully");
}

@GetMapping("/findAll")
public List<Show> getAllShow()
{
	return service.findAllShows();
}

}
