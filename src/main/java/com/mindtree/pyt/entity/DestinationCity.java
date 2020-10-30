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
@Table(name = "destination_city")
public class DestinationCity {
	@Id
	@Column(name = "destination_city_id")
	int destinationCityId;
	
	@NotNull
	@Column(name = "destination_city_name")
	String destinationCityName;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "state_id", nullable = false)
	State state;
	
	@OneToMany(mappedBy="destinationCity")
	List<PackageDetails> packageDetails;

	@OneToMany(mappedBy="destinationCity")
	List<HotelDetails> hotelDetails;
	
	@Column(name = "destination_city_image_url")
	String destinationCityImageUrl;
	
	public String getDestinationCityImageUrl() {
		return destinationCityImageUrl;
	}

	public void setDestinationCityImageUrl(String destinationCityImageUrl) {
		this.destinationCityImageUrl = destinationCityImageUrl;
	}

	public int getDestinationCityId() {
		return destinationCityId;
	}

	public void setDestinationCityId(int destinationCityId) {
		this.destinationCityId = destinationCityId;
	}

	public String getDestinationCityName() {
		return destinationCityName;
	}

	public void setDestinationCityName(String destinationCityName) {
		this.destinationCityName = destinationCityName;
	}


	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<PackageDetails> getPackageDetails() {
		return packageDetails;
	}

	public void setPackageDetails(List<PackageDetails> packageDetails) {
		this.packageDetails = packageDetails;
	}

	public List<HotelDetails> getHotelDetails() {
		return hotelDetails;
	}

	public void setHotelDetails(List<HotelDetails> hotelDetails) {
		this.hotelDetails = hotelDetails;
	}

	public DestinationCity() {
		//empty constructor for hibernate
	}

	
}
