package com.hyungwoo.realEstate.controller.implement;

import com.hyungwoo.realEstate.Interfaces.Code;
import com.hyungwoo.realEstate.controller.AuthController;
import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.request.SendCodeRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;
import com.hyungwoo.realEstate.dto.response.SendCodeResponseDto;
import com.hyungwoo.realEstate.service.AuthService;
import com.hyungwoo.realEstate.service.implement.AuthServiceImplement;
// 검증
// 검증 실패시 다시 보내기

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CheckIdResponseDto checkId(CheckidRequestDto request) {
		
		boolean validId = request.validId(); // 검증 실패시 반환
		if (!validId) return new CheckIdResponseDto(Code.VF, null);
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}
