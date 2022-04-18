package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Seat;
import com.model.Show;
@Component
public class SeatDAOImpl implements SeatDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addSeat(Seat s) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Seat find(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
        Seat st=session.get(Seat.class, id);
		return st;
	}

	@Override
	public List<Seat> findAll() {
		// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	List<Seat> seatlist=session.createQuery("select i from Seat i").list();
	return seatlist;
	}
	@Override
	public boolean updateSeat(Seat s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteSeat(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Seat seat=session.find(Seat.class, id);
		session.getTransaction().begin();
		session.delete(seat);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
