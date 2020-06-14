package com.pavikumbhar.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.pavikumbhar.dto.PatientDto;
import com.pavikumbhar.entity.Patient;

/**
 * 
 * @author pavikumbhar
 *
 */

@Mapper(config=MapperConfiguration.class)
public interface PatientMapper {
	
	@Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MMM/yyyy")
    Patient toEntity(PatientDto patientDto);
	
	@Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MMM/yyyy")
	PatientDto toDto(Patient patient);
	
	@Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MMM/yyyy")
	 @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
	  nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
	void updateEntity(PatientDto patientDto, @MappingTarget Patient patient);
	 
	@Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MMM/yyyy")
	@BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
	void updateDto(Patient patient, @MappingTarget() PatientDto patientDto);

}
