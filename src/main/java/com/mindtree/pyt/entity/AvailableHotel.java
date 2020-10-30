package com.mindtree.pyt.entity;

public class AvailableHotel {

	private int availableHotelId;
	private int roomBooked;
	private int availableRooms;
	
	public int getRoomBooked() {
		return roomBooked;
	}
	public void setRoomBooked(int roomBooked) {
		this.roomBooked = roomBooked;
	}
	public int getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}
	public int getAvailableHotelId() {
		return availableHotelId;
	}
	public void setAvailableHotelId(int availableHotelId) {
		this.availableHotelId = availableHotelId;
	}

}
