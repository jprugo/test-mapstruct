package com.neoris.testmapstruct.services;

import java.util.List;

import com.neoris.testmapstruct.dtos.PersonDepartamentDTO;
import com.neoris.testmapstruct.entities.Person;

public interface PersonService {

	Person createPerson(PersonDepartamentDTO dto);

	Person getPersonById(long id);

	List<Person> getPeople();

	List<PersonDepartamentDTO> getAllInDto();
}
