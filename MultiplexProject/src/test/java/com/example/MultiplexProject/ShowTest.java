package com.example.MultiplexProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.ShowService;
import com.model.Show;
@SpringBootTest
class ShowTest {
@Autowired
ShowService service;
	@Test
	void testAdd() {
		Show s=new Show();
		s.setHallID(1234);
		s.setMovieID(99852);
		s.setSlotNO(2);
		String str="2022-04-13";
		Date d=Date.valueOf(str);
		String str1="2022-04-24";
		Date d1=Date.valueOf(str1);
				s.setFromDate(d);
				s.setToDate(d1);
				service.add(s);
		Show st=service.findShow(s.getShowID());
		Assert.assertEquals(1234, st.getHallID());
		Assert.assertEquals(99852, st.getMovieID());
	}

	@Test
	void testFindShow() {
		Show s=new Show();
		String str="2022-04-14";
			Date d=Date.valueOf(str);
		String str1="2022-04-22";
		Date d1=Date.valueOf(str1);
		
		s.setHallID(1234);
		s.setMovieID(9966);
		s.setSlotNO(5);
		s.setFromDate(d);
		s.setToDate(d1);
		service.add(s);
		Show st=service.findShow(s.getShowID());
		Assert.assertEquals(5, st.getSlotNO());
	}

	@Test
	void testFindAllShows() {
		Show s= new Show();
		String str="2022-04-12";
		Date d=Date.valueOf(str);
	String str1="2022-04-18";
	Date d1=Date.valueOf(str1);
	
	s.setHallID(4321);
	s.setMovieID(9078);
	s.setSlotNO(4);
	s.setFromDate(d);
	s.setToDate(d1);
	service.add(s);
	List<Show> showlist=service.findAllShows();
	Show st=service.findShow(s.getShowID());
	
	Assert.assertEquals(d, st.getFromDate());
	}

	@Test
	void testUpdate() {
		Show s=new Show();
		String str="2022-04-12";
		Date d=Date.valueOf(str);
	String str1="2022-04-18";
	Date d1=Date.valueOf(str1);
	
	s.setHallID(4311);
	s.setMovieID(978);
	s.setSlotNO(1);
	s.setFromDate(d);
	s.setToDate(d1);
	service.add(s);
	
	service.update(s);
	Assert.assertEquals(true, service.update(s));
	}

	@Test
	void testDelete() {
		Show s1=new Show();
		String str="2022-04-13";
		Date d=Date.valueOf(str);
		s1.setFromDate(d);
		String str1="2022-04-20";
		Date d1=Date.valueOf(str1);
				s1.setToDate(new Date(15/04/2022));
				s1.setMovieID(99852);
				service.add(s1);
				service.delete(2);
				
			    Assert.assertNull(service.findShow(2));
				
					}

}
