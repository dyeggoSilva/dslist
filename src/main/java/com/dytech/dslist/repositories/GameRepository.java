package com.dytech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dytech.dslist.entities.Game;

public interface GameRepository  extends JpaRepository<Game, Long>{

}
