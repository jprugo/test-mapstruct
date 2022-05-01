package com.neoris.testmapstruct.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neoris.testmapstruct.dtos.PersonDepartamentDTO;
import com.neoris.testmapstruct.entities.Person;
import com.neoris.testmapstruct.servicesImpl.PersonServiceImpl;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonServiceImpl personServiceImpl;

	// entity

	@GetMapping("/entities")
	public List<Person> getPeople() {
		return personServiceImpl.getPeople();
	}

	// dto

	@GetMapping("/dtos")
	public List<PersonDepartamentDTO> getPeopleDto() {
		return personServiceImpl.getAllInDto();
	}

	@PostMapping("/dtos")
	public Person createPerson(@RequestBody PersonDepartamentDTO dto) {
		return personServiceImpl.createPerson(dto);
	}

	// test function

	@GetMapping("{id}")
	public Person getPeople(@RequestParam long id) {
		return personServiceImpl.getPersonById(id);
	}

}
