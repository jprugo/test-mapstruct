package com.neoris.testmapstruct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoris.testmapstruct.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
