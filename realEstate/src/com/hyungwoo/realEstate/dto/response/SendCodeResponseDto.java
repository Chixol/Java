package com.hyungwoo.realEstate.dto.response;

import com.hyungwoo.realEstate.Interfaces.Code;

public class SendCodeResponseDto {

	private Code code;
	private String data;
	
	public SendCodeResponseDto() {}
	
	public SendCodeResponseDto(Code code, String data) {
		super();
		this.code = code;
		this.data = data;
	}
	
	public Code getCode() {
		return code;
	}
	
	public void setCode(Code code) {
		this.code = code;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	
	
}
