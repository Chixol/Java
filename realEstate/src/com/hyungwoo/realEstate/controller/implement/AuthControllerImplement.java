package com.hyungwoo.realEstate.controller.implement;

import com.hyungwoo.realEstate.Interfaces.Code;
import com.hyungwoo.realEstate.controller.AuthController;
import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;
import com.hyungwoo.realEstate.service.AuthService;
import com.hyungwoo.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService = new AuthServiceImplement();

	@Override
	public CheckIdResponseDto checkId(CheckidRequestDto request) {
		
		boolean validId = request.validId();
		if (!validId) return new CheckIdResponseDto(Code.VF,null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

}
