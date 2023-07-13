package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String short_description;


	public GameMinDTO(){
		
	}


	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getGenre();
		year = entity.getYear();
		imgUrl = entity.getGenre();
		short_description = entity.getShorDescription();
	}


	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShort_description() {
		return short_description;
	}
	

}
