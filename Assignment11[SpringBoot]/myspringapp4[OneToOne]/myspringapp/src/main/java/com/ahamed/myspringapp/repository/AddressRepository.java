package com.ahamed.myspringapp.repository;

import com.ahamed.myspringapp.model.Address;
import com.ahamed.myspringapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
