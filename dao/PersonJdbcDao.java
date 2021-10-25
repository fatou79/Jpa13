package com.fatou.demoJpa13.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate salane;

	public List<Person> findAll(){
			return salane.query("select * from person",
					new BeanPropertyRowMapper(Person.class));
		}
	
	public Person findById(int id) {
		return salane.queryForObject
				("select * from person where id=?", new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));
		
	}
	
	public int deleteById(int id) {
		return salane.update
				("delete from person where id=? new  Object[] {id}");
	}
		
	}


