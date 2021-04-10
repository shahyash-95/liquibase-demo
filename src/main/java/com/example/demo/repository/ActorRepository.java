package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
	
}