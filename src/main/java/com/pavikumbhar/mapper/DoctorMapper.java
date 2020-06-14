package com.pavikumbhar.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.pavikumbhar.dto.DoctorDto;
import com.pavikumbhar.entity.Doctor;
/**
 * 
 * @author pavikumbhar
 *
 */

@Mapper(config=MapperConfiguration.class)
public interface DoctorMapper {
	
	 @Mapping(source = "doctor.specialty", target = "specialization")
	 DoctorDto toDto(Doctor doctor);
	 
	 @Mapping(source = "doctorDto.specialization", target = "specialty")
	 Doctor toEntity(DoctorDto doctorDto);
	
	 @Mapping(source = "doctorDto.specialization", target = "specialty")
	 void updateEntity(DoctorDto doctorDto, @MappingTarget Doctor doctor);
	 
	 @Mapping(source = "doctor.specialty", target = "specialization")
	 @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
     			  nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
	 void updateDto(Doctor doctor, @MappingTarget DoctorDto doctorDto);

}
