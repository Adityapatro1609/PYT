package com.mindtree.pyt.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bill_details")
public class BillDetails {

	@Id
	int billId;
	
	@NotNull
	@Column(name = "from_date")
	Date fromDate;
	
	@NotNull
	@Column(name = "to_date")
	Date toDate;
	
	@Column(name = "number_of_people")
	int numberOfPeople;
	
	@Column(name = "effective_cost")
	int effectiveCost;
	
	@Column(name = "number_of_rooms")
	int numberOfRooms;
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "package_id", nullable = false)
	PackageDetails packageDetails;
	
	@OneToOne(mappedBy="billDetails")
	BillerDetails billerDetails;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "hotel_id", nullable = false)
	HotelDetails hotelDetails;

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public PackageDetails getPackageDetails() {
		return packageDetails;
	}

	public void setPackageDetails(PackageDetails packageDetails) {
		this.packageDetails = packageDetails;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public int getEffectiveCost() {
		return effectiveCost;
	}

	public void setEffectiveCost(int effectiveCost) {
		this.effectiveCost = effectiveCost;
	}

	public HotelDetails getHotelDetails() {
		return hotelDetails;
	}

	public void setHotelDetails(HotelDetails hotelDetails) {
		this.hotelDetails = hotelDetails;
	}

	public BillerDetails getBillerDetails() {
		return billerDetails;
	}

	public void setBillerDetails(BillerDetails billerDetails) {
		this.billerDetails = billerDetails;
	}

	public BillDetails() {
		//empty constructor for hibernate
	}
	
	
}

