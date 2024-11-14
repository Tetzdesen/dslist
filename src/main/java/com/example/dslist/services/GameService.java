package com.example.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dslist.entities.Game;
import com.example.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired // injeção de depedencia pelo spring
	private GameRepository gameRepository;

	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}
	
}
