package com.hyungwoo.realEstate.controller.implement;

import com.hyungwoo.realEstate.controller.AuthController;
import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;
import com.hyungwoo.realEstate.service.AuthService;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;

	@Override
	public CheckIdResponseDto checkId(CheckidRequestDto request) {
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

}
