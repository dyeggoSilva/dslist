package com.dytech.dslist.dto;

import com.dytech.dslist.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class GameMiniDTO {
	
	private long id;
	private String title;
	private int year;
	private double score;
	private String imgUrl;
	private String shortDescription;
	
	
	public GameMiniDTO(Game entitie) {
		super();
		this.id = entitie.getId();
		this.title = entitie.getTitle();
		this.year = entitie.getYear();
		this.score = entitie.getScore();
		this.imgUrl = entitie.getImgUrl();
		this.shortDescription = entitie.getShortDescription();
	}
	
	
}
