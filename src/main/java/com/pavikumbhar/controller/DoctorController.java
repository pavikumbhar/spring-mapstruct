package com.pavikumbhar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pavikumbhar.dto.DoctorDto;
import com.pavikumbhar.mapper.DoctorMapper;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
public class DoctorController {
	
	private DoctorMapper doctorMapper;

	@PostMapping("doctor")
	public ResponseEntity<DoctorDto> addDoctor(@RequestBody DoctorDto doctorDto) {
		log.info("addDoctor : {} ",doctorDto);
		log.info("addDoctor : {} ",doctorMapper.toEntity(doctorDto));
		return new ResponseEntity<>(doctorDto, HttpStatus.OK);

	}
}
