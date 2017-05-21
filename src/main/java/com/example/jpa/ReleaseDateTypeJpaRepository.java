package com.example.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseDateTypeJpaRepository extends JpaRepository<ReleaseDateType, String> {
	public List<ReleaseDateType> findByCacheMedia_AcctNum(String  name); 
}