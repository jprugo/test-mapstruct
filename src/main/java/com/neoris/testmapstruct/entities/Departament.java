package com.neoris.testmapstruct.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Departament {

	@Id
	private long idDepartament;

	private String departamentName;

	@OneToMany(mappedBy = "departament")
	@JsonIgnore
	private List<Person> persons;

}
