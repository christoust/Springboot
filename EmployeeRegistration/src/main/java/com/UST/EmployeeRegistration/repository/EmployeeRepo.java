package com.UST.EmployeeRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.EmployeeRegistration.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer > // here employee is the entity class and Integer is the data type of primary key
{
	
	

}
