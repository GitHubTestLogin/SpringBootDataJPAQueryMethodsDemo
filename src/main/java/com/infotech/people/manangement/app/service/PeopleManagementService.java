package com.infotech.people.manangement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.people.manangement.app.dao.PeopleManangementDao;
import com.infotech.people.manangement.app.entities.Person;

//this is peoples service management
@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementDao peopleManangementDao;
	

	public List<Person> getPersonsInfoByLastName(String lastName) {
		System.out.println("hello");
		
		
		return peopleManangementDao.findByLastName(lastName);
	}

	public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
		return peopleManangementDao.findByFirstNameAndEmail(firstName, email);
	}
}
