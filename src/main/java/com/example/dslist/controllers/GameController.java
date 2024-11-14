package com.example.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.entities.Game;
import com.example.dslist.services.GameService;

// Quem implementa a API é o controlador, o front end consome o endpoint do backend por meio da API

@RestController
@RequestMapping(value = "/games")
public class GameController {
	@Autowired 
	private GameService gameService;
	
	@GetMapping 
	public List<Game> findAll(){
		return gameService.findAll();
	}
}
