package com.ahamed.myspringapp.repository;

import com.ahamed.myspringapp.model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllocationRepository extends JpaRepository<Allocation,Integer> {

}
