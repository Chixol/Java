package com.hyungwoo.realEstate.service;

import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.request.SendCodeRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;
import com.hyungwoo.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckidRequestDto dto);
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);
}
