package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Seat;


@Repository
public interface SeatDAO {
public void addSeat(Seat s);
public Seat find(int id);
public List<Seat> findAll();
public boolean updateSeat(Seat s);
public boolean deleteSeat(int id);
}