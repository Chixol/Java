package com.hyungwoo.realEstate.service.implement;

import com.hyungwoo.realEstate.Interfaces.Code;
import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;
import com.hyungwoo.realEstate.repository.UserRepository;
import com.hyungwoo.realEstate.repository.implement.UserRepositoryImplement;
import com.hyungwoo.realEstate.service.AuthService;

public class AuthServiceImplement implements AuthService {

	private UserRepository userRepository = new UserRepositoryImplement();
	
	@Override
	public CheckIdResponseDto checkId(CheckidRequestDto dto) {
		
		CheckIdResponseDto result = new CheckIdResponseDto();
		
		try {
			
			String id = dto.getId();
			
			boolean existedId = userRepository.existsById(id);
			
			if (existedId) result.setCode(Code.DI);
			else result.setCode(Code.SU);
			
		} catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}

}
