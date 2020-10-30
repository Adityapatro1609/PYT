package com.mindtree.pyt.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State {
	@Id
	@Column(name="state_id")
	int stateId;
	
	@Column(name="state_name")
	String stateName;
	
	@OneToMany(mappedBy="state")
	List<DestinationCity> destinationCity;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<DestinationCity> getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(List<DestinationCity> destinationCity) {
		this.destinationCity = destinationCity;
	}

	public State() {
		//empty constructor for hibernate
	}

	
}
