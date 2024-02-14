package com.hyungwoo.realEstate.service;

import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckidRequestDto dto);
	
}
