package com.mindtree.pyt.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "hotel_details")
public class HotelDetails {

	@Id
	@Column(name = "hotel_details_id")
	int hotelDetailsId;
	
	@NotNull
	@Column(name = "hotel_name")
	String hotelName;
	
	int cost;
	
	int rating;
	
	@Column(name = "number_of_rooms")
	int numberOfRooms;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "destination_city_id", nullable = false)
	DestinationCity destinationCity;
	
	//me
	@OneToMany(mappedBy="hotelDetails")
	List<BillDetails> billDetails;

	public int getHotelId() {
		return hotelDetailsId;
	}

	public void setHotelId(int hotelId) {
		this.hotelDetailsId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public DestinationCity getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(DestinationCity destinationCity) {
		this.destinationCity = destinationCity;
	}

	public int getHotelDetailsId() {
		return hotelDetailsId;
	}

	public void setHotelDetailsId(int hotelDetailsId) {
		this.hotelDetailsId = hotelDetailsId;
	}

	public List<BillDetails> getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(List<BillDetails> billDetails) {
		this.billDetails = billDetails;
	}

	public HotelDetails() {
		//empty constructor for hibernate
	}
	
	

}
