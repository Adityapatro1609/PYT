package com.mindtree.pyt.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="package_type")
public class PackageType {
	@Id
	@Column(name = "package_type_id")
	int packageTypeId;
	
	@NotNull
	@Column(name = "package_type_name")
	String packageTypeName;

	@OneToMany(mappedBy="packageType")
	List<PackageDetails> packageDetails;
	
	public int getPackageTypeId() {
		return packageTypeId;
	}

	public void setPackageTypeId(int packageTypeId) {
		this.packageTypeId = packageTypeId;
	}

	public String getPackageTypeName() {
		return packageTypeName;
	}

	public void setPackageTypeName(String packageTypeName) {
		this.packageTypeName = packageTypeName;
	}

	public List<PackageDetails> getPackageDetails() {
		return packageDetails;
	}

	public void setPackageDetails(List<PackageDetails> packageDetails) {
		this.packageDetails = packageDetails;
	}

	public PackageType() {
		//empty constructor for hibernate
	}

	
}
