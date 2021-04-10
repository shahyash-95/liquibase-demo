package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Actor;
import com.example.demo.repository.ActorRepository;

@RestController
@RequestMapping("/actors")
public class ActorsController {
	
	@Autowired
	private ActorRepository actorRepository;
	
	@GetMapping("/")
	public List<Actor> getAllActors() {
		return actorRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Actor getActorById(@PathVariable int id) {
		return actorRepository.findById(id).get();
	}
	
	@PostMapping("/")
	public Actor addActor(@RequestBody Actor actor) {
		return actorRepository.save(actor);
	}
	
}
