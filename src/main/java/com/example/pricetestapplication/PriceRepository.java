package com.example.pricetestapplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

}
