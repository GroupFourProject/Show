package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Seat;
import com.model.Show;
@Service
public class ShowService {
	@Autowired
	ShowDAO showDAOimpl;
public void add(Show s1) {
	showDAOimpl.addShow(s1);
}

public Show findShow(int id) {
	return showDAOimpl.find(id);
}

public List<Show> findAllShows(){
	return showDAOimpl.findAll();
}

public boolean update(Show s) {
	return showDAOimpl.updateShow(s);
}

public boolean delete(int id) {
	return showDAOimpl.deleteShow( id);
}
}
