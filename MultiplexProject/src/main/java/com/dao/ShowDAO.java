package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Show;

@Repository
public interface ShowDAO {
public void addShow(Show s);
public Show find(int id);
public List<Show> findAll();
public boolean updateShow(Show s);
public boolean deleteShow(Show s);
}
