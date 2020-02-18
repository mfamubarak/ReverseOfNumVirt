package com.ahamed.myspringapp.repository;

import com.ahamed.myspringapp.model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation,Integer> {

}
