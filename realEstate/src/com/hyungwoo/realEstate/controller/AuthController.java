package com.hyungwoo.realEstate.controller;

import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.request.SendCodeRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;
import com.hyungwoo.realEstate.dto.response.SendCodeResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckidRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);
}
