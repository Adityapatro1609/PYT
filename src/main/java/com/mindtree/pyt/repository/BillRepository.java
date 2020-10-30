package com.mindtree.pyt.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mindtree.pyt.entity.BillDetails;

@Repository
public interface BillRepository extends JpaRepository<BillDetails, Integer>{
	
/*	@Query(value="select bill_id,effective_cost,from_date,sum(number_of_people) as number_of_people,to_date,hotel_id,package_id,sum(number_of_rooms) as number_of_rooms from bill_details where from_date >= :fromDate  and to_date <= :toDate group by hotel_id",nativeQuery=true)
	List<BillDetails> getHotels(
			@Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate);*/
	@Query(value="select bill_id,effective_cost,from_date,sum(number_of_people) as number_of_people,to_date,hotel_id,package_id,sum(number_of_rooms) as number_of_rooms from bill_details where from_date >= ?1 and to_date <= ?2 group by hotel_id",nativeQuery=true)
	List<BillDetails> getHotels(Date fromDate,Date toDate);
}


/*@Query("SELECT u FROM User u WHERE u.status = ?1 and u.name = ?2")
User findUserByStatusAndName(Integer status, String name);*/