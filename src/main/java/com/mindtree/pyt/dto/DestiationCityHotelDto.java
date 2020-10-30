package com.mindtree.pyt.dto;

public class DestiationCityHotelDto {

	private String destinationCityDtoName;
	private String destinationCityDtoUrl;
	
	private int availableHotelID;
	private String availableHotelName;
	
	private int hotelRating;
	private int availableRoom;
	
	
	public int getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}

	public int getAvailableRoom() {
		return availableRoom;
	}

	public void setAvailableRoom(int availableRoom) {
		this.availableRoom = availableRoom;
	}

	public int getAvailableHotelID() {
		return availableHotelID;
	}

	public void setAvailableHotelID(int availableHotelID) {
		this.availableHotelID = availableHotelID;
	}

	public String getAvailableHotelName() {
		return availableHotelName;
	}

	public void setAvailableHotelName(String availableHotelName) {
		this.availableHotelName = availableHotelName;
	}

	public String getDestinationCityDtoName() {
		return destinationCityDtoName;
	}

	public void setDestinationCityDtoName(String destinationCityDtoName) {
		this.destinationCityDtoName = destinationCityDtoName;
	}

	
	public String getDestinationCityDtoUrl() {
		return destinationCityDtoUrl;
	}

	public void setDestinationCityDtoUrl(String destinationCityDtoUrl) {
		this.destinationCityDtoUrl = destinationCityDtoUrl;
	}




}
