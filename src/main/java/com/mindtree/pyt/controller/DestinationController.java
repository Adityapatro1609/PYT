package com.mindtree.pyt.controller;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.pyt.dto.DestiationCityHotelDto;
import com.mindtree.pyt.serviceimpl.DestinationServiceImpl;

@RestController
@RequestMapping("/abcd")
@CrossOrigin(origins="http://localhost:4200")
public class DestinationController {

	@Autowired
	DestinationServiceImpl pkgImpl;
	@GetMapping("/url/{stateId}/{fromDate}/{toDate}")
	ResponseEntity<?> getDestination(@PathVariable("stateId") int stateId,
			@PathVariable("fromDate") Date fromDate,
			@PathVariable("toDate") Date toDate)
	{	
		List<DestiationCityHotelDto> destination=pkgImpl.getDestination(stateId,fromDate,toDate);
		return ResponseEntity.ok().body(destination);
	}
}
