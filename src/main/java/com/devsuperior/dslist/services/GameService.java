package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRespository;
	
//	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRespository.findById(id).get();
		return new GameDTO(result);
	}
	
//	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRespository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
