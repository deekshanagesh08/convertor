package com.ibm.convertor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.convertor.model.Convertor;


public interface ControllorRepository extends JpaRepository<Convertor, Long> {



}
