package ch02; 

// 캡슐화: 맴버 변수(속성)와 메서드를 묶어서 변수에 대한 조작을 메서드를 통해서만 할 수 있도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성을 보장할 수 있음
class FootballPlayerB {
	private String name; // 외워 그냥 무결성 private 해야해 근데 초기화를 못하잖아? setter 보고와라
	private String birth;
	private String team; // get 메서드(필드명)로 가져와서 써야한다 = getter 메서드 쓰고 return 으로 반환
	private int goal;

	
	FootballPlayerB (String name, String birth, String team, int goal) {
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	
	String getName () {
		return this.name;
	}

	String getbirth () { // 생일은 절대 안바뀌는 타입이니까 setter(set 필드명)를 안만드는거야 뭔말알?
		return this.birth;
	}
	
	String getTeam () {
		return this.team;
	}
	
	int getGoal () {
		return this.goal;
	}
	
	void setname (String name) { // set(필드명) 메서드 를 쓰면 변경가능하다~
		this.name = name;		// 반환타입이라 그냥 this 쓰는거다
	}
	
	void setTeam (String team) {
		this.team = team;
	}
	
	void setGoal (int goal) { // 예를 들어 골은 음수가 안될건디 set 문을 거치면 음수로 떨어지는걸 막잖아?
		if (goal < 0) return; // 그러면 정확한 값만 나올 수 있는거야 뭔말알? 이게 무결성 G.O.A.T
		this.goal = goal;
	}
}

// *시험
// 배웠던 객체지향 나옴 (상속, 캡슐화, 다형성(오버로드, 오버라이드), 추상화)를 전부다 섞어서 하나의 인스턴스를 만드는...ㅠ
// 객체를 안써되는 로직 (switch는 안나옴)ㅠ

class FootballPlayerC {
	private String name;
	private String birth;
	private String team;
	private int goal;
	
	FootballPlayerC(String name, String birth, String team, int goal) {
//		super(); // 최상위는 Object 잊지마쇼 쓰면 super가 따라오긴 하는데 궂이 안써도 되긴함
		this.name = name;
		this.birth = birth;
		this.team = team;
		this.goal = goal;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getTeam() {
		return team;
	}
	void setTeam(String team) {
		this.team = team;
	}
	int getGoal() {
		return goal;
	}
	void setGoal(int goal) {
		this.goal = goal;
	}
	String getBirth() {
		return birth;
	}
	
}

public class E_Encapsulation {

	public static void main(String[] args) {
		
		FootballPlayerB son = new FootballPlayerB("손흥민", "920708", "토트텀 홋스퍼", 0);
//		son.name = "손흥민";
//		son.team = "토트넘 홋스퍼";
//		son.goal = 0;
		
		son.setGoal(-1); // 요걸로 값 변경해쥬는거다~
		
//=============출력==============
		System.out.println(son.getName());
		System.out.println(son.getTeam());
		System.out.println(son.getGoal());
		
	}

}
