package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Show;
@Component
public class ShowDAOImpl implements ShowDAO {
@Autowired
SessionFactory sessionFactory;

	@Override
	public void addShow(Show s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Show find(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
        Show st=session.get(Show.class, id);
		return st;
	}

	@Override
	public List<Show> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<Show> showlist=session.createQuery("select i from Show i").list();
		return showlist;
	}

	@Override
	public boolean updateShow(Show s) {
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
	public boolean deleteShow(Show s) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

}
