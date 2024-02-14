package com.hyungwoo.realEstate.dto.request;

public class CheckidRequestDto {

	private String id;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean validId() { //반환
		boolean valid = id.length() <= 20;
		return valid;
	}
}
