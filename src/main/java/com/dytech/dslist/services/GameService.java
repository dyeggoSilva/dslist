package com.dytech.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dytech.dslist.dto.GameMiniDTO;
import com.dytech.dslist.entities.Game;
import com.dytech.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMiniDTO> findAll(){
		List<Game> result = gameRepository.findAll(); 
		List<GameMiniDTO> dto = result.stream().map(x -> new GameMiniDTO(x)).toList();
		return dto;
		
	}

}
