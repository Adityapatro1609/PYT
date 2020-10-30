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
@Table(name = "package_details")
public class PackageDetails {
	@Id
	@Column(name = "package_id")
	int packageId;
	
	@NotNull
	@Column(name = "package_name")
	String packageName;
	
	@Column(name = "view_count")
	long viewCount;
	
	int cost;
	
	@OneToMany(mappedBy="packageDetails")
	List<GuestUserDetails> guestUserDetails;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "destination_city_id", nullable = false)
	DestinationCity destinationCity;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "package_type_id", nullable = false)
	PackageType packageType;
	
	@OneToMany(mappedBy="packageDetails")
	List<BillDetails> billDetails;
	
	public int getPackageId() {
		return packageId;
	}

	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public long getViewCount() {
		return viewCount;
	}

	public void setViewCount(long viewCount) {
		this.viewCount = viewCount;
	}

	public DestinationCity getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(DestinationCity destinationCity) {
		this.destinationCity = destinationCity;
	}

	public PackageType getPackageType() {
		return packageType;
	}

	public void setPackageType(PackageType packageType) {
		this.packageType = packageType;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	

	public List<GuestUserDetails> getGuestUserDetails() {
		return guestUserDetails;
	}

	public void setGuestUserDetails(List<GuestUserDetails> guestUserDetails) {
		this.guestUserDetails = guestUserDetails;
	}

	public List<BillDetails> getBillDetails() {
		return billDetails;
	}

	public void setBillDetails(List<BillDetails> billDetails) {
		this.billDetails = billDetails;
	}

	public PackageDetails() {
		//empty constructor for hibernate
	}
	
	
}
