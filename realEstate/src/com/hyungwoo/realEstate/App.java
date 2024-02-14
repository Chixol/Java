package com.hyungwoo.realEstate;

import java.util.Scanner;

import com.hyungwoo.realEstate.Interfaces.Code;
import com.hyungwoo.realEstate.controller.AuthController;
import com.hyungwoo.realEstate.dto.request.CheckidRequestDto;
import com.hyungwoo.realEstate.dto.response.CheckIdResponseDto;

// Controller (package / interface) : 입력과 출력을 담당하는 요소
// Service (package / interface) : 실제 비즈니스 로직 (연산)
// Repository (package / interface) : 데이터베이스 연결과 관련된 작업

// DTO (Data Transfer Object) : 데이터 전송을 위한 객체
// Entity : 데이터베이스의 테이블을 자바 클래스로 표현한 객체

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AuthController authcontroller = new AuthControllerImplement();
		
		while (true) {
			System.out.print("1. 회원가입 / 2. 로그인 / 3. 게시물 작성 / 4. 게시물 보기 / 5. 종료 : ");
			String input = scanner.nextLine();
			
			if (input.equals("1")) {
				// 1. 아이디 중복확인
				CheckidRequestDto checkIdRequest = new CheckidRequestDto();
				System.out.print("아이디 : ");
				String id = scanner.nextLine();
				checkIdRequest.setId(id);
				
				CheckIdResponseDto checkIdResponse = authController.checkId(checkIdRequest);
				Code code = checkIdResponse.getCode();
				
				if (code == Code.DI) {
					System.out.println("중복된 아이디입니다.");
					continue;
				}
				
				if (code == Code.DBE) {
					System.out.println("데이터베이스 에러입니다.");
					continue;
				}
				
				// 2. 이메일 인증 코드 전송
				// 3. 이메일 인증 처리
				// 4. 회원가입 처리
			};
			if (input.equals("2")) System.out.println("로그인");
			if (input.equals("3")) System.out.println("게시물 작성");
			if (input.equals("4")) System.out.println("보기");
			if (input.equals("5")) break;
		}
		
		System.out.println("프로그램 종료");
		
	}

}