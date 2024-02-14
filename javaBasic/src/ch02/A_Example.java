package ch02;

// GalaxyPhone
// 제조사: (maker - String)
// 모델명: (modelName - String)
// 소유자: (owner - String)
// 전화번호: (telenumber - String)
// 전원상태: (power - boolean)

// 전원버튼누름 (onPower) - power 상태를 부정
// 전화걸기    (call) - power가 true일 때 "(상대방의 전화번호)로 전화를 겁니다." 출력
// 긴급전화걸기 (emergency) - "112로 전화를 겁니다." 출력
// 휴대전화정보보기 - (getInformation) - power가 true일때
//
// ===== (전화번호) =====
// 제조사: (제조사)
// 모델명: (모델명)
// 소유자: (소유자)
//
// 출력

class GalaxyPhone {
	static String maker;
	String modelName;
	String owner;
	String teleNumber;
	boolean power;
	
	void onPower () {
		power = !power;
	}
	
	void call (String toTeleNumber) {
		if (!power) return;
		System.out.println(toTeleNumber + "로 전화를 겁니다.");
	}

	static void emergency () {
		System.out.println("112로 전화를 겁니다.");
	}
	
	void getInformation() {
		if (!power) return;
		System.out.println("=====" + teleNumber + "=====");
		System.out.println("제조사 : " + maker);
		System.out.println("모델명 : " + modelName);
		System.out.println("소유자 : " + owner);
		System.out.println("//");
		
	}
}

// ==================0124==================== ▼▼▼▼▼

// Drama
// 방송사: (broadcasting company - String)
// 제목: (title - String)
// 배우: (actors - String[])
// 장르: (genre - String)
// 시청률: (viewerRaing - double)
// 부작: (series - int)

// 정보보기: getInformation
// =====(title)=====
// 방송사: (broadcasting company)
// 장르: (genre)
// 부작: (series)부작
// 시청률: (viewerRaing)%
// 배우 : (actor), (actor), (actor)...    전지현, 김수현, 박해진, 유인나

class Drama {
	String broadcastingCompany;
	String title;
	String[] actors;
	String genre;
	double viewerRaing;
	int series;
	
	void getInformation() {
		System.out.println("===== " + title + " =====");
		System.out.println("방송사 : " + broadcastingCompany);
		System.out.println("장르 : " + genre);
		System.out.println("부작 : " + series + " 부작");
		System.out.println("시청률 : " + viewerRaing + "%");
		System.out.print("배우 : ");
		for (int index = 0; index < actors.length; index++) {
			
//			System.out.print(actors[index]);
//			if (index < actors.length - 1) System.out.print(", ");
			
			// index < actors.length - 1
			// true - actors[index} + ", " / false - actors[index]
			
//		System.out.print(index < actors.length - 1 ? actors[index] + ", " : actors[index]); // 아래와 같은 결과값
			String actor = index < actors.length - 1 ? actors[index] + ", " : actors[index];
			System.out.print(actor);
		}
		System.out.println("");
	}
}

// TriangleMath(trigonometric function 삼각함수)
// 빗변 구하기 - getHypotenuse
// 둘레 구하기 - getCircumference
// sin 구하기 - getSin
// cos 구하기 - getCos
// tan 구하기 - getTan

class TriangleMath {
	
//	static final double PI = 3.14;
	
	static double getHypotenuse(int bottom, int height) {
		if (bottom <= 0 || height <= 0) return 0;
//		if (!(bottom > 0 && height > 0)); 위랑 같은 문장 (생각하기 나름)
		
		double result = Math.pow(bottom, 2) + Math.pow(height, 2); 
		return Math.sqrt(result); //sqrt(제곱근)
	}
	//=================================오버로드======================================
	// 오버로드 : 매개변수 이름은 같아야됨
	static double getCircumference(int height, int bottom, int hypotenuse) {
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse; // hypotenuse(빗변)
	}	
	
	static double getCircumference(double height, double bottom, double hypotenuse) {
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) return 0;
		return height + bottom + hypotenuse; //
	}
	//=================================오버로드======================================
	
	static double getSin(int height, int hypotenuse) {
		if (height <= 0 || hypotenuse <= 0) return 0;
		return height / hypotenuse;
	}
	
	static double getCos(int bottom, int hypotenuse) {
		if (bottom <= 0 || hypotenuse <= 0) return 0;
		return bottom / hypotenuse;
	}
	
	static double getTan(int height, int bottom) {
		if (bottom <= 0 || height <= 0) return 0;
		return height / bottom;
	}
	
}

//==================0124==================== ▲▲▲▲▲

public class A_Example {

	public static void main(String[] args) {
		
		GalaxyPhone s23 = new GalaxyPhone(); //<= 인스턴스를 생성
		GalaxyPhone s24 = new GalaxyPhone();
		
		GalaxyPhone.maker = "LG";
		
		// s23.maker = "SAMSUNG";
		s23.modelName = "s23";
		s23.owner = "홍길동";
		s23.teleNumber = "010-1234-5678";
		s23.power = false;
		
		// s24.maker = "SAMSUNG";
		s24.modelName = "s23";
		s24.owner = "김철수";
		s24.teleNumber = "010-8765-4321";
		s24.power = false;
		
		
		s23.onPower();
		s23.getInformation();
		
		GalaxyPhone.emergency();
		s23.emergency();
		s24.emergency();
	
// ==================0124==================== ▼▼▼▼
		
		Drama star = new Drama();
		
		star.broadcastingCompany = "SBS";
		star.title = "별에서 온 그대";
		star.actors = new String[] {"전지현", "김수현", "박해진", "유인나"};
		star.genre = "로맨틱 코미디, 판타지 로맨스, 어반 판타지, SF, 이능력, 사극";
		star.series = 21;
		star.viewerRaing = 28.1;

		star.getInformation();
		
		// star.serise;
		// star.getInformation();
		
		TriangleMath triangleMath = new TriangleMath();
		double bit = TriangleMath.getHypotenuse(3, 4);
		System.out.println(bit);
		
//		System.out.println(TriangleMath.PI);
//		TriangleMath.PI = 0.0;

	}

}
