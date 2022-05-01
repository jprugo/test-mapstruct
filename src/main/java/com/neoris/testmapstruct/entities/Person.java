package com.neoris.testmapstruct.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	private long idPerson;

	private String documentNumber;

	private String fullName;

	@ManyToOne
	@JoinColumn(name = "idDepartament", nullable = false)
	private Departament departament;

}
