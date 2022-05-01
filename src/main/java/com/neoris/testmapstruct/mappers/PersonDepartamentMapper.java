package com.neoris.testmapstruct.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.neoris.testmapstruct.dtos.PersonDepartamentDTO;
import com.neoris.testmapstruct.entities.Person;

@Mapper
public interface PersonDepartamentMapper {

	PersonDepartamentMapper INSTANCE = Mappers.getMapper(PersonDepartamentMapper.class);

	@Mapping(source = "departament.idDepartament", target = "idDepartament")
	@Mapping(source = "fullName", target = "employeeName")
	@Mapping(source = "departament.departamentName", target = "area")
	PersonDepartamentDTO map(Person source);

	@InheritInverseConfiguration(name = "map")
	Person map(PersonDepartamentDTO source);

}
