package com.mindtree.pyt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.pyt.entity.HotelDetails;

@Repository
public interface HotelRepository extends JpaRepository<HotelDetails,Integer> {
	
/*	@Query(value="select hotel_details_id,cost,hotel_name,number_of_rooms,rating,destination_id from hotel_details where destination_city_id in(select destination_city_id from destination_city where state_id := stateID)",nativeQuery=true)
	List<HotelDetails> getAvailabelHotelDetails(@Param("stateID") Integer stateID);*/
	
	@Query(value="select hotel_details_id,cost,hotel_name,number_of_rooms,rating,destination_city_id from hotel_details where destination_city_id in(select destination_city_id from destination_city where state_id = ?1)",nativeQuery=true)
	List<HotelDetails> getAvailabelHotelDetails(Integer stateID);
	
}
