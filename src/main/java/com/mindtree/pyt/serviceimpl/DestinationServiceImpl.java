package com.mindtree.pyt.serviceimpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mindtree.pyt.dto.DestiationCityHotelDto;
import com.mindtree.pyt.entity.AvailableHotel;
import com.mindtree.pyt.entity.BillDetails;
import com.mindtree.pyt.entity.HotelDetails;
import com.mindtree.pyt.repository.BillRepository;
import com.mindtree.pyt.repository.HotelRepository;
import com.mindtree.pyt.service.DestinationService;

@Service
@EnableTransactionManagement
public class DestinationServiceImpl implements DestinationService {

	@Autowired
	BillRepository billRepository;
	@Autowired
	HotelRepository hotelRepository;


	public List<DestiationCityHotelDto> getDestination(int stateId, Date fromDate, Date toDate) {
		List<BillDetails> list = billRepository.getHotels(fromDate, toDate);
		List<HotelDetails> hotel = hotelRepository.getAvailabelHotelDetails(stateId);
		List<HotelDetails> tempHotel = hotelRepository.getAvailabelHotelDetails(stateId);
		int RoomBooked = hotel.get(0).getNumberOfRooms();
		List<AvailableHotel> ftable = new ArrayList<>();
		List<AvailableHotel> nonavailable = new ArrayList<>();
		List<DestiationCityHotelDto> dto = new ArrayList<>();
		AvailableHotel ft = new AvailableHotel();
		if (!list.isEmpty()) {
			for (BillDetails bt : list) {
				ft.setAvailableHotelId(bt.getHotelDetails().getHotelId());
				ft.setRoomBooked(bt.getNumberOfRooms());
				ft.setAvailableRooms(RoomBooked - ft.getRoomBooked());
				if (ft.getAvailableRooms() == 0) {
					for (HotelDetails hotelDetails : hotel) {
						if (ft.getAvailableHotelId() == hotelDetails.getHotelDetailsId()) {
							tempHotel.remove(hotelDetails);
						}
					}
				}
			}
		}
		for (HotelDetails hotelDetails : tempHotel) {
			DestiationCityHotelDto dtoObj = new DestiationCityHotelDto();
			dtoObj.setAvailableHotelID(hotelDetails.getHotelDetailsId());
			dtoObj.setAvailableHotelName(hotelDetails.getHotelName());
			dtoObj.setDestinationCityDtoName(hotelDetails.getDestinationCity().getDestinationCityName());
			dtoObj.setDestinationCityDtoUrl(hotelDetails.getDestinationCity().getDestinationCityImageUrl());
			dtoObj.setHotelRating(hotelDetails.getRating());
			if(ft.getAvailableHotelId() == hotelDetails.getHotelDetailsId())
			dtoObj.setAvailableRoom(ft.getAvailableRooms());
			else
				dtoObj.setAvailableRoom(hotelDetails.getNumberOfRooms());	
			dto.add(dtoObj);
		}
		return dto;
	}

	@Override
	public List<HotelDetails> getAvailabelHotelDetails(int stateID) {
		return null;
	}

	@Override
	public List<BillDetails> getHotels(Date fromDate, Date toDate) {
		return null;
	}
}
