package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Customers;


@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
    public Customers findByCustomerId(int id);
}