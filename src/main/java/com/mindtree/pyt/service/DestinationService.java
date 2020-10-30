package com.mindtree.pyt.service;

import java.sql.Date;
import java.util.List;
import com.mindtree.pyt.dto.DestiationCityHotelDto;
import com.mindtree.pyt.entity.BillDetails;
import com.mindtree.pyt.entity.HotelDetails;

public interface DestinationService {

	public List<DestiationCityHotelDto> getDestination(int stateId,Date fromDate,Date toDate);
	public List<HotelDetails> getAvailabelHotelDetails(int stateID);
	public List<BillDetails> getHotels(Date fromDate,Date toDate);
}
