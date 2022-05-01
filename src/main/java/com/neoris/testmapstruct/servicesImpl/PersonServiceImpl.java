package com.neoris.testmapstruct.servicesImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.testmapstruct.dtos.PersonDepartamentDTO;
import com.neoris.testmapstruct.entities.Person;
import com.neoris.testmapstruct.mappers.PersonDepartamentMapper;
import com.neoris.testmapstruct.repositories.PersonRepository;
import com.neoris.testmapstruct.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	PersonDepartamentMapper personDepartamentMapper;

	@Override
	public Person createPerson(PersonDepartamentDTO dto) {
		// TODO Auto-generated method stub
		return personRepository.save(personDepartamentMapper.map(dto));
	}

	@Override
	public Person getPersonById(long id) {
		// TODO Auto-generated method stub
		return personRepository.getById(id);
	}

	// entity
	@Override
	public List<Person> getPeople() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	// dtos

	@Override
	public List<PersonDepartamentDTO> getAllInDto() {
		// TODO Auto-generated method stub
		return personRepository.findAll().stream().map(person -> personDepartamentMapper.map(person))
				.collect(Collectors.toList());
	}

}
